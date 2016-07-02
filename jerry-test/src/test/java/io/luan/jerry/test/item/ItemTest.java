package io.luan.jerry.test.item;

import io.luan.jerry.item.domain.Item;
import io.luan.jerry.item.domain.Sku;
import io.luan.jerry.item.service.ItemService;
import io.luan.jerry.item.service.ProductService;
import io.luan.jerry.item.service.SkuService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Miao on 6/21/2016.
 */
public class ItemTest {
    private static ClassPathXmlApplicationContext context;
    private static ProductService productService;
    private static ItemService itemService;
    // private static AttributeService attrService;
    private static SkuService skuService;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        context = new ClassPathXmlApplicationContext(new String[] { "test-dubbo-context.xml" });
        context.start();

        System.out.println(context);

        productService = (ProductService) context.getBean("productService");
        itemService = (ItemService) context.getBean("itemService");
        // attrService = (AttributeService) context.getBean("attributeService");
        skuService = (SkuService) context.getBean("skuService");
    }

    @Test
    public void test_getItem() {
        Item item = itemService.getItem(1L);
        Sku sku = skuService.getSku(1L);
        System.out.println(item);
        System.out.println(sku);

        List<Sku> skuList = skuService.getSkusByItemId(1L);
        System.out.println(skuList);
    }
}
