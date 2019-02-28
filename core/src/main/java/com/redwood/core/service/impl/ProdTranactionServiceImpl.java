package com.redwood.core.service.impl;

import com.redwood.core.entity.ProdTranaction;
import com.redwood.core.dao.ProdTranactionDao;
import com.redwood.core.service.ProdTranactionService;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 交易流水表(RdProdTranaction)表服务实现类
 *
 * @author makejava
 * @since 2019-02-28 12:51:54
 */
@Service("prodTranactionService")
public class ProdTranactionServiceImpl implements ProdTranactionService {
    @Resource
    private ProdTranactionDao prodTranactionDao;

}