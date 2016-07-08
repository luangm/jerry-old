package io.luan.jerry.buy.service;

import io.luan.jerry.buy.dto.creating.CreatingOrderRequest;
import io.luan.jerry.buy.dto.creating.CreatingOrderResult;

/**
 * A client calls this service to create an order
 * Pass in params such as items, skus, user information etc.
 *
 * This Service uses the order service for order storage
 *
 * @author Guangmiao Luan
 * @since 7/3/2016
 */
public interface CreatingOrderService {

    CreatingOrderResult createOrder(CreatingOrderRequest request);

}
