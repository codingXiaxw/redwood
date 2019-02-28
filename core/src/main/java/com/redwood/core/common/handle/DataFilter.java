package com.redwood.core.common.handle;

import lombok.Data;

/*
extjs data filter
 */
@Data
public class DataFilter {

    /**
     * 字段
     */
    private String field;

    /**
     * 值
     */
    private Object value;

    /**
     * 对比
     */
    private String comparison;

    /**
     * 条件
     */
    private String where;
}
