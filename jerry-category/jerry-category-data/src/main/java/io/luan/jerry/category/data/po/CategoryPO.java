package io.luan.jerry.category.data.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class CategoryPO implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id_category;
    private String name = "";
    private int parent_id;
    private int sort_order;
    private int child_count;
    private boolean deleted;

}
