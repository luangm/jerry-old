package io.luan.jerry.item.domain;

import io.luan.jerry.user.domain.User;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Item - Product for a seller
 * <p>
 * The item has a detail page where it will display a list of skus for this item
 */
@Data
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long productId;
    private Product product;

    private Long sellerId;
    private User seller;

    private List<Sku> skuList;
}
