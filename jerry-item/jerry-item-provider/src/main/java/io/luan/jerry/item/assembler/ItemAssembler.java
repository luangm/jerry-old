package io.luan.jerry.item.assembler;

import io.luan.jerry.item.domain.Item;
import io.luan.jerry.item.po.ItemPO;
import io.luan.jerry.shop.domain.Shop;
import io.luan.jerry.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Miao on 6/25/2016.
 */
@Component
public class ItemAssembler {

    @Autowired
    private ProductAssembler productAssembler;

    public Item assemble(ItemPO itemPO) {
        Item item = new Item();

        item.setId(itemPO.getId());
        item.setProductId(itemPO.getProductId());
        item.setSellerId(itemPO.getSellerId());

        return item;
    }
}
