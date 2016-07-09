package io.luan.jerry.item.domain;

import io.luan.jerry.category.domain.Category;
import io.luan.jerry.user.domain.User;
import lombok.Data;

import javax.annotation.Nullable;
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

    private String title;

    /**
     * SPU (if exists)
     */
    @Nullable
    private Long productId;
    @Nullable
    private Product product;

    private Long sellerId;
    @Nullable
    private User seller;

    /**
     * Redundant from Product
     */
    private Integer categoryId;
    @Nullable
    private Category category;

    private List<Sku> skuList;
}
