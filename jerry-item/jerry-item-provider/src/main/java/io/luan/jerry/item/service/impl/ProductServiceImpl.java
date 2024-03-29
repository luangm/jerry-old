package io.luan.jerry.item.service.impl;

import io.luan.jerry.category.domain.model.Category;
import io.luan.jerry.category.domain.repository.CategoryRepository;
import io.luan.jerry.item.converter.ProductConverter;
import io.luan.jerry.item.dao.ProductDAO;
import io.luan.jerry.item.domain.Product;
import io.luan.jerry.item.po.ProductPO;
import io.luan.jerry.item.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Guangmiao Luan
 * @since 7/2/2016
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Autowired
    private ProductConverter productConverter;

    @Autowired
    private CategoryRepository categoryRepository;

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
            Category category = categoryRepository.getCategory(product.getCategoryId());
            product.setCategory(category);
        }

        return product;
    }
}
