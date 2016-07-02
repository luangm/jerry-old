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
    private Integer sortOrder;
    private Integer childCount;

    public boolean isLeaf() {
        return childCount == 0;
    }

    public boolean isRoot() {
        return parentId == null;
    }
}
