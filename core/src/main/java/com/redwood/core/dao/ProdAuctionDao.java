package com.redwood.core.dao;

import com.redwood.core.entity.ProdAuction;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * 房屋拍租表 拍租表（产品体系）(RdProdAuction)表数据库访问层
 *
 * @author makejava
 * @since 2019-02-28 12:49:05
 */
@Repository
public interface ProdAuctionDao extends BaseMapper<ProdAuction>{

}