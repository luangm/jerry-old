package io.luan.jerry.user.sdo;

import io.luan.jerry.common.sdo.BaseSDO;
import lombok.Data;

import java.util.Date;

/**
 * Service Data Object for the User services
 */
@Data
public class User extends BaseSDO {
    private Long id;
    private String username;
    private String name;
    private String phone;
    private Date createTime;
    private Date updateTime;
}
