package io.luan.jerry.item.converter;

import io.luan.jerry.item.domain.Product;
import io.luan.jerry.item.po.ProductPO;
import org.springframework.stereotype.Component;

/**
 * @author Guangmiao Luan
 * @since 7/2/2016
 */
@Component
public class ProductConverter {

    public Product convert(ProductPO po) {
        Product product = new Product();

        product.setId(po.getId());
        product.setName(po.getName());
        product.setCategoryId(po.getCategoryId());

        return product;
    }
}
