package io.luan.jerry.category.dao;


import io.luan.jerry.category.po.CategoryPO;

import java.util.List;

/**
 * Created by Miao on 6/22/2016.
 */
public interface CategoryDAO {

    CategoryPO getCategory(int categoryId);

    List<CategoryPO> getCategoryList();
}

