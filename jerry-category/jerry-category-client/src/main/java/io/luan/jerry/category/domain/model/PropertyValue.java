package io.luan.jerry.category.domain.model;

/**
 * @author Guangmiao Luan
 * @since 7/24/2016.
 */
public interface PropertyValue {

    Category getCategory();

    int getId();

    Property getProperty();

    Integer getSortOrder();

    String getValue();

    boolean isDeleted();
}
