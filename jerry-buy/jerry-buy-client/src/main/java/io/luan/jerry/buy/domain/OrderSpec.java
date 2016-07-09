package io.luan.jerry.buy.domain;

import io.luan.jerry.common.domain.BaseDO;
import io.luan.jerry.user.domain.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * The main domain object in buy
 * A full in memory model of an order, all domain objects are filled in.
 * This is the object AFTER splitting orders, such that:
 * - Each orderSpec has only one seller.
 * - All OrderLineSpecs have the same seller as the OrderSpec
 *
 * @author Guangmiao Luan
 * @since 7/7/2016
 */
@Data
public class OrderSpec extends BaseDO {

    private User buyer;
    private User seller;

    private List<OrderLineSpec> orderLines = new ArrayList<>();

    public long getTotalPrice() {
        long totalPrice = 0;
        if (orderLines != null) {
            for (OrderLineSpec line : orderLines) {
                totalPrice += line.getUnitPrice() * line.getQuantity();
            }
        }
        return totalPrice;
    }
}
