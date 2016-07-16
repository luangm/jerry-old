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

        category.setId(po.getCategory_id());
        category.setName(po.getName());
        category.setParentId(po.getParent_id());
        category.setSortOrder(po.getSort_order());
        category.setChildCount(po.getChild_count());

        return category;
    }

    public CategoryPO convert(Category category) {
        CategoryPO po = new CategoryPO();

        if (category.getId() != null) {
            po.setCategory_id(category.getId());
        }

        if (category.getName() != null) {
            po.setName(category.getName());
        }

        if (category.getParentId() != null) {
            po.setParent_id(category.getParentId());
        }

        if (category.getSortOrder() != null) {
            po.setSort_order(category.getSortOrder());
        }

        return po;
    }
}
