package io.luan.jerry.order.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Order's biz info
 */
@Data
public class BizOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long payOrderId;

    private Long logisticsOrderId;

    /**
     * Status of the bizOrder, initially should be invisible, then enabled
     */
    private BizOrderStatus status;

    /**
     * Buyer's ID, use to query from userService
     */
    private Long buyerId;

    /**
     * Redundant copy of User's nick, for convenience
     */
    private String buyerNick;

    /**
     * Seller's shop ID, use to query from shopService
     */
    private Long sellerId;

    /**
     * Redundant, Seller's shop name.
     */
    private String sellerName;

    /**
     * Order's line items
     */
    private List<BizOrderLine> orderLines = new ArrayList<>();
}
