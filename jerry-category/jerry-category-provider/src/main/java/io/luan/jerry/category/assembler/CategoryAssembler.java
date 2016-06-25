package io.luan.jerry.category.assembler;

import io.luan.jerry.category.domain.CategoryDO;
import io.luan.jerry.category.sdo.Category;
import org.springframework.stereotype.Component;

/**
 * Transform CategoryDO to/from Category
 */
@Component
public class CategoryAssembler {

    public Category assemble(CategoryDO categoryDO) {
        Category sdo = new Category();
        sdo.setCategoryId(categoryDO.getCategoryId());
        sdo.setName(categoryDO.getName());
        sdo.setParentId(categoryDO.getParentId());

        if (categoryDO.getChildren() != null) {
            for (CategoryDO child : categoryDO.getChildren()) {
                Category childSdo = assemble(child);
                sdo.getChildren().add(childSdo);
            }
        }

        return sdo;
    }
}
