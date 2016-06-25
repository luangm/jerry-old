package io.luan.jerry.category.domain;

import io.luan.jerry.common.domain.BaseDO;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Data Object for Category
 */
@Data
@ToString(exclude = {"children", "parent"})
public class CategoryDO extends BaseDO {
    private Integer categoryId;
    private Integer parentId;
    private String name;
    private CategoryDO parent;
    private List<CategoryDO> children;

    public CategoryDO() {
        // Empty
    }

//    public Integer getCategoryId() {
//        return categoryId;
//    }
//
//    public void setCategoryId(Integer categoryId) {
//        this.categoryId = categoryId;
//    }
//
//    public List<CategoryDO> getChildren() {
//        return children;
//    }
//
//    public void setChildren(List<CategoryDO> children) {
//        this.children = children;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public CategoryDO getParent() {
//        return parent;
//    }
//
//    public void setParent(CategoryDO parent) {
//        this.parent = parent;
//    }
//
//    public Integer getParentId() {
//        return parentId;
//    }
//
//    public void setParentId(Integer parentId) {
//        this.parentId = parentId;
//    }
}
