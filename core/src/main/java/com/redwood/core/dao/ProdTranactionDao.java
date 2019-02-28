package com.redwood.core.dao;

import com.redwood.core.entity.ProdTranaction;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * 交易流水表(RdProdTranaction)表数据库访问层
 *
 * @author makejava
 * @since 2019-02-28 12:49:05
 */
@Repository
public interface ProdTranactionDao extends BaseMapper<ProdTranaction>{

}