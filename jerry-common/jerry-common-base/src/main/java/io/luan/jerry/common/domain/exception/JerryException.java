package io.luan.jerry.common.domain.exception;

/**
 * @author Miao
 * @since 7/16/2016.
 */
public class JerryException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public JerryException() {
        super();
    }

    public JerryException(String message) {
        super(message);
    }

    public JerryException(Throwable cause) {
        super(cause);
    }
}
