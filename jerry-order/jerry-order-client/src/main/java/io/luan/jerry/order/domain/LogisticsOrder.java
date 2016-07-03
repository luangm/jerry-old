package io.luan.jerry.order.domain;

import io.luan.jerry.logistics.domain.LogisticsProvider;
import lombok.Data;

import java.io.Serializable;

/**
 * order's logistics info
 */
@Data
public class LogisticsOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private LogisticsOrderStatus status;
    private Integer logisticsProviderId;
    private LogisticsProvider logisticsProvider;
}
