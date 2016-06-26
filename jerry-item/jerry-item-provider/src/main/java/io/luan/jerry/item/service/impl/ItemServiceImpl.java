package io.luan.jerry.item.service.impl;

import io.luan.jerry.item.assembler.ItemAssembler;
import io.luan.jerry.item.dao.ItemDAO;
import io.luan.jerry.item.domain.Item;
import io.luan.jerry.item.po.ItemPO;
import io.luan.jerry.item.service.ItemService;
import io.luan.jerry.shop.domain.Shop;
import io.luan.jerry.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Miao on 6/25/2016.
 */
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDAO itemDao;

    @Autowired
    private ItemAssembler itemAssembler;

    @Autowired
    private ShopService shopService;

    @Override
    public Item getItem(Long itemId) {
        ItemPO itemPO = itemDao.getItem(itemId);
        Item item = itemAssembler.assemble(itemPO);

        if (item.getSellerId() != null) {
            Shop seller = shopService.getShop(item.getSellerId());
            item.setSeller(seller);
        }

        return item;
    }
}
