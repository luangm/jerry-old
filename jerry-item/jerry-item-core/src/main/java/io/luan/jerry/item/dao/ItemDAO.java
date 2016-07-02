package io.luan.jerry.item.dao;

import io.luan.jerry.item.po.ItemPO;

/**
 * Created by Miao on 6/26/2016.
 */
public interface ItemDAO {
    ItemPO getItem(Long itemId);
}
