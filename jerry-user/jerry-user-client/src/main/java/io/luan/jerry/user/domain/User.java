package io.luan.jerry.user.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Service Data Object for the User services
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String username;
    private String name;
    private String phone;
    private Date createTime;
    private Date updateTime;
}
