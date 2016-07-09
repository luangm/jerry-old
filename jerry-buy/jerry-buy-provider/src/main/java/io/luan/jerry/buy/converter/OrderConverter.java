package io.luan.jerry.buy.converter;

import io.luan.jerry.buy.domain.OrderLineSpec;
import io.luan.jerry.buy.domain.OrderSpec;
import io.luan.jerry.order.domain.*;
import org.springframework.stereotype.Component;

/**
 * Convert orderspec to bizOrder format
 *
 * @author Guangmiao Luan
 * @since 7/9/2016
 */
@Component
public class OrderConverter {
    public Order convert(OrderSpec orderSpec) {
        Order order = new Order();

        BizOrder bizOrder = convertBizOrder(orderSpec);
        PayOrder payOrder = convertPayOrder(orderSpec);
        LogisticsOrder logisticsOrder = convertLogisticsOrder(orderSpec);

        order.setBizOrder(bizOrder);
        order.setPayOrder(payOrder);
        order.setLogisticsOrder(logisticsOrder);

        return order;
    }

    private static BizOrder convertBizOrder(OrderSpec orderSpec) {
        BizOrder bizOrder = new BizOrder();
        bizOrder.setStatus(BizOrderStatus.Invisible);
        bizOrder.setBuyerId(orderSpec.getBuyer().getId());
        bizOrder.setSellerId(orderSpec.getSeller().getId());

        for (OrderLineSpec line : orderSpec.getOrderLines()) {
            BizOrderLine bizOrderLine = new BizOrderLine();
            bizOrderLine.setItemId(line.getItem().getId());
            bizOrderLine.setSkuId(line.getSku().getId());
            bizOrderLine.setUnitPrice(line.getUnitPrice());
            bizOrderLine.setQuantity(line.getQuantity());
            bizOrderLine.setItemTitle(line.getItem().getTitle());
            bizOrderLine.setSkuTitle(line.getSku().getSkuTitle());

            bizOrder.getOrderLines().add(bizOrderLine);
        }

        return bizOrder;
    }

    private static LogisticsOrder convertLogisticsOrder(OrderSpec orderSpec) {
        LogisticsOrder logisticsOrder = new LogisticsOrder();
        logisticsOrder.setStatus(LogisticsOrderStatus.NoOrder);
        logisticsOrder.setBuyerId(orderSpec.getBuyer().getId());
        logisticsOrder.setSellerId(orderSpec.getSeller().getId());
        return logisticsOrder;
    }

    private static PayOrder convertPayOrder(OrderSpec orderSpec) {
        PayOrder payOrder = new PayOrder();
        payOrder.setStatus(PayOrderStatus.NoOrder);
        payOrder.setBuyerId(orderSpec.getBuyer().getId());
        payOrder.setSellerId(orderSpec.getSeller().getId());
        return payOrder;
    }
}
