package io.luan.jerry.item.domain;

import lombok.Data;

/**
 * Created by Miao on 6/25/2016.
 */
@Data
public class ItemDO {

    private Long itemId;
    private Long productId;
    private ProductDO product;
    private Long sellerId;
}
