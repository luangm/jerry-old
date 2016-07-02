package io.luan.jerry.shop.domain;

import io.luan.jerry.user.domain.User;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Miao on 6/25/2016.
 */
@Data
public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private Long ownerId;
    private User owner;

    private Date createTime;
    private Date updateTime;
}
