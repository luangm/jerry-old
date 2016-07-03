package io.luan.jerry.order.converter;

import io.luan.jerry.order.domain.BizOrder;
import io.luan.jerry.order.domain.BizOrderLine;
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

        if (po.getOrderLines() != null) {
            for (BizOrderLinePO linePO: po.getOrderLines()) {
                BizOrderLine line = lineConverter.convert(linePO);
                bizOrder.getOrderLines().add(line);
            }
        }

        return bizOrder;
    }
}
