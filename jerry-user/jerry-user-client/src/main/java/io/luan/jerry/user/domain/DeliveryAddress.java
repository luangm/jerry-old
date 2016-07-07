package io.luan.jerry.user.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Delivery Address for buyer
 *
 * @author Guangmiao Luan
 * @since 7/7/2016
 */
@Data
public class DeliveryAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * DB ID
     */
    private Long id;

    /**
     * The associated buyerID
     */
    private Long buyerId;

    /**
     * Receiver's full name
     */
    private String fullName;

    /**
     * Detailed Address info
     */
    private String addressDetail;

    /**
     * Phone num
     */
    private String phone;


}
