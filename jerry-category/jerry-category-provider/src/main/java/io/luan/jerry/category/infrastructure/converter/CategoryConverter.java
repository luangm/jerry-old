package io.luan.jerry.category.infrastructure.converter;

import io.luan.jerry.category.data.po.CategoryPO;
import io.luan.jerry.category.domain.model.Category;
import org.springframework.stereotype.Component;

/**
 * Transform CategoryDO to/from Category
 */
@Component
public class CategoryConverter {

    public Category convert(CategoryPO po) {
        Category category = new Category();

        category.setId(po.getId());
        category.setName(po.getName());
        category.setParentId(po.getParentId());
        category.setSortOrder(po.getSortOrder());
        category.setChildCount(po.getChildCount());

        return category;
    }
}
