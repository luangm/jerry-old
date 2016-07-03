package io.luan.jerry.test.order;

import io.luan.jerry.item.domain.Item;
import io.luan.jerry.item.domain.Sku;
import io.luan.jerry.item.service.ItemService;
import io.luan.jerry.item.service.ProductService;
import io.luan.jerry.item.service.SkuService;
import io.luan.jerry.order.domain.Order;
import io.luan.jerry.order.service.OrderService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Miao on 6/21/2016.
 */
public class OrderTest {
    private static ClassPathXmlApplicationContext context;
    private static OrderService orderService;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        context = new ClassPathXmlApplicationContext(new String[] { "test-dubbo-context.xml" });
        context.start();

        System.out.println(context);

        orderService = (OrderService) context.getBean("orderService");
    }

    @Test
    public void test_getOrder() {
        Order order = orderService.getOrder(1L);
        System.out.println(order);
    }
}
