package io.luan.jerry.item.po;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Miao on 6/25/2016.
 */
@Data
public class SkuPO implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private long itemId;
    private String skuTitle;

    private long inventory;
    private long price;
}
