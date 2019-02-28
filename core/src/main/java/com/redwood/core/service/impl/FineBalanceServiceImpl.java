package com.redwood.core.service.impl;

import com.redwood.core.entity.FineBalance;
import com.redwood.core.dao.FineBalanceDao;
import com.redwood.core.service.FineBalanceService;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 结算表 结算表（财务系统体系）(RdFineBalance)表服务实现类
 *
 * @author makejava
 * @since 2019-02-28 12:51:54
 */
@Service("fineBalanceService")
public class FineBalanceServiceImpl implements FineBalanceService {
    @Resource
    private FineBalanceDao fineBalanceDao;

}