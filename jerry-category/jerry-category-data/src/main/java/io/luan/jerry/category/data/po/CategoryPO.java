package io.luan.jerry.category.data.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CategoryPO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id_category;
    private String name;
    private Integer parent_id;
    private Integer sort_order;
    private Integer child_count;
    private Boolean deleted;
    private Date create_time;
    private Date update_time;

}
