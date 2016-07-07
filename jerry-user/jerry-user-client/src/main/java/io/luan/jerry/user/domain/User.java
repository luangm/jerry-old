package io.luan.jerry.user.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Service Data Object for the User services
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nick;
    private String name;
    private String phone;
    private Date createTime;
    private Date updateTime;

    /**
     * The delivery addresses for the user, could be empty
     */
    private List<DeliveryAddress> addresses = new ArrayList<>();
}
