package com.redwood.core.service.impl;

import com.redwood.core.entity.CoreBuilding;
import com.redwood.core.dao.CoreBuildingDao;
import com.redwood.core.service.CoreBuildingService;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 楼房表 楼房表（核心系统体系）(RdCoreBuilding)表服务实现类
 *
 * @author makejava
 * @since 2019-02-28 12:51:54
 */
@Service("coreBuildingService")
public class CoreBuildingServiceImpl implements CoreBuildingService {
    @Resource
    private CoreBuildingDao coreBuildingDao;

}