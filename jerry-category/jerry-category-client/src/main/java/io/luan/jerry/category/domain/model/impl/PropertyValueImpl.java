package io.luan.jerry.category.domain.model.impl;

import io.luan.jerry.category.domain.model.PropertyValue;
import io.luan.jerry.common.domain.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Guangmiao Luan
 * @since 7/24/2016.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PropertyValueImpl extends BaseDO implements PropertyValue {

    private int id;
    private PropertyImpl property;
    private CategoryImpl category;
    private String value;
    private Integer sortOrder;
    private boolean deleted;

}
