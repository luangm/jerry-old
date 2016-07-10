package io.luan.jerry.order.service.impl;

import io.luan.jerry.order.converter.BizOrderConverter;
import io.luan.jerry.order.converter.BizOrderLineConverter;
import io.luan.jerry.order.converter.LogisticsOrderConverter;
import io.luan.jerry.order.converter.PayOrderConverter;
import io.luan.jerry.order.dao.BizOrderDAO;
import io.luan.jerry.order.dao.BizOrderLineDAO;
import io.luan.jerry.order.dao.LogisticsOrderDAO;
import io.luan.jerry.order.dao.PayOrderDAO;
import io.luan.jerry.order.domain.Order;
import io.luan.jerry.order.po.BizOrderLinePO;
import io.luan.jerry.order.po.BizOrderPO;
import io.luan.jerry.order.po.LogisticsOrderPO;
import io.luan.jerry.order.po.PayOrderPO;
import io.luan.jerry.order.service.OrderService;
import io.luan.jerry.order.service.OrderStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Guangmiao Luan
 * @since 7/8/2016
 */
@Service("orderStoreService")
public class OrderStoreServiceImpl implements OrderStoreService {

    @Autowired
    private BizOrderDAO bizOrderDAO;

    @Autowired
    private BizOrderLineDAO bizOrderLineDAO;

    @Autowired
    private PayOrderDAO payOrderDAO;

    @Autowired
    private LogisticsOrderDAO logisticsOrderDAO;

    @Autowired
    private BizOrderConverter bizOrderConverter;

    @Autowired
    private PayOrderConverter payOrderConverter;

    @Autowired
    private LogisticsOrderConverter logisticsOrderConverter;

    @Autowired
    private BizOrderLineConverter bizOrderLineConverter;

    @Autowired
    private OrderService orderService;

    @Override
    @Transactional
    public List<Order> enableOrders(List<Order> orders) {
        List<Order> list = new ArrayList<>();

        for (Order order: orders) {
            bizOrderDAO.enableBizOrder(order.getBizOrder().getId());
            payOrderDAO.enablePayOrder(order.getPayOrder().getId());
            logisticsOrderDAO.enableLogisticsOrder(order.getLogisticsOrder().getId());

            Order updated = orderService.getOrder(order.getBizOrder().getId());
            list.add(updated);
        }

        return list;
    }

    @Override
    @Transactional
    public Order storeOrder(Order order) {
        PayOrderPO payOrderPO = payOrderConverter.convert(order.getPayOrder());
        payOrderDAO.addPayOrder(payOrderPO);

        LogisticsOrderPO logisticsOrderPO = logisticsOrderConverter.convert(order.getLogisticsOrder());
        logisticsOrderDAO.addLogisticsOrder(logisticsOrderPO);

        BizOrderPO bizOrderPO = bizOrderConverter.convert(order.getBizOrder());
        bizOrderPO.setPayOrderId(payOrderPO.getId());
        bizOrderPO.setLogisticsOrderId(logisticsOrderPO.getId());
        bizOrderDAO.addBizOrder(bizOrderPO);

        for (BizOrderLinePO linePO : bizOrderPO.getOrderLines()) {
            linePO.setBizOrderId(bizOrderPO.getId());
            bizOrderLineDAO.addBizOrderLine(linePO);
        }

        Order result = orderService.getOrder(bizOrderPO.getId());

        return result;
    }

}
