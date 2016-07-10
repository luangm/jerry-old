package io.luan.jerry.buy.dto;

import io.luan.jerry.common.dto.BaseDTO;
import lombok.Data;

/**
 * @author Guangmiao Luan
 * @since 7/7/2016
 */
@Data
public class DeliveryAddressDTO extends BaseDTO {

    private String name;
    private String address;
    private String phone;

    @Override
    public void validate() {

    }
}
