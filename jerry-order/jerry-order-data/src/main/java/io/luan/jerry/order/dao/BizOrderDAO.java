package io.luan.jerry.order.dao;

import io.luan.jerry.order.po.BizOrderPO;

/**
 * @author Guangmiao Luan
 * @since 7/3/2016
 */
public interface BizOrderDAO {

    BizOrderPO getBizOrder(Long bizOrderId);

    int addBizOrder(BizOrderPO bizOrderPO);
}
