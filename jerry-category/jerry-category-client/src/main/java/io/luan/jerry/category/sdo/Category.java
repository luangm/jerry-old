package io.luan.jerry.category.sdo;

import io.luan.jerry.common.sdo.BaseSDO;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Service data object for Category (Backend Category)
 */
@Data
public class Category extends BaseSDO {

    private Integer categoryId;
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
