package io.luan.jerry.category.domain.repository.impl;

import io.luan.jerry.category.data.dao.CategoryDAO;
import io.luan.jerry.category.data.po.CategoryPO;
import io.luan.jerry.category.domain.model.Category;
import io.luan.jerry.category.domain.repository.CategoryRepository;
import io.luan.jerry.category.infrastructure.converter.CategoryConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Miao
 * @since 7/16/2016.
 */
@Service("categoryRepository")
@Slf4j
public class CategoryRepositoryImpl implements CategoryRepository {

    @Resource
    private CategoryDAO categoryDAO;

    @Resource
    private CategoryConverter categoryConverter;

    @Override
    public Category getCategory(Integer categoryId) {
        log.info("getCategory");

        if (categoryId == null) {
            return null;
        }

        CategoryPO po = categoryDAO.getCategory(categoryId);
        if (po == null) {
            return null;
        }

        Category category = categoryConverter.convert(po);

        return category;
    }

    @Override
    public List<Category> getCategoryList() {
        //log.info("getCategoryList");

        List<Category> categories = new ArrayList<>();

        List<CategoryPO> list = categoryDAO.getCategoryList();
        for (CategoryPO po : list) {
            Category category = categoryConverter.convert(po);
            categories.add(category);
        }

        return categories;
    }
}
