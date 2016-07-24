package io.luan.jerry.category.infrastructure.converter;

import io.luan.jerry.category.data.po.CategoryPO;
import io.luan.jerry.category.domain.model.Category;
import io.luan.jerry.category.domain.model.impl.CategoryImpl;
import org.springframework.stereotype.Component;

/**
 * Transform CategoryDO to/from Category
 */
@Component
public class CategoryConverter {

    public Category convert(CategoryPO po) {
        CategoryImpl category = new CategoryImpl();

        category.setId(po.getId_category());
        category.setName(po.getName());
        category.setParentId(po.getParent_id());
        category.setSortOrder(po.getSort_order());
        category.setChildCount(po.getChild_count());
        category.setDeleted(po.getDeleted());
        category.setCreateTime(po.getCreate_time());
        category.setUpdateTime(po.getUpdate_time());

        return category;
    }

    public CategoryPO convert(Category category) {
        CategoryPO po = new CategoryPO();

        po.setId_category(category.getId());

        if (category.getName() != null) {
            po.setName(category.getName());
        }

        if (category.getParentId() != null) {
            po.setParent_id(category.getParentId());
        }

        if (category.getSortOrder() != null) {
            po.setSort_order(category.getSortOrder());
        }

        po.setDeleted(category.isDeleted());

        if (category.getCreateTime() != null) {
            po.setCreate_time(category.getCreateTime());
        }

        if (category.getUpdateTime() != null) {
            po.setUpdate_time(category.getUpdateTime());
        }

        return po;
    }
}
