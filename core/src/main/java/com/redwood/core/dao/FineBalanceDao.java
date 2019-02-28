package com.redwood.core.dao;

import com.redwood.core.entity.FineBalance;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * 结算表 结算表（财务系统体系）(RdFineBalance)表数据库访问层
 *
 * @author makejava
 * @since 2019-02-28 12:49:05
 */
@Repository
public interface FineBalanceDao extends BaseMapper<FineBalance>{

}