package io.luan.jerry.user.domain;

import io.luan.jerry.common.domain.BaseDO;
import lombok.Data;

import java.util.Date;

/**
 * Created by Miao on 6/25/2016.
 */
@Data
public class UserDO extends BaseDO {
    private Long id;
    private String username;
    private String name;
    private String phone;
    private Date createTime;
    private Date updateTime;
}
