package io.luan.jerry.order.domain;

import io.luan.jerry.logistics.domain.LogisticsProvider;
import lombok.Data;

/**
 * order's logistics info
 */
@Data
public class LogisticsOrder {
    private Long id;
    private Integer logisticsProviderId;
    private LogisticsProvider logisticsProvider;
}
