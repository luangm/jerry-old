package io.luan.jerry.shop.dto;

import io.luan.jerry.common.sdo.BaseSDO;
import io.luan.jerry.user.sdo.User;
import lombok.Data;

/**
 * Created by Miao on 6/25/2016.
 */
@Data
public class Shop extends BaseSDO {
    private Long id;

    private String name;

    private Long ownerId;
    private User owner;
}
