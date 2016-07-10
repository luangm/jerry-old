package io.luan.jerry.buy.service.impl;

import io.luan.jerry.buy.converter.OrderConverter;
import io.luan.jerry.buy.domain.OrderLineSpec;
import io.luan.jerry.buy.domain.OrderSpec;
import io.luan.jerry.buy.dto.OrderDTO;
import io.luan.jerry.buy.dto.OrderLineDTO;
import io.luan.jerry.buy.dto.creating.CreatingOrderRequest;
import io.luan.jerry.buy.dto.creating.CreatingOrderResult;
import io.luan.jerry.buy.service.CreatingOrderService;
import io.luan.jerry.item.domain.Sku;
import io.luan.jerry.item.service.SkuService;
import io.luan.jerry.order.domain.Order;
import io.luan.jerry.order.service.OrderStoreService;
import io.luan.jerry.user.domain.User;
import io.luan.jerry.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Guangmiao Luan
 * @since 7/8/2016
 */
@Service("creatingOrderService")
@Slf4j
public class CreatingOrderServiceImpl implements CreatingOrderService {

    @Autowired
    private UserService userService;

    @Autowired
    private SkuService skuService;

    @Autowired
    private OrderStoreService orderStoreService;

    @Autowired
    private OrderConverter orderConverter;

    @Override
    public CreatingOrderResult createOrder(CreatingOrderRequest request) {
        CreatingOrderResult result = new CreatingOrderResult();

        User buyer = userService.getUser(request.getBuyerId());
        result.setBuyer(buyer);

        List<OrderSpec> orderSpecList = buildOrderSpecs(request, buyer);

        List<Order> storedOrders = new ArrayList<>();

        for (OrderSpec orderSpec : orderSpecList) {
            Order order = orderConverter.convert(orderSpec);
            Order storedOrder = orderStoreService.storeOrder(order);
            storedOrders.add(storedOrder);
        }

        // all orders are successfully stored
        // now enable them
        List<Order> enabledOrders = orderStoreService.enableOrders(storedOrders);
        result.getOrders().addAll(enabledOrders);

        return result;
    }

    /**
     * The main process.
     * <p>
     * 1. Verify orders
     * 2. Split orders
     * 3. build specs
     */
    private List<OrderSpec> buildOrderSpecs(CreatingOrderRequest request, User buyer) {
        List<OrderSpec> orderSpecList = new ArrayList<>();

        for (OrderDTO orderDTO : request.getOrders()) {
            OrderSpec orderSpec = new OrderSpec();
            orderSpec.setBuyer(buyer);

            for (OrderLineDTO orderLineDTO : orderDTO.getOrderLines()) {

                OrderLineSpec orderLineSpec = new OrderLineSpec();
                Sku sku = skuService.getSku(orderLineDTO.getSkuId());

                orderLineSpec.setSku(sku);
                orderLineSpec.setItem(sku.getItem());
                orderLineSpec.setQuantity(orderLineDTO.getQuantity());
                orderLineSpec.setUnitPrice(sku.getPrice());

                orderSpec.getOrderLines().add(orderLineSpec);

                orderSpec.setSeller(sku.getItem().getSeller());
            }

            orderSpecList.add(orderSpec);
        }
        return orderSpecList;
    }
}
