package io.luan.jerry.order.converter;

import io.luan.jerry.order.domain.BizOrder;
import io.luan.jerry.order.domain.BizOrderLine;
import io.luan.jerry.order.domain.BizOrderStatus;
import io.luan.jerry.order.po.BizOrderLinePO;
import io.luan.jerry.order.po.BizOrderPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Transform BizOrder
 */
@Component
public class BizOrderConverter {

    @Autowired
    private BizOrderLineConverter lineConverter;

    public BizOrder convert(BizOrderPO po) {

        BizOrder bizOrder = new BizOrder();
        bizOrder.setId(po.getId());
        bizOrder.setLogisticsOrderId(po.getLogisticsOrderId());
        bizOrder.setPayOrderId(po.getPayOrderId());
        bizOrder.setBuyerId(po.getBuyerId());
        bizOrder.setBuyerNick(po.getBuyerNick());
        bizOrder.setSellerId(po.getSellerId());
        bizOrder.setSellerNick(po.getSellerNick());
        bizOrder.setStatus(convertStatus(po.getStatus()));

        if (po.getOrderLines() != null) {
            for (BizOrderLinePO linePO : po.getOrderLines()) {
                BizOrderLine line = lineConverter.convert(linePO);
                bizOrder.getOrderLines().add(line);
            }
        }

        return bizOrder;
    }

    private static BizOrderStatus convertStatus(Integer status) {
        if (status != null) {
            return BizOrderStatus.getByIndex(status);
        }
        return null;
    }
}
