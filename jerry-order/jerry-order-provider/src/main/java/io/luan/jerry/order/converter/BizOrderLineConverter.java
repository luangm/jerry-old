package io.luan.jerry.order.converter;

import io.luan.jerry.order.domain.BizOrderLine;
import io.luan.jerry.order.po.BizOrderLinePO;
import org.springframework.stereotype.Component;

/**
 * Transform BizOrder
 */
@Component
public class BizOrderLineConverter {

    public BizOrderLine convert(BizOrderLinePO po) {

        BizOrderLine bizOrderLine = new BizOrderLine();
        bizOrderLine.setId(po.getId());
        bizOrderLine.setBizOrderId(po.getBizOrderId());

        bizOrderLine.setQuantity(po.getQuantity());
        bizOrderLine.setUnitPrice(po.getUnitPrice());

        bizOrderLine.setItemId(po.getItemId());
        bizOrderLine.setItemTitle(po.getItemTitle());

        bizOrderLine.setSkuId(po.getSkuId());
        bizOrderLine.setSkuTitle(po.getSkuTitle());

        return bizOrderLine;
    }
}
