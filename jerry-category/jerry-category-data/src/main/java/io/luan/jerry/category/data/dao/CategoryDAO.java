package io.luan.jerry.category.data.dao;


import io.luan.jerry.category.data.po.CategoryPO;

import java.util.List;

/**
 * @author Guangmiao Luan
 * @since 7/15/2016
 */
public interface CategoryDAO {

    CategoryPO getCategory(int categoryId);

    List<CategoryPO> getCategoryList();
}

