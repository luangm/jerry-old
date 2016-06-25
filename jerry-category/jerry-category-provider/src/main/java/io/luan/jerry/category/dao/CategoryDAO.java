package io.luan.jerry.category.dao;

import io.luan.jerry.category.domain.CategoryDO;

import java.util.List;

/**
 * Created by Miao on 6/22/2016.
 */
public interface CategoryDAO {

    CategoryDO getCategory(int categoryId);

    List<CategoryDO> getCategoryList();
}

