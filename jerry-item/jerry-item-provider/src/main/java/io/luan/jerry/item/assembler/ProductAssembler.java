package io.luan.jerry.item.assembler;

import io.luan.jerry.category.domain.Category;
import io.luan.jerry.category.service.CategoryService;
import io.luan.jerry.item.domain.Product;
import io.luan.jerry.item.po.ProductPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Miao on 6/25/2016.
 */
@Component
public class ProductAssembler {

    @Autowired
    private CategoryService categoryService;

    public Product assemble(ProductPO product) {
        Product sdo = new Product();

        if (product.getCategoryId() != null) {
            Category category = categoryService.getCategory(product.getCategoryId());
            sdo.setCategoryId(product.getCategoryId());
            sdo.setCategory(category);
        }

        sdo.setName(product.getName());

        return sdo;
    }
}
