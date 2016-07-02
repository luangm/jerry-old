package io.luan.jerry.category.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class CategoryPO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private Integer parentId;
    private Integer sortOrder;
    private Integer childCount;

}
