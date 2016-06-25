package io.luan.jerry.shop.service.impl;

import io.luan.jerry.shop.assembler.ShopAssembler;
import io.luan.jerry.shop.dao.ShopDAO;
import io.luan.jerry.shop.domain.ShopDO;
import io.luan.jerry.shop.dto.Shop;
import io.luan.jerry.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Implementation of UserService
 */

public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDAO shopDAO;

    @Autowired
    private ShopAssembler shopAssembler;

    @Override
    public Shop getShop(long shopId) {
        ShopDO shopDO = shopDAO.getShop(shopId);
        Shop result = shopAssembler.assemble(shopDO);
        return result;
    }
}
