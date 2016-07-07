package io.luan.jerry.common.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Base class for all DTO classes
 *
 * All DTOs can be checked for validity.
 *
 * @author Guangmiao Luan
 * @since 7/7/2016
 */
@Data
public abstract class BaseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Checks the validity of the DTO.
     * Throws exception if the DTO is not in a valid state
     */
    public abstract void validate();
}
