package io.luan.jerry.test.shop;

import io.luan.jerry.shop.domain.Shop;
import io.luan.jerry.shop.service.ShopService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Miao on 6/21/2016.
 */
public class ShopTest {
    private static ClassPathXmlApplicationContext context;
    // private static ProductService productService;
    private static ShopService shopService;
    // private static AttributeService attrService;
    // private static SkuService skuService;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        context = new ClassPathXmlApplicationContext(new String[] { "test-dubbo-context.xml" });
        context.start();

        System.out.println(context);

        // productService = (ProductService) context.getBean("productService");
        shopService = (ShopService) context.getBean("shopService");
        // attrService = (AttributeService) context.getBean("attributeService");
        // skuService = (SkuService) context.getBean("skuService");
    }

    @Test
    public void test_getShop() {
        Shop sdo = shopService.getShop(2L);
        System.out.println(sdo);
    }
}
