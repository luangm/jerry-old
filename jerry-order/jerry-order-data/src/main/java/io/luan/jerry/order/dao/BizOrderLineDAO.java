package io.luan.jerry.order.dao;

import io.luan.jerry.order.po.BizOrderLinePO;

/**
 * @author Guangmiao Luan
 * @since 7/3/2016
 */
public interface BizOrderLineDAO {

    BizOrderLinePO getBizOrderLine(Long bizOrderLineId);

    int addBizOrderLine(BizOrderLinePO bizOrderLinePO);
}
