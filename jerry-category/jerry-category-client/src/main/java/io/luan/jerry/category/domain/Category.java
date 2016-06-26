package io.luan.jerry.category.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Service data object for Category (Backend Category)
 */
@Data
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer parentId;
    private String name;
    private int sortOrder;
    private List<Category> children;

    public Category() {
        children = new ArrayList<>();
    }

    public boolean isLeaf() {
        return children == null || children.isEmpty();
    }

    public boolean isRoot() {
        return parentId == null;
    }
}
