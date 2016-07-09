package io.luan.jerry.buy.domain;

import io.luan.jerry.common.domain.BaseDO;
import io.luan.jerry.item.domain.Item;
import io.luan.jerry.item.domain.Sku;
import io.luan.jerry.user.domain.User;
import lombok.Data;

/**
 * An OrderLine in memory containing all the domain objects filled from different services.
 * This is used for validation etc.
 *
 *
 * @author Guangmiao Luan
 * @since 7/7/2016
 */
@Data
public class OrderLineSpec extends BaseDO {

    private Sku sku;

    private Item item;

    /**
     * Taken from item.seller
     */
    private User seller;

    private int quantity;

    /**
     * Taken from sku.price
     */
    private long unitPrice;
}
