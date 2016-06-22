package io.luan.jerry.category.domain;

import lombok.Data;

/**
 * Data Object for Category
 */
@Data
public class CategoryDO {
    private Long categoryId;
    private Long parentId;
    private String name;
}
