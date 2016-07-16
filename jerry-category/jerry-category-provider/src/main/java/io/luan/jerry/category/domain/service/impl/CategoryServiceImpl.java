package io.luan.jerry.category.domain.service.impl;

import io.luan.jerry.category.data.dao.CategoryDAO;
import io.luan.jerry.category.data.po.CategoryPO;
import io.luan.jerry.category.domain.model.Category;
import io.luan.jerry.category.domain.service.CategoryService;
import io.luan.jerry.category.infrastructure.converter.CategoryConverter;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Implementation of CategoryService
 */
@Service("categoryService")
@Log
public class CategoryServiceImpl implements CategoryService {


    @Resource
    private CategoryDAO categoryDao;

    @Resource
    private CategoryConverter categoryConverter;

    @Override
    public Category getCategory(Integer categoryId) {
        log.info("ABC");
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