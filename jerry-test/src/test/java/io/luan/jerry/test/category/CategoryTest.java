package io.luan.jerry.test.category;

import io.luan.jerry.category.domain.model.Category;
import io.luan.jerry.category.domain.model.impl.CategoryImpl;
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
    public void test_addCategory() {
        Category cat1 = categoryRepository.getCategory(97);
        System.out.println(cat1);

        CategoryImpl cat = new CategoryImpl();
        cat.setId(972);
        cat.setName("ABCdd");
        cat.setParentId(97);

        Category cat2 = categoryRepository.addCategory(cat);
        System.out.println(cat2);

        Category cat3 = categoryRepository.getCategory(97);
        System.out.println(cat3);
    }

    @Test
    public void test_allCategories() {
        List<Category> categories = categoryRepository.getCategoryList();
        for (Category cat : categories) {
            System.out.println(cat);
        }
    }

    @Test
    public void test_updateCategory() {
        //Category cat = categoryRepository.getCategory(13);
        CategoryImpl cat2 = new CategoryImpl();

        cat2.setName("bbb");
        //cat2.setSortOrder(12);

        Category cat3 = categoryRepository.updateCategory(13, cat2);
        System.out.println(cat3);
    }
}
