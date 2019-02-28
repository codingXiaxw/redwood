package com.redwood.core.dao;

import com.redwood.core.entity.ProdOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * 用户订单表 订单表（产品体系）(RdProdOrder)表数据库访问层
 *
 * @author makejava
 * @since 2019-02-28 12:49:05
 */
@Repository
public interface ProdOrderDao extends BaseMapper<ProdOrder>{

}