package io.luan.jerry.order.po;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Guangmiao Luan
 * @since 7/3/2016
 */
@Data
public class BizOrderPO implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    private long payOrderId;

    private long logisticsOrderId;

    private int status;

    private long buyerId;

    private long sellerId;

    private long totalPrice;

    private Date createTime;

    private Date updateTime;

    private List<BizOrderLinePO> orderLines = new ArrayList<>();
}
