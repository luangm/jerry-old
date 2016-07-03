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
}
