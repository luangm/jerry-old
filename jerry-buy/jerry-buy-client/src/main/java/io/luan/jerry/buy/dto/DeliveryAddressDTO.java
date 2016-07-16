package io.luan.jerry.buy.dto;

import io.luan.jerry.common.dto.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Guangmiao Luan
 * @since 7/7/2016
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DeliveryAddressDTO extends BaseDTO {

    private String name;
    private String address;
    private String phone;

    @Override
    public void validate() {

    }
}
