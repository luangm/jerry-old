package io.luan.jerry.category.assembler;

import io.luan.jerry.category.domain.Category;
import io.luan.jerry.category.po.CategoryPO;
import org.springframework.stereotype.Component;

/**
 * Transform CategoryDO to/from Category
 */
@Component
public class CategoryAssembler {

    public Category assemble(CategoryPO po) {
        Category category = new Category();
        category.setId(po.getCategoryId());
        category.setName(po.getName());
        category.setParentId(po.getParentId());

        if (po.getChildren() != null) {
            for (CategoryPO child : po.getChildren()) {
                Category childSdo = assemble(child);
                category.getChildren().add(childSdo);
            }
        }

        return category;
    }
}
