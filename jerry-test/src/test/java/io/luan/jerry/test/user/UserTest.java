package io.luan.jerry.test.user;

import io.luan.jerry.user.sdo.User;
import io.luan.jerry.user.service.UserService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Miao on 6/21/2016.
 */
public class UserTest {
    private static ClassPathXmlApplicationContext context;
    // private static ProductService productService;
    private static UserService userService;
    // private static AttributeService attrService;
    // private static SkuService skuService;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        context = new ClassPathXmlApplicationContext(new String[] { "test-dubbo-context.xml" });
        context.start();

        System.out.println(context);

        // productService = (ProductService) context.getBean("productService");
        userService = (UserService) context.getBean("userService");
        // attrService = (AttributeService) context.getBean("attributeService");
        // skuService = (SkuService) context.getBean("skuService");
    }

    @Test
    public void test_getUser() {
        User sdo = userService.getUser(1);
        System.out.println(sdo);
    }
}
