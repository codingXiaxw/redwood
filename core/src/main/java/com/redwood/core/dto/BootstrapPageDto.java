package com.redwood.core.dto;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;

import java.util.List;

@Data
public class BootstrapPageDto {
    public BootstrapPageDto(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public BootstrapPageDto(IPage page,List list){
        this.total = page.getTotal();
        this.rows = list;
    }

    private long total;
    private List rows;
}
