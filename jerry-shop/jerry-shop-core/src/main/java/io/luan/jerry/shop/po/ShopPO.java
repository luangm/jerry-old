package io.luan.jerry.shop.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Data Object for Shop
 */
@Data
public class ShopPO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Long ownerId;
    private Date createTime;
    private Date updateTime;
}
