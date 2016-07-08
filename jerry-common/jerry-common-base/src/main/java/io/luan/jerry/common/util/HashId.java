package io.luan.jerry.common.util;

public class HashId {

    private static final double GUARD_DIV = 12;

    private String salt = "Th1s ist Mai S6ls";
    private int minHashLength = 8;
    private String Alphabet = "abcdefghijklmnopqrstuvwxyz1234567890";
    private String Seperators = "cfhistu";
    private String Guards = "";

    public HashId(String salt, int minLength) {
        if (salt != null) {
            this.salt = salt;
        }
        if (minLength >= 0) {
            this.minHashLength = minLength;
        }

        // Remove Seperators from Alphabet
        for (char c : Seperators.toCharArray()) {
            int j = Alphabet.indexOf(c);
            Alphabet = Alphabet.substring(0, j) + "" + Alphabet.substring(j + 1);
        }

        //	System.out.println(Alphabet);

        Seperators = consistentShuffle(Seperators, this.salt);
        Alphabet = consistentShuffle(Alphabet, this.salt);

        //	System.out.println(Seperators);
        ///	System.out.println(Alphabet);

        int guardCount = (int) Math.ceil(Alphabet.length() / GUARD_DIV);
        Guards = Alphabet.substring(0, guardCount);
        Alphabet = Alphabet.substring(guardCount);

        //	System.out.println(Guards);
        //	System.out.println(Alphabet);
    }

    private static String consistentShuffle(String alphabet, String salt) {
        int v = 0;
        int p = 0;

        for (int i = alphabet.length() - 1; i > 0; i--, v++) {
            v %= salt.length();
            p += salt.charAt(v);
            int j = (salt.charAt(v) + v + p) % i;
            String temp = alphabet.charAt(j) + "";
            alphabet = alphabet.substring(0, j) + alphabet.charAt(i) + alphabet.substring(j + 1);
            alphabet = alphabet.substring(0, i) + temp + alphabet.substring(i + 1);
        }

        return alphabet;
    }

    private static String hash(long input, String alphabet) {
        String hash = "";
        int alphabetLength = alphabet.length();
        do {
            int j = (int) (input % alphabetLength);
            hash = alphabet.charAt(j) + hash;
            input /= alphabetLength;
        } while (input > 0);
        return hash;
    }

    private static long unhash(String input, String alphabet) {
        long number = 0;
        for (int i = 0; i < input.length(); i++) {
            int pos = alphabet.indexOf(input.charAt(i));
            number += pos * (long) Math.pow(alphabet.length(), input.length() - i - 1);
        }
        return number;
    }

    public Long decode(String hash) {
        // Enforce Min Length
        if (hash == null || (minHashLength >= 0 && hash.length() < minHashLength)) {
            return null;
        }
        long dec = decodeInternal(hash, Alphabet);
        if (dec < 0) {
            return null;
        }

        // Re-encode to verify
        String enc = encode(dec);
        return enc.equals(hash) ? dec : null;
    }

    public String encode(long number) {
        return encodeInternal(number);
    }

    private long decodeInternal(String hash, String alphabet) {
        int i = 0;
        long result = -1;

        for (char guardChar : Guards.toCharArray()) {
            hash = hash.replace(guardChar, ' ');
        }
        String[] hashArray = hash.split(" ");
        if (hashArray.length == 2 || hashArray.length == 3) {
            i = 1;
        }

        hash = hashArray[i];

        if (hash.length() > 0) {
            char lottery = hash.charAt(0);
            hash = hash.substring(1);

            String buffer = lottery + salt + alphabet;
            String newAlphabet = consistentShuffle(alphabet, buffer.substring(0, alphabet.length()));

            result = unhash(hash, newAlphabet);
        }

        return result;
    }

    private String encodeInternal(long number) {
        String ret;
        String lottery;
        String newAlphabet = Alphabet;

        int numbersHashInt = (int) (number % 100);

        lottery = ret = Alphabet.charAt(numbersHashInt % Alphabet.length()) + "";

        String buffer = lottery + salt + newAlphabet;
        newAlphabet = consistentShuffle(newAlphabet, buffer.substring(0, newAlphabet.length()));
        String last = hash(number, newAlphabet);
        ret += last;

        if (ret.length() < minHashLength) {
            int guardIndex = (numbersHashInt + ret.charAt(0)) % Guards.length();
            char guard = Guards.charAt(guardIndex);
            ret = guard + ret;
            if (ret.length() < minHashLength) {
                guardIndex = (numbersHashInt + ret.charAt(2)) % Guards.length();
                guard = Guards.charAt(guardIndex);
                ret += guard;
            }
        }

        int halfLength = newAlphabet.length() / 2;

        while (ret.length() < minHashLength) {
            newAlphabet = consistentShuffle(newAlphabet, newAlphabet);
            ret = newAlphabet.substring(halfLength) + ret + newAlphabet.substring(0, halfLength);
            int excess = ret.length() - minHashLength;
            if (excess > 0) {
                ret = ret.substring(excess / 2, excess / 2 + minHashLength);
            }
        }
        return ret;
    }
}
