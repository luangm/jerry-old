package io.luan.jerry.item.domain;

import io.luan.jerry.shop.domain.Shop;
import lombok.Data;

import java.io.Serializable;

/**
 * Item - Product for a seller
 */
@Data
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long productId;
    private Product product;

    private Long sellerId;
    private Shop seller;

}
