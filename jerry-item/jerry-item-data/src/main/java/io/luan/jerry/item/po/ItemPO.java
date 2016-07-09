package io.luan.jerry.item.po;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Miao on 6/25/2016.
 */
@Data
public class ItemPO implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    private int categoryId;
    private long productId;
    private long sellerId;
    private String title;
}
