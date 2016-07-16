package io.luan.jerry.category.domain.repository;

import io.luan.jerry.category.domain.model.Category;

import java.util.List;

/**
 * @author Guangmiao Luan
 * @since 7/15/2016
 */
public interface CategoryRepository {

    Category getCategory(int categoryId);

    List<Category> getCategoryList();
}
