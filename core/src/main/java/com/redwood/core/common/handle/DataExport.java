package com.redwood.core.common.handle;

import lombok.Data;

import java.util.List;

/*
数据导出
 */
@Data
public class DataExport {

    /**
     * 导出的列
     */
    private List<ExportColumn> ExportColumns;

    /**
     * 筛选条件
     */
    private List<DataFilter> ExportFilters;

    /**
     * 开窗查询条件
     */
    private List<DataFilter> ExportSearchParams;

    /**
     * 排序条件
     */
    private List<DataSort> ExportSorters;

    /**
     * 所选记录(json对象)
     */
    private String SelectedRecords;
}


