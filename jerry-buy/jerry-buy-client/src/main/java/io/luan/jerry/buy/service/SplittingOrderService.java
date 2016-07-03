package io.luan.jerry.buy.service;

/**
 * Given a list of items sold by (potentially) different sellers
 * Split the order request into multiple orders for storage
 *
 * The orders are split by the following rules:
 *
 * - Each order can only have one seller (can have multiple items sold by the same seller)
 *
 * @author Guangmiao Luan
 * @since 7/3/2016
 */
public interface SplittingOrderService {
}
