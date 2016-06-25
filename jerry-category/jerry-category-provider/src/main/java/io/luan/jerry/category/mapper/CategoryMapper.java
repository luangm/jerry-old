package io.luan.jerry.category.mapper;

import io.luan.jerry.category.domain.CategoryDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Miao on 6/22/2016.
 */
public interface CategoryMapper {
//    @Select("SELECT * FROM categories WHERE category_id = #{catId}")
//    @Results({
//            @Result(column = "category_id", property = "categoryId"),
//            @Result(column = "parent_id", property = "parentId")
//    })
    CategoryDO getCategory(int categoryId);

    List<CategoryDO> getCategoryList();
}

