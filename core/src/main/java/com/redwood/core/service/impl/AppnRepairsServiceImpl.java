package com.redwood.core.service.impl;

import com.redwood.core.entity.AppnRepairs;
import com.redwood.core.dao.AppnRepairsDao;
import com.redwood.core.service.AppnRepairsService;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 报修表 报修表（增值体系）(RdAppnRepairs)表服务实现类
 *
 * @author makejava
 * @since 2019-02-28 12:51:54
 */
@Service("appnRepairsService")
public class AppnRepairsServiceImpl implements AppnRepairsService {
    @Resource
    private AppnRepairsDao appnRepairsDao;

}