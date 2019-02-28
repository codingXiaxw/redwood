package com.redwood.core.service.impl;

import com.redwood.core.entity.ProdAuction;
import com.redwood.core.dao.ProdAuctionDao;
import com.redwood.core.service.ProdAuctionService;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 房屋拍租表 拍租表（产品体系）(RdProdAuction)表服务实现类
 *
 * @author makejava
 * @since 2019-02-28 12:51:54
 */
@Service("prodAuctionService")
public class ProdAuctionServiceImpl implements ProdAuctionService {
    @Resource
    private ProdAuctionDao prodAuctionDao;

}