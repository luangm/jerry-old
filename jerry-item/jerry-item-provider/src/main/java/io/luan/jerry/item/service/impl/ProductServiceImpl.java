package io.luan.jerry.item.service.impl;

import io.luan.jerry.category.domain.Category;
import io.luan.jerry.category.service.CategoryService;
import io.luan.jerry.item.converter.ProductConverter;
import io.luan.jerry.item.dao.ProductDAO;
import io.luan.jerry.item.domain.Product;
import io.luan.jerry.item.po.ProductPO;
import io.luan.jerry.item.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Autowired
    private ProductConverter productConverter;

    @Autowired
    private CategoryService categoryService;

    @Override
    public Product getProduct(Long productId) {
        if (productId == null) {
            return null;
        }

        ProductPO productPO = productDAO.getProduct(productId);
        if (productPO == null) {
            return null;
        }

        Product product = productConverter.convert(productPO);

        if (product.getCategoryId() != null) {
            Category category = categoryService.getCategory(product.getCategoryId());
            product.setCategory(category);
        }

        return product;
    }
}
