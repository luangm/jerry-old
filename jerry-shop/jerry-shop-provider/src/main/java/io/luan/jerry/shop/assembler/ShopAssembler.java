package io.luan.jerry.shop.assembler;

import io.luan.jerry.shop.po.ShopPO;
import io.luan.jerry.shop.domain.Shop;
import org.springframework.stereotype.Component;

/**
 * Transform CategoryDO to/from CategorySDO
 */
@Component
public class ShopAssembler {

    public Shop assemble(ShopPO shopDO) {
        Shop dto = new Shop();
        dto.setId(shopDO.getId());
        dto.setName(shopDO.getName());

        return dto;
    }
}
