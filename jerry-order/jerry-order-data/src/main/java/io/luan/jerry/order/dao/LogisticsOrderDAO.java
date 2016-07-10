package io.luan.jerry.order.dao;

import io.luan.jerry.order.po.LogisticsOrderPO;

/**
 * @author Guangmiao Luan
 * @since 7/3/2016
 */
public interface LogisticsOrderDAO {

    LogisticsOrderPO getLogisticsOrder(Long logisticsOrderId);

    int addLogisticsOrder(LogisticsOrderPO logisticsOrderPO);

    int enableLogisticsOrder(Long logisticsOrderId);
}
