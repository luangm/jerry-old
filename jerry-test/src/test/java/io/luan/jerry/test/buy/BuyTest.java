package io.luan.jerry.test.buy;

import io.luan.jerry.buy.dto.OrderDTO;
import io.luan.jerry.buy.dto.OrderLineDTO;
import io.luan.jerry.buy.dto.creating.CreatingOrderRequest;
import io.luan.jerry.buy.dto.creating.CreatingOrderResult;
import io.luan.jerry.buy.service.CreatingOrderService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Miao on 6/21/2016.
 */
public class BuyTest {
    private static ClassPathXmlApplicationContext context;
    private static CreatingOrderService creatingOrderService;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        context = new ClassPathXmlApplicationContext(new String[] { "test-dubbo-context.xml" });
        context.start();

        System.out.println(context);

        creatingOrderService = (CreatingOrderService) context.getBean("creatingOrderService");
    }

    @Test
    public void test_createOrder() {
        CreatingOrderRequest request = new CreatingOrderRequest();
        request.setBuyerId(1L);

        OrderDTO order1 = new OrderDTO();
        OrderLineDTO orderLine1 = new OrderLineDTO();
        orderLine1.setItemId(1L);
        order1.getOrderLines().add(orderLine1);
        request.getOrders().add(order1);

        CreatingOrderResult result = creatingOrderService.createOrder(request);
        System.out.println(result);
    }
}
