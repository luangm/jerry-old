package io.luan.jerry.order.domain;

import io.luan.jerry.logistics.domain.LogisticsProvider;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * order's logistics info
 */
@Data
public class LogisticsOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private LogisticsOrderStatus status;

    /**
     * Buyer's ID, use to query from userService
     */
    private Long buyerId;

    /**
     * Seller's user ID, use to query from userService
     */
    private Long sellerId;

    /**
     * 3rd party logisticsProvider
     */
    private Integer logisticsProviderId;
    private LogisticsProvider logisticsProvider;

    /**
     * External id number for 3pl
     */
    private String outId;

    private String deliveryName;
    private String deliveryAddress;
    private String deliveryPhone;

    private String trackingNumber;


    private Date createTime;
    private Date updateTime;
}
