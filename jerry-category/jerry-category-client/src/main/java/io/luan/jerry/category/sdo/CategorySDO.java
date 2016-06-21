package io.luan.jerry.category.sdo;

import io.luan.jerry.common.sdo.BaseSDO;

import java.util.List;

/**
 * Service data object for Category (Backend Category)
 */
public class CategorySDO extends BaseSDO {


    private Integer categoryId;
    private Integer parentId;
    private String name;
    private int sortOrder;
    private CategorySDO parent;
    private List<CategorySDO> children;

    public CategorySDO() {
        //
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public List<CategorySDO> getChildren() {
        return children;
    }

    public void setChildren(List<CategorySDO> children) {
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategorySDO getParent() {
        return parent;
    }

    public void setParent(CategorySDO parent) {
        this.parent = parent;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public boolean isLeaf() {
        return children == null || children.isEmpty();
    }

    public boolean isRoot() {
        return parent == null;
    }
}
