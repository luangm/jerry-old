package io.luan.jerry.buy.service.impl;

import io.luan.jerry.buy.domain.OrderLineSpec;
import io.luan.jerry.buy.domain.OrderSpec;
import io.luan.jerry.buy.dto.OrderDTO;
import io.luan.jerry.buy.dto.OrderLineDTO;
import io.luan.jerry.buy.dto.creating.CreatingOrderRequest;
import io.luan.jerry.buy.dto.creating.CreatingOrderResult;
import io.luan.jerry.buy.service.CreatingOrderService;
import io.luan.jerry.item.domain.Item;
import io.luan.jerry.item.service.ItemService;
import io.luan.jerry.order.service.OrderStoreService;
import io.luan.jerry.user.domain.User;
import io.luan.jerry.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Guangmiao Luan
 * @since 7/8/2016
 */
@Service("creatingOrderService")
public class CreatingOrderServiceImpl implements CreatingOrderService {

    @Autowired
    private UserService userService;

    @Autowired
    private ItemService itemService;

    @Autowired
    private OrderStoreService orderStoreService;


    @Override
    public CreatingOrderResult createOrder(CreatingOrderRequest request) {
        CreatingOrderResult result = new CreatingOrderResult();

        User buyer = userService.getUser(request.getBuyerId());
        result.setBuyer(buyer);

        List<OrderSpec> orderSpecList = buildOrderSpecs(request, buyer);

        return result;
    }

    private List<OrderSpec> buildOrderSpecs(CreatingOrderRequest request, User buyer) {
        List<OrderSpec> orderSpecList = new ArrayList<>();

        for (OrderDTO orderDTO : request.getOrders()) {
            OrderSpec orderSpec = new OrderSpec();
            orderSpec.setBuyer(buyer);

            for (OrderLineDTO orderLineDTO : orderDTO.getOrderLines()) {
                OrderLineSpec orderLineSpec = new OrderLineSpec();
                Item item = itemService.getItem(orderLineDTO.getItemId());
                orderLineSpec.setItem(item);

                orderLineSpec.setQuantity(orderLineDTO.getQuantity());

                orderSpec.getOrderLines().add(orderLineSpec);
            }

            orderSpecList.add(orderSpec);
        }
        return orderSpecList;
    }
}
