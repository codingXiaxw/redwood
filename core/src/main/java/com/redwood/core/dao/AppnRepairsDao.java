package com.redwood.core.dao;

import com.redwood.core.entity.AppnRepairs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * 报修表 报修表（增值体系）(RdAppnRepairs)表数据库访问层
 *
 * @author makejava
 * @since 2019-02-28 12:49:05
 */
@Repository
public interface AppnRepairsDao extends BaseMapper<AppnRepairs>{

}