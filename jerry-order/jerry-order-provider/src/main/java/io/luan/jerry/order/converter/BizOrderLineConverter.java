package io.luan.jerry.order.converter;

import io.luan.jerry.order.domain.BizOrder;
import io.luan.jerry.order.domain.BizOrderLine;
import io.luan.jerry.order.po.BizOrderLinePO;
import io.luan.jerry.order.po.BizOrderPO;
import org.springframework.stereotype.Component;

/**
 * Transform BizOrder
 */
@Component
public class BizOrderLineConverter {

    public BizOrderLine convert(BizOrderLinePO po) {

        BizOrderLine bizOrderLine = new BizOrderLine();
        bizOrderLine.setId(po.getId());

        return bizOrderLine;
    }
}
