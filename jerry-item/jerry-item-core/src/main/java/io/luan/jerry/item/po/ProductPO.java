package io.luan.jerry.item.po;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Miao on 6/25/2016.
 */
@Data
public class ProductPO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Integer categoryId;
}
