package io.luan.jerry.item.assembler;

import io.luan.jerry.category.sdo.Category;
import io.luan.jerry.category.service.CategoryService;
import io.luan.jerry.item.domain.ProductDO;
import io.luan.jerry.item.sdo.ProductSDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Miao on 6/25/2016.
 */
@Component
public class ProductAssembler {

    @Autowired
    private CategoryService categoryService;

    public ProductSDO assemble(ProductDO product) {
        ProductSDO sdo = new ProductSDO();

        if (product.getCategoryId() != null) {
            Category category = categoryService.getCategory(product.getCategoryId());
            sdo.setCategoryId(product.getCategoryId());
            sdo.setCategory(category);
        }

        sdo.setName(product.getName());

        return sdo;
    }
}
