package io.luan.jerry.item.assembler;

import io.luan.jerry.item.domain.ItemDO;
import io.luan.jerry.item.sdo.ItemSDO;
import io.luan.jerry.item.sdo.ProductSDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Miao on 6/25/2016.
 */
@Component
public class ItemAssembler {

    @Autowired
    private ProductAssembler productAssembler;

    public ItemSDO assemble(ItemDO itemDO) {
        ItemSDO sdo = new ItemSDO();

        sdo.setProductId(itemDO.getProductId());
        if (itemDO.getProduct() != null) {
            ProductSDO productSDO = productAssembler.assemble(itemDO.getProduct());
            sdo.setProduct(productSDO);
        }

        sdo.setSellerId(itemDO.getSellerId());

        return sdo;
    }
}
