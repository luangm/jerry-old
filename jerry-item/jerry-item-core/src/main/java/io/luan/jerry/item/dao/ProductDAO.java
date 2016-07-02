package io.luan.jerry.item.dao;

import io.luan.jerry.item.po.ProductPO;

/**
 * Created by Miao on 6/26/2016.
 */
public interface ProductDAO {
    ProductPO getProduct(Long productId);
}
