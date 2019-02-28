package com.redwood.core.service.impl;

import com.redwood.core.entity.FineAccount;
import com.redwood.core.dao.FineAccountDao;
import com.redwood.core.service.FineAccountService;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 资金表 资金表（财务系统体系）(RdFineAccount)表服务实现类
 *
 * @author makejava
 * @since 2019-02-28 12:51:54
 */
@Service("fineAccountService")
public class FineAccountServiceImpl implements FineAccountService {
    @Resource
    private FineAccountDao fineAccountDao;

}