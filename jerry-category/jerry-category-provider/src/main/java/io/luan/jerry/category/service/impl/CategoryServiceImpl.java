package io.luan.jerry.category.service.impl;

import io.luan.jerry.category.converter.CategoryConverter;
import io.luan.jerry.category.dao.CategoryDAO;
import io.luan.jerry.category.domain.model.Category;
import io.luan.jerry.category.domain.service.CategoryService;
import io.luan.jerry.category.po.CategoryPO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation of CategoryService
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
    private static final Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);
    @Autowired
    private CategoryDAO categoryDao;

    @Autowired
    private CategoryConverter categoryConverter;

    @Override
    public Category getCategory(Integer categoryId) {
        logger.info("ABC");
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