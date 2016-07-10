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
        PayOrder payOrder = new PayOrder();
        payOrder.setId(po.getId());
        payOrder.setBuyerId(po.getBuyerId());
        payOrder.setSellerId(po.getSellerId());
        payOrder.setStatus(PayOrderStatus.getByIndex(po.getStatus()));
        payOrder.setCreateTime(po.getCreateTime());
        payOrder.setUpdateTime(po.getUpdateTime());

        return payOrder;
    }

    public PayOrderPO convert(PayOrder payOrder) {
        PayOrderPO po = new PayOrderPO();

        if (payOrder.getId() != null) {
            po.setId(payOrder.getId());
        }

        if (payOrder.getBuyerId() != null) {
            po.setBuyerId(payOrder.getBuyerId());
        }

        if (payOrder.getSellerId() != null) {
            po.setSellerId(payOrder.getSellerId());
        }

        if (payOrder.getStatus() != null) {
            po.setStatus(payOrder.getStatus().getIndex());
        }

        return po;
    }
}
