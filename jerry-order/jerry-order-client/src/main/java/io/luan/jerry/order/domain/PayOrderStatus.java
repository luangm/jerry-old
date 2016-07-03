package io.luan.jerry.order.domain;

import lombok.Getter;

/**
 * @author Guangmiao Luan
 * @since 7/3/2016
 */
public enum PayOrderStatus {

    /**
     * The Logistics Order is not yet created
     */
    NotCreated(0, "NotCreated"),

    /**
     * The Logistics Order is created
     */
    Created(1, "Created");

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
