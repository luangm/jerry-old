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
        bizOrder.setSellerId(po.getSellerId());
        bizOrder.setStatus(BizOrderStatus.getByIndex(po.getStatus()));
        bizOrder.setCreateTime(po.getCreateTime());
        bizOrder.setUpdateTime(po.getUpdateTime());

        if (po.getOrderLines() != null) {
            for (BizOrderLinePO linePO : po.getOrderLines()) {
                BizOrderLine line = lineConverter.convert(linePO);
                bizOrder.getOrderLines().add(line);
            }
        }

        return bizOrder;
    }

    public BizOrderPO convert(BizOrder bizOrder) {
        BizOrderPO po = new BizOrderPO();

        if (bizOrder.getId() != null) {
            po.setId(bizOrder.getId());
        }

        if (bizOrder.getBuyerId() != null) {
            po.setBuyerId(bizOrder.getBuyerId());
        }

        if (bizOrder.getSellerId() != null) {
            po.setSellerId(bizOrder.getSellerId());
        }

        if (bizOrder.getStatus() != null) {
            po.setStatus(bizOrder.getStatus().getIndex());
        }

        if (bizOrder.getOrderLines() != null) {
            for (BizOrderLine line : bizOrder.getOrderLines()) {
                BizOrderLinePO linePO = lineConverter.convert(line);
                po.getOrderLines().add(linePO);
            }
        }

        return po;
    }
}
