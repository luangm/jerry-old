package io.luan.jerry.order.sdo;

import io.luan.jerry.logistics.domain.LogisticsProvider;
import lombok.Data;

/**
 * SDO for order's logistics info
 */
@Data
public class LogisticsOrderSDO {
    private Long id;
    private Integer logisticsProviderId;
    private LogisticsProvider logisticsProvider;
}
