package io.luan.jerry.category.service.impl;

import io.luan.jerry.category.domain.CategoryDO;
import io.luan.jerry.category.sdo.CategorySDO;
import io.luan.jerry.category.service.CategoryService;

import java.util.ArrayList;

/**
 * Implementation of CategoryService
 */
public class CategoryServiceImpl implements CategoryService {
    @Override
    public CategorySDO getCategory(int categoryId) {
        CategorySDO sdo = new CategorySDO();
        sdo.setCategoryId(categoryId);
        sdo.setName("RootCategory");
        sdo.setChildren(new ArrayList<>());

        CategoryDO do1 = new CategoryDO();
        return sdo;
    }
}
