package io.luan.jerry.item.domain;

import io.luan.jerry.category.domain.Category;
import lombok.Data;

import java.io.Serializable;

/**
 * SPU - Seller Independent
 */
@Data
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer categoryId;
    private Category category;

    private String name;
}
