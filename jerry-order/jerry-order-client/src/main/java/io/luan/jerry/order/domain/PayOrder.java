package io.luan.jerry.order.domain;

import io.luan.jerry.pay.domain.PayProvider;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * SDO for Order's Pay Information
 */
@Data
public class PayOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private PayOrderStatus status;

    /**
     * Buyer's ID, use to query from userService
     */
    private Long buyerId;

    /**
     * Seller's user ID, use to query from userService
     */
    private Long sellerId;

    private Integer payProviderId;

    /**
     * The 3rd party payment provider
     */
    private PayProvider payProvider;

    /**
     * The buyer's payment account used to make this payment
     */
    private String payAccount;


    private Date createTime;
    private Date updateTime;
}
