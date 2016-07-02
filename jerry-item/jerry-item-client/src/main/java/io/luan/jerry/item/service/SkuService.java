package io.luan.jerry.item.service;

import io.luan.jerry.item.domain.Sku;

import java.util.List;

/**
 * @author Guangmiao Luan
 * @since 7/2/2016
 */
public interface SkuService {

    Sku getSku(Long skuId);

    List<Sku> getSkusByItemId(Long itemId);
}
