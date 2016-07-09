package io.luan.jerry.item.converter;

import io.luan.jerry.item.domain.Item;
import io.luan.jerry.item.po.ItemPO;
import org.springframework.stereotype.Component;

/**
 * @author Guangmiao Luan
 * @since 7/2/2016
 */
@Component
public class ItemConverter {

    public Item convert(ItemPO po) {
        Item item = new Item();

        item.setId(po.getId());
        item.setTitle(po.getTitle());
        item.setProductId(po.getProductId());
        item.setSellerId(po.getSellerId());
        item.setCategoryId(po.getCategoryId());


        return item;
    }
}
