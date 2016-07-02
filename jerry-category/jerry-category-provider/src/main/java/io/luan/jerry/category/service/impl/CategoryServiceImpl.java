package io.luan.jerry.category.service.impl;

import io.luan.jerry.category.converter.CategoryConverter;
import io.luan.jerry.category.dao.CategoryDAO;
import io.luan.jerry.category.domain.Category;
import io.luan.jerry.category.po.CategoryPO;
import io.luan.jerry.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Implementation of CategoryService
 */
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDao;

    @Autowired
    private CategoryConverter categoryConverter;

    @Override
    public Category getCategory(Integer categoryId) {
        if (categoryId == null) {
            return null;
        }

        CategoryPO po = categoryDao.getCategory(categoryId);
        if (po == null) {
            return null;
        }

        Category category = categoryConverter.convert(po);

        return category;
    }

}