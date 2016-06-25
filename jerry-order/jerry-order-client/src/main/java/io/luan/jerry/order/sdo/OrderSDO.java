package io.luan.jerry.order.sdo;

import lombok.Data;

/**
 * Service Data Object for Order
 */
@Data
public class OrderSDO {
    private Long id;
    private BizOrderSDO bizOrder;
    private LogisticsOrderSDO logisticsOrder;
    private PayOrderSDO payOrder;
}
