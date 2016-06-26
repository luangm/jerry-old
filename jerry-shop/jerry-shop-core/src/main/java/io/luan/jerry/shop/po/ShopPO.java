package io.luan.jerry.shop.po;

import lombok.Data;

import java.io.Serializable;

/**
 * Data Object for Shop
 */
@Data
public class ShopPO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Long ownerId;
}
