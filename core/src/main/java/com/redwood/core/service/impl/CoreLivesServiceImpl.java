package com.redwood.core.service.impl;

import com.redwood.core.entity.CoreLives;
import com.redwood.core.dao.CoreLivesDao;
import com.redwood.core.service.CoreLivesService;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 入住表 入住表（核心系统体系）(RdCoreLives)表服务实现类
 *
 * @author makejava
 * @since 2019-02-28 12:51:54
 */
@Service("coreLivesService")
public class CoreLivesServiceImpl implements CoreLivesService {
    @Resource
    private CoreLivesDao coreLivesDao;

}