package io.luan.jerry.user.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Miao on 6/25/2016.
 */
@Data
public class UserPO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nick;
    private String name;
    private String phone;
    private Date createTime;
    private Date updateTime;
}
