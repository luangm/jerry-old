package io.luan.jerry.buy.domain;

import io.luan.jerry.common.domain.BaseDO;
import io.luan.jerry.user.domain.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * A full in memory model of an order
 * This is used to send to OrderStoreService to store the order
 *
 * @author Guangmiao Luan
 * @since 7/7/2016
 */
@Data
public class OrderSpec extends BaseDO {

    private User buyer;

    private List<OrderLineSpec> orderLines = new ArrayList<>();

}
