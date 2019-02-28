package com.redwood.core.service.impl;

import com.redwood.core.entity.CoreHouse;
import com.redwood.core.dao.CoreHouseDao;
import com.redwood.core.service.CoreHouseService;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 房屋表 房屋表（核心系统体系）(RdCoreHouse)表服务实现类
 *
 * @author makejava
 * @since 2019-02-28 12:51:54
 */
@Service("coreHouseService")
public class CoreHouseServiceImpl implements CoreHouseService {
    @Resource
    private CoreHouseDao coreHouseDao;

}