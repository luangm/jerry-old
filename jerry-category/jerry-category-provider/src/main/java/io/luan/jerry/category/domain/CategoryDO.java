package io.luan.jerry.category.domain;

import io.luan.jerry.common.domain.BaseDO;
import lombok.Data;

import java.util.List;

/**
 * Data Object for Category
 */
@Data
public class CategoryDO extends BaseDO {
    private Integer categoryId;
    private Integer parentId;
    private String name;
    private List<CategoryDO> children;
}
