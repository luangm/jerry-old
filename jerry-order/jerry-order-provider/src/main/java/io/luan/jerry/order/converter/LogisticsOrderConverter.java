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

        LogisticsOrder LogisticsOrder = new LogisticsOrder();
        LogisticsOrder.setId(po.getId());
        LogisticsOrder.setStatus(convertStatus(po.getStatus()));

        return LogisticsOrder;
    }

    private static LogisticsOrderStatus convertStatus(Integer status) {
        if (status != null) {
            return LogisticsOrderStatus.getByIndex(status);
        }
        return null;
    }
}
