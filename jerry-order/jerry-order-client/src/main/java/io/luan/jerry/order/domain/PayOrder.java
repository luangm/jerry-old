package io.luan.jerry.order.domain;

import lombok.Data;

import java.io.Serializable;

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
     * Redundant copy of User's nick, for convenience
     */
    private String buyerNick;

    /**
     * Seller's user ID, use to query from userService
     */
    private Long sellerId;

    /**
     * Redundant, Seller's shop name.
     */
    private String sellerNick;
}
