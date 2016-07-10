package io.luan.jerry.order.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Guangmiao Luan
 * @since 7/3/2016
 */
@Data
public class PayOrderPO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer status;

    private Long buyerId;

    private Long sellerId;
}
