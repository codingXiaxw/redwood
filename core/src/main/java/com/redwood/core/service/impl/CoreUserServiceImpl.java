package com.redwood.core.service.impl;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.redwood.core.entity.CoreUser;
import com.redwood.core.dao.CoreUserDao;
import com.redwood.core.service.CoreUserService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

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

    @Override
    public boolean save(CoreUser coreUser) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<CoreUser> collection, int i) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<CoreUser> collection, int i) {
        for (var user : collection) {
            var queryWrapper = new QueryWrapper<CoreUser>().eq("wx_id", user.getWxId());
            var userResultList = coreUserDao.selectList(queryWrapper);

            if (userResultList.size() == 0) {
                user.setCrTime((int) DateUtil.currentSeconds());
                user.setCrUser(0);
                coreUserDao.insert(user);
            } else {
                var userResult = userResultList.get(0);
                var update = false;
                if (!user.getWxName().equals(userResult.getWxName())) {
                    userResult.setWxName(user.getWxName());
                    update = true;
                }
                if (!user.getWxHeadUrl().equals(userResult.getWxHeadUrl())) {
                    userResult.setWxHeadUrl(user.getWxHeadUrl());
                    update = true;
                }
                if (!user.getWxProvince().equals(userResult.getWxProvince())) {
                    userResult.setWxProvince(user.getWxProvince());
                    update = true;
                }
                if (!user.getWxCity().equals(userResult.getWxCity())) {
                    userResult.setWxCity(user.getWxCity());
                    update = true;
                }
                if (!user.getWxCountry().equals(userResult.getWxCountry())) {
                    userResult.setWxCountry(user.getWxCountry());
                    update = true;
                }
                if (!user.getWxGender().equals(userResult.getWxGender())) {
                    userResult.setWxGender(user.getWxGender());
                    update = true;
                }

                if (update) {
                    userResult.setUpTime((int) DateUtil.currentSeconds());
                    userResult.setUpUser(0);
                }
                coreUserDao.updateById(userResult);
            }
        }
        return true;
    }

    @Override
    public boolean removeById(Serializable serializable) {
        return false;
    }

    @Override
    public boolean removeByMap(Map<String, Object> map) {
        return false;
    }

    @Override
    public boolean remove(Wrapper<CoreUser> wrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> collection) {
        return false;
    }

    @Override
    public boolean updateById(CoreUser coreUser) {
        return false;
    }

    @Override
    public boolean update(CoreUser coreUser, Wrapper<CoreUser> wrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<CoreUser> collection, int i) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(CoreUser coreUser) {
        return false;
    }

    @Override
    public CoreUser getById(Serializable serializable) {
        return null;
    }

    @Override
    public Collection<CoreUser> listByIds(Collection<? extends Serializable> collection) {
        return null;
    }

    @Override
    public Collection<CoreUser> listByMap(Map<String, Object> map) {
        return null;
    }

    @Override
    public CoreUser getOne(Wrapper<CoreUser> wrapper, boolean b) {
        return coreUserDao.selectOne(wrapper);
    }

    @Override
    public Map<String, Object> getMap(Wrapper<CoreUser> wrapper) {
        return null;
    }

    @Override
    public int count(Wrapper<CoreUser> wrapper) {
        return 0;
    }

    @Override
    public List<CoreUser> list(Wrapper<CoreUser> wrapper) {
        return null;
    }

    @Override
    public IPage<CoreUser> page(IPage<CoreUser> iPage, Wrapper<CoreUser> wrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<CoreUser> wrapper) {
        return null;
    }

    @Override
    public List<Object> listObjs(Wrapper<CoreUser> wrapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<CoreUser> iPage, Wrapper<CoreUser> wrapper) {
        return null;
    }
}