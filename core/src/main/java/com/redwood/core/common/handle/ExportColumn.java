package com.redwood.core.common.handle;

import lombok.Data;

/*
导出的列
 */
@Data
public class ExportColumn
{
    /**
     * 列名
     */
    private String text;

    /**
     * 字段
     */
    private String dataIndex;

    /**
     * 宽度
     */
    private Integer width;
}