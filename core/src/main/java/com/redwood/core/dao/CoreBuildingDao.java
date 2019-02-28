package com.redwood.core.dao;

import com.redwood.core.entity.CoreBuilding;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * 楼房表 楼房表（核心系统体系）(RdCoreBuilding)表数据库访问层
 *
 * @author makejava
 * @since 2019-02-28 12:49:05
 */
@Repository
public interface CoreBuildingDao extends BaseMapper<CoreBuilding>{

}