package io.luan.jerry.order.domain;

import lombok.Data;

/**
 * Service Data Object for Order
 */
@Data
public class Order {

    private Long id;
    private BizOrder bizOrder;
    private LogisticsOrder logisticsOrder;
    private PayOrder payOrder;
}
