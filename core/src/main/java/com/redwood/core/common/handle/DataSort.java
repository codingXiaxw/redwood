package com.redwood.core.common.handle;

import lombok.Data;

@Data
public class DataSort {

    /**
     * 要排序的字段
     */
    private String property;

    /**
     * 排序类型
     */
    private String direction;

}
