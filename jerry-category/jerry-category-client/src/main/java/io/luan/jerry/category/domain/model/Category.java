package io.luan.jerry.category.domain.model;

import java.util.Date;
import java.util.Map;

/**
 * Service data object for Category (Backend Category)
 *
 * @author Guangmiao Luan
 * @since 7/15/2016
 */
public interface Category {

    int getChildCount();

    int getId();

    String getName();

    Integer getParentId();

    Map<Integer, Property> getPropertyMap();

    Integer getSortOrder();

    boolean isDeleted();

    Date getCreateTime();

    Date getUpdateTime();

    default boolean isLeaf() {
        return getChildCount() == 0;
    }

    default boolean isRoot() {
        return getParentId() == 0;
    }
}

