package io.luan.jerry.category.service.impl;

import io.luan.jerry.category.domain.CategoryDO;
import io.luan.jerry.category.mapper.CategoryMapper;
import io.luan.jerry.category.sdo.CategorySDO;
import io.luan.jerry.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

/**
 * Implementation of CategoryService
 */
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public CategorySDO getCategory(int categoryId) {
        CategorySDO sdo = new CategorySDO();
        sdo.setCategoryId(categoryId);
        sdo.setName("RootCategory");
        sdo.setChildren(new ArrayList<>());

        CategoryDO cat = categoryMapper.getCategory(categoryId);
        System.out.println(cat);


        // CategoryDO catDO = categoryMapper.getCategory(categoryId);
        // System.out.println(catDO);
        return sdo;
    }

}
