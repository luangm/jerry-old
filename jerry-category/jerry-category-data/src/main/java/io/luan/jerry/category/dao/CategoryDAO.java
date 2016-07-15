package io.luan.jerry.category.dao;


import io.luan.jerry.category.po.CategoryPO;

import java.util.List;

/**
 * @author Guangmiao Luan
 * @since 7/15/2016
 */
public interface CategoryDAO {

    CategoryPO getCategory(Integer categoryId);

    List<CategoryPO> getCategoryList();
}

