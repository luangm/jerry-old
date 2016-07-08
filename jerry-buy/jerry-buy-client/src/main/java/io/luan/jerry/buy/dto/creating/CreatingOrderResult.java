package io.luan.jerry.buy.dto.creating;

import io.luan.jerry.common.dto.BaseDTO;
import io.luan.jerry.order.domain.Order;
import io.luan.jerry.user.domain.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

/**
 * Result of the creating order request.
 * Creates and stores potentially many orders
 *
 * Orders need to be enabled to take effect
 *
 * @author Guangmiao Luan
 * @since 7/3/2016
 */
@Data
public class CreatingOrderResult extends BaseDTO {

    private User buyer;
    private List<Order> orders = new ArrayList<>();

    @Override
    public void validate() {
        checkNotNull(buyer);
        checkNotNull(orders);
        checkState(orders.size() > 0);
    }
}
