package com.redwood.core.dao;

import com.redwood.core.entity.CoreLandlord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * 房东表 房东表（核心系统体系）(RdCoreLandlord)表数据库访问层
 *
 * @author makejava
 * @since 2019-02-28 12:49:05
 */
@Repository
public interface CoreLandlordDao extends BaseMapper<CoreLandlord>{

}