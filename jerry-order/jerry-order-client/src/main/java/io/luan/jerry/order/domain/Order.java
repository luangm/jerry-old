package io.luan.jerry.order.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Service Data Object for Order
 */
@Data
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    private BizOrder bizOrder;

    private PayOrder payOrder;

    private LogisticsOrder logisticsOrder;

}
