package io.luan.jerry.shop.domain;

import io.luan.jerry.common.domain.BaseDO;
import lombok.Data;

/**
 * Data Object for Shop
 */
@Data
public class ShopDO extends BaseDO {
    private Long id;
    private String name;
    private Long ownerId;
}
