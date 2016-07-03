package io.luan.jerry.order.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Guangmiao Luan
 * @since 7/3/2016
 */
@Data
public class BizOrderLine implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Long bizOrderId;
    private Long itemId;
    private Long skuId;

    /**
     * The number of items bought in this line
     */
    private Integer quantity;

    /**
     * The price paid for the item, may be the same as Sku.unitPrice
     * unit is in cents
     */
    private Long unitPrice;

    /**
     * The title copied from the item, for snapshot
     */
    private String itemTitle;

    /**
     * The title copied from sku, for snapshot.
     * This is like subtitle to itemTitle
     */
    private String skuTitle;

}
