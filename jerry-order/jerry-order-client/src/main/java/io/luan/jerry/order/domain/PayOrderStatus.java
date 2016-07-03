package io.luan.jerry.order.domain;

import lombok.Getter;

/**
 * @author Guangmiao Luan
 * @since 7/3/2016
 */
public enum PayOrderStatus {

    /**
     * The Pay Order is not created
     */
    NoOrder(0, "NoOrder"),

    /**
     * The Pay Order is created but not yet paid
     */
    NotPaid(1, "NotPaid"),

    /**
     * The Pay order is paid
     */
    Paid(2, "Paid"),

    /**
     * The pay order is refuned
     */
    Refunded(3, "Refunded"),

    /**
     * The pay order is closed by system
     */
    Closed(9, "Closed");

    @Getter
    private int index;

    @Getter
    private String name;

    PayOrderStatus(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public static PayOrderStatus getByIndex(int index) {
        for (PayOrderStatus item : PayOrderStatus.values()) {
            if (item.index == index) {
                return item;
            }
        }
        return null;
    }
}
