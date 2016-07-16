package io.luan.jerry.category.domain.service.impl;

import io.luan.jerry.category.data.dao.CategoryDAO;
import io.luan.jerry.category.domain.service.CategoryService;
import io.luan.jerry.category.infrastructure.converter.CategoryConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Implementation of CategoryService
 */
@Service("categoryService")
@Slf4j
public class CategoryServiceImpl implements CategoryService {


    @Resource
    private CategoryDAO categoryDao;

    @Resource
    private CategoryConverter categoryConverter;


}