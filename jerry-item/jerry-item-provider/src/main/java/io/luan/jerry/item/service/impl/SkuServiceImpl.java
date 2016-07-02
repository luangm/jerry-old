package io.luan.jerry.item.service.impl;

import io.luan.jerry.item.converter.SkuConverter;
import io.luan.jerry.item.dao.SkuDAO;
import io.luan.jerry.item.domain.Item;
import io.luan.jerry.item.domain.Sku;
import io.luan.jerry.item.po.SkuPO;
import io.luan.jerry.item.service.ItemService;
import io.luan.jerry.item.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Guangmiao Luan
 * @since 7/2/2016
 */
@Service("skuService")
public class SkuServiceImpl implements SkuService {

    @Autowired
    private SkuDAO skuDao;

    @Autowired
    private SkuConverter skuConverter;

    @Autowired
    private ItemService itemService;

    @Override
    public Sku getSku(Long skuId) {
        if (skuId == null) {
            return null;
        }

        SkuPO po = skuDao.getSku(skuId);
        if (po == null) {
            return null;
        }

        Sku sku = skuConverter.convert(po);

        if (sku.getItemId() != null) {
            Item item = itemService.getItem(sku.getItemId());
            sku.setItem(item);
        }

        return sku;
    }

    @Override
    public List<Sku> getSkusByItemId(Long itemId) {
        List<Sku> list = new ArrayList<>();
        if (itemId != null) {

            Item item = itemService.getItem(itemId);
            if (item != null) {
                List<SkuPO> poList = skuDao.getSkusByItemId(itemId);
                if (poList != null) {
                    for (SkuPO po : poList) {
                        Sku sku = skuConverter.convert(po);
                        sku.setItem(item);
                        list.add(sku);
                    }
                }
            }
        }

        return list;
    }
}
