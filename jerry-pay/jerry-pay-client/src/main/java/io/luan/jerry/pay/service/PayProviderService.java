package io.luan.jerry.pay.service;

import io.luan.jerry.pay.domain.PayProvider;

/**
 * @author Guangmiao Luan
 * @since 7/10/2016
 */
public interface PayProviderService {

    PayProvider getPayProvider(Integer providerId);
}
