package com.redwood.core.service.impl;

import com.redwood.core.entity.ProdOrder;
import com.redwood.core.dao.ProdOrderDao;
import com.redwood.core.service.ProdOrderService;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 用户订单表 订单表（产品体系）(RdProdOrder)表服务实现类
 *
 * @author makejava
 * @since 2019-02-28 12:51:54
 */
@Service("prodOrderService")
public class ProdOrderServiceImpl implements ProdOrderService {
    @Resource
    private ProdOrderDao prodOrderDao;

}