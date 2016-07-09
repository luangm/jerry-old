package io.luan.jerry.item.converter;

import io.luan.jerry.item.domain.Sku;
import io.luan.jerry.item.po.SkuPO;
import org.springframework.stereotype.Component;

/**
 * @author Guangmiao Luan
 * @since 7/2/2016
 */
@Component
public class SkuConverter {

    public Sku convert(SkuPO po) {
        Sku sku = new Sku();

        sku.setId(po.getId());
        sku.setItemId(po.getItemId());
        sku.setSkuTitle(po.getSkuTitle());
        sku.setInventory(po.getInventory());
        sku.setPrice(po.getPrice());

        return sku;
    }
}
