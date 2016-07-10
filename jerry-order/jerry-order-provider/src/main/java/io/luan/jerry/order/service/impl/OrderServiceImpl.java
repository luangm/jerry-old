package io.luan.jerry.order.service.impl;

import io.luan.jerry.item.service.ItemService;
import io.luan.jerry.order.converter.BizOrderConverter;
import io.luan.jerry.order.converter.LogisticsOrderConverter;
import io.luan.jerry.order.converter.PayOrderConverter;
import io.luan.jerry.order.dao.BizOrderDAO;
import io.luan.jerry.order.dao.LogisticsOrderDAO;
import io.luan.jerry.order.dao.PayOrderDAO;
import io.luan.jerry.order.domain.BizOrder;
import io.luan.jerry.order.domain.LogisticsOrder;
import io.luan.jerry.order.domain.Order;
import io.luan.jerry.order.domain.PayOrder;
import io.luan.jerry.order.po.BizOrderPO;
import io.luan.jerry.order.po.LogisticsOrderPO;
import io.luan.jerry.order.po.PayOrderPO;
import io.luan.jerry.order.service.OrderService;
import io.luan.jerry.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation of OrderService
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private BizOrderDAO bizOrderDAO;

    @Autowired
    private BizOrderConverter bizOrderConverter;

    @Autowired
    private LogisticsOrderDAO logisticsOrderDAO;

    @Autowired
    private LogisticsOrderConverter logisticsOrderConverter;

    @Autowired
    private PayOrderDAO payOrderDAO;

    @Autowired
    private PayOrderConverter payOrderConverter;

    @Autowired
    private UserService userService;

    @Autowired
    private ItemService itemService;

    @Override
    public Order getOrder(Long orderId) {
        if (orderId == null) {
            return null;
        }

        BizOrderPO bizOrderPO = bizOrderDAO.getBizOrder(orderId);
        if (bizOrderPO == null) {
            return null;
        }

        BizOrder bizOrder = bizOrderConverter.convert(bizOrderPO);

        Order order = new Order();
        order.setBizOrder(bizOrder);

        PayOrderPO payOrderPO = payOrderDAO.getPayOrder(bizOrder.getPayOrderId());
        if (payOrderPO != null) {
            PayOrder payOrder = payOrderConverter.convert(payOrderPO);
            order.setPayOrder(payOrder);
        }

        LogisticsOrderPO logisticsOrderPO = logisticsOrderDAO.getLogisticsOrder(bizOrder.getLogisticsOrderId());
        if (logisticsOrderPO != null) {
            LogisticsOrder logisticsOrder = logisticsOrderConverter.convert(logisticsOrderPO);
            order.setLogisticsOrder(logisticsOrder);
        }

        return order;
    }

    @Override
    public Order saveOrder(Order order) {
        return order;
    }

}
