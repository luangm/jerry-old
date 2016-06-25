package io.luan.jerry.item.sdo;

import io.luan.jerry.category.sdo.Category;
import lombok.Data;

/**
 * SPU - Seller Independent
 */
@Data
public class ProductSDO {
    private Long productId;
    private Integer categoryId;
    private Category category;
    private String name;
}
