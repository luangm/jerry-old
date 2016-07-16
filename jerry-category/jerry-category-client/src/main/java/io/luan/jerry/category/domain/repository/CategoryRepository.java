package io.luan.jerry.category.domain.repository;

import io.luan.jerry.category.domain.model.Category;
import io.luan.jerry.common.domain.exception.JerryException;

import java.util.List;

/**
 * @author Guangmiao Luan
 * @since 7/15/2016
 */
public interface CategoryRepository {

    Category addCategory(Category category) throws JerryException;

    Category getCategory(Integer categoryId);

    List<Category> getCategoryList();
}
