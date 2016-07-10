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

    public BizOrderLinePO convert(BizOrderLine line) {
        BizOrderLinePO po = new BizOrderLinePO();

        if (line.getId() != null) {
            po.setId(line.getId());
        }

        if (line.getBizOrderId() != null) {
            po.setBizOrderId(line.getBizOrderId());
        }

        if (line.getItemId() != null) {
            po.setItemId(line.getItemId());
        }

        if (line.getItemTitle() != null) {
            po.setItemTitle(line.getItemTitle());
        }

        if (line.getQuantity() != null) {
            po.setQuantity(line.getQuantity());
        }

        if (line.getUnitPrice() != null) {
            po.setUnitPrice(line.getUnitPrice());
        }

        if (line.getSkuId() != null) {
            po.setSkuId(line.getSkuId());
        }

        if (line.getSkuTitle() != null) {
            po.setSkuTitle(line.getSkuTitle());
        }

        return po;
    }
}
