package io.luan.jerry.category.po;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CategoryPO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer categoryId;
    private Integer parentId;
    private String name;
    private int sortOrder;
    private List<CategoryPO> children;

}
