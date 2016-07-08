package io.luan.jerry.buy.dto;

import io.luan.jerry.common.dto.BaseDTO;
import lombok.Data;

import static com.google.common.base.Preconditions.checkState;

/**
 * @author Guangmiao Luan
 * @since 7/7/2016
 */
@Data
public class OrderLineDTO extends BaseDTO {

    /**
     * Item ID, must have. Cannot be zero
     */
    private long itemId;

    /**
     * Sku ID, must have. Cannot be zero
     */
    private long skuId;

    /**
     * quantity bought. Cannot be zero
     */
    private int quantity = 1;

    @Override
    public void validate() {
        checkState(itemId > 0);
        checkState(skuId >= 0);
        checkState(quantity > 0);
    }
}
