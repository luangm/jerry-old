package io.luan.jerry.order.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Guangmiao Luan
 * @since 7/3/2016
 */
@Data
public class PayOrderPO implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    private int status;

    private long buyerId;

    private long sellerId;

    private long paidAmount;

    private Date createTime;

    private Date updateTime;
}
