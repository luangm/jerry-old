package io.luan.jerry.order.converter;

import io.luan.jerry.order.domain.LogisticsOrder;
import io.luan.jerry.order.domain.LogisticsOrderStatus;
import io.luan.jerry.order.po.LogisticsOrderPO;
import org.springframework.stereotype.Component;

/**
 * Transform LogisticsOrder
 */
@Component
public class LogisticsOrderConverter {

    public LogisticsOrder convert(LogisticsOrderPO po) {

        LogisticsOrder logisticsOrder = new LogisticsOrder();
        logisticsOrder.setId(po.getId());
        logisticsOrder.setBuyerId(po.getBuyerId());
        logisticsOrder.setSellerId(po.getSellerId());
        logisticsOrder.setStatus(convertStatus(po.getStatus()));

        return logisticsOrder;
    }

    public LogisticsOrderPO convert(LogisticsOrder logisticsOrder) {

        LogisticsOrderPO po = new LogisticsOrderPO();
        po.setId(logisticsOrder.getId());
        po.setBuyerId(logisticsOrder.getBuyerId());
        po.setSellerId(logisticsOrder.getSellerId());
        po.setStatus(logisticsOrder.getStatus().getIndex());

        return po;
    }

    private static LogisticsOrderStatus convertStatus(Integer status) {
        if (status != null) {
            return LogisticsOrderStatus.getByIndex(status);
        }
        return null;
    }
}
