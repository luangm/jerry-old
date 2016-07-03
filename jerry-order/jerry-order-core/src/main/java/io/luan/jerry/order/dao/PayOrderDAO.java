package io.luan.jerry.order.dao;

import io.luan.jerry.order.po.PayOrderPO;

/**
 * @author Guangmiao Luan
 * @since 7/3/2016
 */
public interface PayOrderDAO {

    PayOrderPO getPayOrder(Long payOrderId);
}
