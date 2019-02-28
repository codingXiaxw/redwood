package com.redwood.core.service.impl;

import com.redwood.core.entity.CoreLandlord;
import com.redwood.core.dao.CoreLandlordDao;
import com.redwood.core.service.CoreLandlordService;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 房东表 房东表（核心系统体系）(RdCoreLandlord)表服务实现类
 *
 * @author makejava
 * @since 2019-02-28 12:51:54
 */
@Service("coreLandlordService")
public class CoreLandlordServiceImpl implements CoreLandlordService {
    @Resource
    private CoreLandlordDao coreLandlordDao;

}