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
        PayOrder.setStatus(convertStatus(po.getStatus()));

        return PayOrder;
    }

    private static PayOrderStatus convertStatus(Integer status) {
        if (status != null) {
            return PayOrderStatus.getByIndex(status);
        }
        return null;
    }
}
