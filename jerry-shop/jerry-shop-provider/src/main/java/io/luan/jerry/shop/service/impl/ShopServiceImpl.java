package io.luan.jerry.shop.service.impl;

import io.luan.jerry.shop.converter.ShopConverter;
import io.luan.jerry.shop.dao.ShopDAO;
import io.luan.jerry.shop.domain.Shop;
import io.luan.jerry.shop.po.ShopPO;
import io.luan.jerry.shop.service.ShopService;
import io.luan.jerry.user.domain.User;
import io.luan.jerry.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation of UserService
 */
@Service("shopService")
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDAO shopDAO;

    @Autowired
    private ShopConverter shopConverter;

    @Autowired
    private UserService userService;

    @Override
    public Shop getShop(Long shopId) {
        if (shopId == null) {
            return null;
        }

        ShopPO shopPo = shopDAO.getShop(shopId);
        if (shopPo == null) {
            return null;
        }

        Shop result = shopConverter.convert(shopPo);

        if (result.getOwnerId() != null) {
            User user = userService.getUser(result.getOwnerId());
            if (user != null) {
                result.setOwner(user);
            }
        }

        return result;
    }
}
