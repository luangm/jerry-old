package io.luan.jerry.order.service;

import io.luan.jerry.order.domain.Order;

import java.util.List;

/**
 * Stores the order object into db
 * <p>
 * Enable the order.
 * Order enable is a batch process, either all success or all fail
 *
 * @author Guangmiao Luan
 * @since 7/8/2016
 */
public interface OrderStoreService {

    List<Order> enableOrders(List<Order> orders);

    Order storeOrder(Order order);
}
