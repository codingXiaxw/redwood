package com.redwood.core.service.impl;

import com.redwood.core.entity.CoreUser;
import com.redwood.core.dao.CoreUserDao;
import com.redwood.core.service.CoreUserService;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表 用户表（核心系统体系）(RdCoreUser)表服务实现类
 *
 * @author makejava
 * @since 2019-02-28 12:51:54
 */
@Service("coreUserService")
public class CoreUserServiceImpl implements CoreUserService {
    @Resource
    private CoreUserDao coreUserDao;

}