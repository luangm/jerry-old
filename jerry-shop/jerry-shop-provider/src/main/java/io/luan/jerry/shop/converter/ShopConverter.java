package io.luan.jerry.shop.converter;

import io.luan.jerry.shop.domain.Shop;
import io.luan.jerry.shop.po.ShopPO;
import org.springframework.stereotype.Component;

/**
 * Transform CategoryDO to/from CategorySDO
 */
@Component
public class ShopConverter {

    public Shop convert(ShopPO po) {
        Shop shop = new Shop();
        shop.setId(po.getId());
        shop.setName(po.getName());
        shop.setOwnerId(po.getOwnerId());
        shop.setCreateTime(po.getCreateTime());
        shop.setUpdateTime(po.getUpdateTime());

        return shop;
    }
}
