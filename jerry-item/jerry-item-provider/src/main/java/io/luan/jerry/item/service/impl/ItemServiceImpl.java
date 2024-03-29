package io.luan.jerry.item.service.impl;

import io.luan.jerry.item.converter.ItemConverter;
import io.luan.jerry.item.dao.ItemDAO;
import io.luan.jerry.item.domain.Item;
import io.luan.jerry.item.domain.Product;
import io.luan.jerry.item.po.ItemPO;
import io.luan.jerry.item.service.ItemService;
import io.luan.jerry.item.service.ProductService;
import io.luan.jerry.user.domain.User;
import io.luan.jerry.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Guangmiao Luan
 * @since 7/2/2016
 */
@Service("itemService")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDAO itemDao;

    @Autowired
    private ItemConverter itemConverter;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Override
    public Item getItem(Long itemId) {
        if (itemId == null) {
            return null;
        }

        ItemPO po = itemDao.getItem(itemId);
        if (po == null) {
            return null;
        }

        Item item = itemConverter.convert(po);

        if (item.getSellerId() != null) {
            User seller = userService.getUser(item.getSellerId());
            item.setSeller(seller);
        }

        if (item.getProductId() != null) {
            Product product = productService.getProduct(item.getProductId());
            item.setProduct(product);
        }

        return item;
    }
}
