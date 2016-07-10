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

    private long id;
    private long bizOrderId;

    private long itemId;
    private long skuId;
    private long unitPrice;
    private int quantity;

    private String itemTitle;
    private String skuTitle;
}
