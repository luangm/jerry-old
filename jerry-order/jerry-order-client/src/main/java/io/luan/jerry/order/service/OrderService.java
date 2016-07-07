package io.luan.jerry.order.service;

import io.luan.jerry.order.domain.Order;

/**
 * @author Guangmiao Luan
 * @since 7/3/2016
 */
public interface OrderService {

    Order getOrder(Long orderId);

    Order saveOrder(Order order);
}
