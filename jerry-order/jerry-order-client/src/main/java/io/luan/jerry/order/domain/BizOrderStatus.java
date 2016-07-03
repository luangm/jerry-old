package io.luan.jerry.order.domain;

import lombok.Getter;

/**
 * @author Guangmiao Luan
 * @since 7/3/2016
 */
public enum BizOrderStatus {
    Invisible(0, "Invisible"),
    Enabled(1, "Enabled");

    @Getter
    private int index;

    @Getter
    private String name;

    BizOrderStatus(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public static BizOrderStatus getByIndex(int index) {
        for (BizOrderStatus item : BizOrderStatus.values()) {
            if (item.index == index) {
                return item;
            }
        }
        return null;
    }
}
