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
        logisticsOrder.setStatus(LogisticsOrderStatus.getByIndex(po.getStatus()));
        logisticsOrder.setCreateTime(po.getCreateTime());
        logisticsOrder.setUpdateTime(po.getUpdateTime());

        return logisticsOrder;
    }

    public LogisticsOrderPO convert(LogisticsOrder logisticsOrder) {

        LogisticsOrderPO po = new LogisticsOrderPO();

        if (logisticsOrder.getId() != null) {
            po.setId(logisticsOrder.getId());
        }

        if (logisticsOrder.getBuyerId() != null) {
            po.setBuyerId(logisticsOrder.getBuyerId());
        }

        if (logisticsOrder.getSellerId() != null) {
            po.setSellerId(logisticsOrder.getSellerId());
        }

        if (logisticsOrder.getStatus() != null) {
            po.setStatus(logisticsOrder.getStatus().getIndex());
        }

        return po;
    }

}
