package io.luan.jerry.buy.domain;

import io.luan.jerry.common.domain.BaseDO;
import io.luan.jerry.item.domain.Item;
import io.luan.jerry.item.domain.Sku;
import lombok.Data;

/**
 * An order in memory, after splitting orders
 *
 *
 * @author Guangmiao Luan
 * @since 7/7/2016
 */
@Data
public class OrderLineSpec extends BaseDO {

    private Item item;

    private Sku sku;

    private int quantity;
}
