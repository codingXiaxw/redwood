package com.redwood.core.dao;

import com.redwood.core.entity.CoreUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * 用户表 用户表（核心系统体系）(RdCoreUser)表数据库访问层
 *
 * @author makejava
 * @since 2019-02-28 12:49:05
 */
@Repository
public interface CoreUserDao extends BaseMapper<CoreUser>{

}