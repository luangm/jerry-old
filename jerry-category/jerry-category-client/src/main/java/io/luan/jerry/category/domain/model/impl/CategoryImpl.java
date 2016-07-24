package io.luan.jerry.category.domain.model.impl;

import io.luan.jerry.category.domain.model.Category;
import io.luan.jerry.category.domain.model.Property;
import io.luan.jerry.common.domain.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.Map;

/**
 * Service data object for Category (Backend Category)
 *
 * @author Guangmiao Luan
 * @since 7/15/2016
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CategoryImpl extends BaseDO implements Category {

    private static final long serialVersionUID = 1L;

    private int id;
    private Integer parentId;
    private String name;
    private Integer sortOrder;
    private int childCount;
    private boolean deleted;
    private Date createTime;
    private Date updateTime;

    private Map<Integer, Property> propertyMap;

}

