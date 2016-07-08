package io.luan.jerry.order.service.impl;

import io.luan.jerry.order.domain.Order;
import io.luan.jerry.order.service.OrderStoreService;
import org.springframework.stereotype.Service;

/**
 * @author Guangmiao Luan
 * @since 7/8/2016
 */
@Service("orderStoreService")
public class OrderStoreServiceImpl implements OrderStoreService {

    @Override
    public Order storeOrder(Order order) {
        return order;
    }

    @Override
    public Order enableOrder(Order order) {
        return order;
    }
}
