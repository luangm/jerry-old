package io.luan.jerry.buy.dto;

import io.luan.jerry.common.dto.BaseDTO;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

/**
 * The Main DTO for each Order
 * Order contains multiple OrderLines
 *
 * @author Guangmiao Luan
 * @since 7/7/2016
 */
@Data
public class OrderDTO extends BaseDTO {

    private List<OrderLineDTO> orderLines = new ArrayList<>();

    @Override
    public void validate() {
        checkNotNull(orderLines);
        checkState(orderLines.size() > 0);

        orderLines.forEach(OrderLineDTO::validate);
    }
}
