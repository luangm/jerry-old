package io.luan.jerry.category.domain.model.impl;

import io.luan.jerry.category.domain.model.Property;
import io.luan.jerry.common.domain.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Guangmiao Luan
 * @since 7/24/2016.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PropertyImpl extends BaseDO implements Property {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String description;
    private boolean deleted;

}
