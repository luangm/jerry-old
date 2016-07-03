package io.luan.jerry.order.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Guangmiao Luan
 * @since 7/3/2016
 */
@Data
public class BizOrderLinePO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Long bizOrderId;

    private Long itemId;
    private Long skuId;
    private Long unitPrice;
    private Integer quantity;

    private String itemTitle;
    private String skuTitle;
}
