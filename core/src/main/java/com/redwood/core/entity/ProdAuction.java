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
 * @author makejava
 * @since 2019-02-28 12:49:05
 */
@Data
@TableName("rd_prod_auction")
public class ProdAuction implements Serializable {

    private static final long serialVersionUID = -28298843467432592L;
    //编号    
    @TableId(type = IdType.AUTO,value = "id")
    private Integer id;
    //拍租房屋id    
    @TableField("floor_id")
    private Integer floor_id;
    //拍租底价    
    @TableField("floor_price")
    private Object floor_price;
    //拍租类型 固定价格、自定义价格    
    @TableField("price_type")
    private Integer price_type;
    //当前拍租价格    
    @TableField("current_price")
    private Object current_price;
    //当前拍租用户id    
    @TableField("current_user_id")
    private Integer current_user_id;
    //当前拍租时间    
    @TableField("current_time")
    private Integer current_time;
    //目前拍租次数    
    @TableField("auction_number")
    private Integer auction_number;
    //拍租房东id    
    @TableField("landlord_id")
    private Integer landlord_id;
    //拍租状态 等待开始、进行中、已完成    
    @TableField("auction_state")
    private Integer auction_state;
    //创建人    
    @TableField("cr_user")
    private Integer cr_user;
    //创建时间    
    @TableField("cr_time")
    private Integer cr_time;
    //修改人    
    @TableField("up_user")
    private Integer up_user;
    //修改时间    
    @TableField("up_time")
    private Integer up_time;
    //审核人    
    @TableField("audit_user")
    private Integer audit_user;
    //审核时间    
    @TableField("audit_time")
    private Integer audit_time;
}