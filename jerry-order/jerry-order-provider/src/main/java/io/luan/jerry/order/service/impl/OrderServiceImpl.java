package io.luan.jerry.order.service.impl;

import io.luan.jerry.item.service.ItemService;
import io.luan.jerry.order.converter.BizOrderConverter;
import io.luan.jerry.order.dao.BizOrderDAO;
import io.luan.jerry.order.domain.BizOrder;
import io.luan.jerry.order.domain.Order;
import io.luan.jerry.order.po.BizOrderPO;
import io.luan.jerry.order.service.OrderService;
import io.luan.jerry.shop.service.ShopService;
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
    private UserService userService;

    @Autowired
    private ShopService shopService;

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

        return order;
    }

}
