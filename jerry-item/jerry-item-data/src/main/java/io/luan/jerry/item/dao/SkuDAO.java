package io.luan.jerry.item.dao;

import io.luan.jerry.item.po.SkuPO;

import java.util.List;

/**
 * Created by Miao on 6/26/2016.
 */
public interface SkuDAO {
    SkuPO getSku(Long skuId);

    List<SkuPO> getSkusByItemId(Long itemId);
}
