package io.luan.jerry.shop.assembler;

import io.luan.jerry.shop.domain.ShopDO;
import io.luan.jerry.shop.dto.Shop;
import org.springframework.stereotype.Component;

/**
 * Transform CategoryDO to/from CategorySDO
 */
@Component
public class ShopAssembler {

    public Shop assemble(ShopDO shopDO) {
        Shop dto = new Shop();
        dto.setId(shopDO.getId());
        dto.setName(shopDO.getName());

        return dto;
    }
}
