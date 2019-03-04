package com.redwood.core.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 房屋拍租表 拍租表（产品体系）(RdProdAuction)实体类
 *
 * @author laymat
 * @since 2019-03-04 14:52:23
 */
@Data
@TableName("rd_prod_auction")
public class ProdAuction implements Serializable {

    private static final long serialVersionUID = 922381786335357999L;
    //编号    
    @TableId(type = IdType.AUTO,value = "id")
    private Integer id;
    //拍租房屋id    
    @TableField("floor_id")
    private Integer floorId;
    //拍租底价    
    @TableField("floor_price")
    private Object floorPrice;
    //拍租类型 固定价格、自定义价格    
    @TableField("price_type")
    private Integer priceType;
    //当前拍租价格    
    @TableField("current_price")
    private Object currentPrice;
    //当前拍租用户id    
    @TableField("current_user_id")
    private Integer currentUserId;
    //当前拍租时间    
    @TableField("current_time")
    private Integer currentTime;
    //目前拍租次数    
    @TableField("auction_number")
    private Integer auctionNumber;
    //拍租房东id    
    @TableField("landlord_id")
    private Integer landlordId;
    //拍租状态 等待开始、进行中、已完成    
    @TableField("auction_state")
    private Integer auctionState;
    //创建人    
    @TableField("cr_user")
    private Integer crUser;
    //创建时间    
    @TableField("cr_time")
    private Integer crTime;
    //修改人    
    @TableField("up_user")
    private Integer upUser;
    //修改时间    
    @TableField("up_time")
    private Integer upTime;
    //审核人    
    @TableField("audit_user")
    private Integer auditUser;
    //审核时间    
    @TableField("audit_time")
    private Integer auditTime;
}