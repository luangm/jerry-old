package io.luan.jerry.test.category;

import io.luan.jerry.category.domain.model.Category;
import io.luan.jerry.category.domain.repository.CategoryRepository;
import io.luan.jerry.category.domain.service.CategoryService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CategoryTest {
    private static ClassPathXmlApplicationContext context;
    // private static ProductService productService;
    private static CategoryService catService;
    private static CategoryRepository categoryRepository;
    // private static AttributeService attrService;
    // private static SkuService skuService;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        context = new ClassPathXmlApplicationContext(new String[]{"test-dubbo-context.xml"});
        context.start();

        System.out.println(context);

        // productService = (ProductService) context.getBean("productService");
        catService = (CategoryService) context.getBean("categoryService");
        categoryRepository = (CategoryRepository) context.getBean("categoryRepository");
        // attrService = (AttributeService) context.getBean("attributeService");
        // skuService = (SkuService) context.getBean("skuService");
    }

    @Test
    public void test_ProductCategory() {
        Category category = categoryRepository.getCategory(1);
        System.out.println(category);
    }

    @Test
    public void test_allCategories() {
        List<Category> categories = categoryRepository.getCategoryList();
        System.out.println(categories);
    }
}
