package com.redwood.core.common.handle;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import java.util.List;

public class MybaitsQueryWrapper<T> {

    public QueryWrapper<T> getQueryWrapper(List<DataFilter> dataFilters, List<DataSort> dataSorts){
        QueryWrapper<T> ew = new QueryWrapper();

        if (dataFilters != null && dataFilters.size() > 0){
            for (var item : dataFilters){

                switch (item.getComparison().toLowerCase())
                {
                    case "lt":
                        ew.lt(item.getField(), item.getValue());
                        break;
                    case "gt":
                        ew.gt(item.getField(), item.getValue());
                        break;
                    case "le":
                        ew.le(item.getField(), item.getValue());
                        break;
                    case "ge":
                        ew.ge(item.getField(), item.getValue());
                        break;
                    case "eq":
                        ew.eq(item.getField(), item.getValue());
                        break;
                    case "uq":
                        ew.ne(item.getField(), item.getValue());
                        break;
                    case"lk":
                        ew.like(item.getField(), item.getValue());
                        break;
                    case "lkr"://右模糊
                        ew.likeRight(item.getField(), item.getValue());
                        break;
                    case "lkl"://左模糊
                        ew.likeLeft(item.getField(), item.getValue());
                        break;
                    case "in":
                        ew.inSql(item.getField(), item.getValue().toString());
                        break;
                    case "isnull":
                        ew.isNull(item.getField());
                        break;
                    case "notnull":
                        ew.isNotNull(item.getField());
                        break;
                    default:
                        ew.eq(item.getField(), item.getValue());
                        break;
                }
            }
        }

        if (dataSorts != null && dataSorts.size() > 0){
            for (var item : dataSorts) {
                if(item.getProperty() != null)
                {
                    ew.orderBy(true,item.getDirection().toUpperCase().equals("ASC"), item.getProperty());
                }
            }
        }

        return ew;
    }
}
