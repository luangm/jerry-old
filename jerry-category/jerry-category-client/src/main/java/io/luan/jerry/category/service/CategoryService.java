package io.luan.jerry.category.service;

import io.luan.jerry.category.sdo.CategorySDO;

/**
 * Service interfaces for Category
 */
public interface CategoryService {

    CategorySDO getCategory(int categoryId);
}
