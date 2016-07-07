package io.luan.jerry.buy.dto;

import io.luan.jerry.common.dto.BaseDTO;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

/**
 * Request sent by either frontend or another service
 * Containing minimal information required to create a new order
 *
 * @author Guangmiao Luan
 * @since 7/3/2016
 */
@Data
public class CreatingOrderRequest extends BaseDTO {

    private long buyerId;
    private String buyerNick;
    private List<OrderDTO> orders = new ArrayList<>();
    private DeliveryAddressDTO deliveryAddress;

    @Override
    public void validate() {
        checkState(buyerId > 0);
        checkNotNull(orders);
        checkState(orders.size() > 0);
        checkNotNull(deliveryAddress);

        orders.forEach(OrderDTO::validate);
        deliveryAddress.validate();
    }
}
