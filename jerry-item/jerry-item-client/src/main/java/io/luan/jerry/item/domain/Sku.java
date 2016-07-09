package io.luan.jerry.item.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * SKU - Variation of an Item
 * Contains Inventory, Attributes
 */
@Data
public class Sku implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * Description of the sku,
     */
    private String skuTitle;

    private Long itemId;
    private Item item;

    /**
     * Inventory count
     */
    private Long inventory;

    /**
     * Current unit price
     */
    private Long price;
}
