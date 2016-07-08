package io.luan.jerry.order.service;

import io.luan.jerry.order.domain.Order;

/**
 * Stores the order object into db
 *
 * Enable the order
 *
 * @author Guangmiao Luan
 * @since 7/8/2016
 */
public interface OrderStoreService {

    Order storeOrder(Order order);

    Order enableOrder(Order order);
}
