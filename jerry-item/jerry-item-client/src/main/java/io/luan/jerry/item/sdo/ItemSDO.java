package io.luan.jerry.item.sdo;

import io.luan.jerry.shop.domain.Shop;
import lombok.Data;

/**
 * Item - Product for a seller
 */
@Data
public class ItemSDO {

    private Long itemId;
    private Long productId;
    private ProductSDO product;
    private Long sellerId;
    private Shop seller;

}
