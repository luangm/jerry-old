package io.luan.jerry.order.converter;

import io.luan.jerry.order.domain.PayOrder;
import io.luan.jerry.order.domain.PayOrderStatus;
import io.luan.jerry.order.po.PayOrderPO;
import org.springframework.stereotype.Component;

/**
 * Transform PayOrder
 */
@Component
public class PayOrderConverter {

    public PayOrder convert(PayOrderPO po) {

        PayOrder PayOrder = new PayOrder();
        PayOrder.setId(po.getId());
        PayOrder.setBuyerId(po.getBuyerId());
        PayOrder.setSellerId(po.getSellerId());
        PayOrder.setStatus(convertStatus(po.getStatus()));

        return PayOrder;
    }

    public PayOrderPO convert(PayOrder payOrder) {
        PayOrderPO po = new PayOrderPO();
        po.setId( payOrder.getId());
        po.setBuyerId(payOrder.getBuyerId());
        po.setSellerId(payOrder.getSellerId());
        po.setStatus(payOrder.getStatus().getIndex());
        return po;
    }

    private static PayOrderStatus convertStatus(Integer status) {
        if (status != null) {
            return PayOrderStatus.getByIndex(status);
        }
        return null;
    }
}
