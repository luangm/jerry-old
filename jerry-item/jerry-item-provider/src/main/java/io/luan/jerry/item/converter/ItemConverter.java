package io.luan.jerry.item.converter;

import io.luan.jerry.item.domain.Item;
import io.luan.jerry.item.po.ItemPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Miao on 6/25/2016.
 */
@Component
public class ItemConverter {

    public Item convert(ItemPO itemPO) {
        Item item = new Item();

        item.setId(itemPO.getId());
        item.setProductId(itemPO.getProductId());
        item.setSellerId(itemPO.getSellerId());

        return item;
    }
}
