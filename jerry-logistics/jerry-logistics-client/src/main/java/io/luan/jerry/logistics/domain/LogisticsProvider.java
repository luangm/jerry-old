package io.luan.jerry.logistics.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Miao on 6/25/2016.
 */
@Data
public class LogisticsProvider implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
}
