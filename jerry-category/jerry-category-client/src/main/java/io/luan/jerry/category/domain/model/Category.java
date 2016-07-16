package io.luan.jerry.category.domain.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Service data object for Category (Backend Category)
 *
 * @author Guangmiao Luan
 * @since 7/15/2016
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

