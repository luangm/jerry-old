package io.luan.jerry.category.service.impl;

import io.luan.jerry.category.dao.CategoryDAO;
import io.luan.jerry.category.domain.Category;
import io.luan.jerry.category.po.CategoryPO;
import io.luan.jerry.category.service.CategoryService;
import io.luan.jerry.category.assembler.CategoryAssembler;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Implementation of CategoryService
 */
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDao;

    @Autowired
    private CategoryAssembler categoryAssembler;

    @Override
    public Category getCategory(int categoryId) {
        CategoryPO cat = categoryDao.getCategory(categoryId);
        Category sdo = categoryAssembler.assemble(cat);
        return sdo;
    }

}