package io.luan.jerry.order.po;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Guangmiao Luan
 * @since 7/3/2016
 */
@Data
public class BizOrderPO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long payOrderId;

    private Long logisticsOrderId;

    private Integer status;

    private Long buyerId;

    private Long sellerId;

    private List<BizOrderLinePO> orderLines = new ArrayList<>();
}
