package io.luan.jerry.test.category;

import io.luan.jerry.category.sdo.Category;
import io.luan.jerry.category.service.CategoryService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Miao on 6/21/2016.
 */
public class CategoryTest {
    private static ClassPathXmlApplicationContext context;
    // private static ProductService productService;
    private static CategoryService catService;
    // private static AttributeService attrService;
    // private static SkuService skuService;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        context = new ClassPathXmlApplicationContext(new String[] { "test-dubbo-context.xml" });
        context.start();

        System.out.println(context);

        // productService = (ProductService) context.getBean("productService");
        catService = (CategoryService) context.getBean("categoryService");
        // attrService = (AttributeService) context.getBean("attributeService");
        // skuService = (SkuService) context.getBean("skuService");
    }

    @Test
    public void testProductCategory() {
        Category sdo = catService.getCategory(1);
        System.out.println(sdo);
    }
}
