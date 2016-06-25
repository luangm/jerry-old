package io.luan.jerry.item.domain;

import lombok.Data;

/**
 * Created by Miao on 6/25/2016.
 */
@Data
public class ProductDO {
    private Long productId;
    private String name;
    private Integer categoryId;
}
