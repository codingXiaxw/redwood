package com.redwood.core.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 报修表 报修表（增值体系）(RdAppnRepairs)实体类
 *
 * @author makejava
 * @since 2019-02-28 12:49:05
 */
@Data
@TableName("rd_appn_repairs")
public class AppnRepairs implements Serializable {

    private static final long serialVersionUID = 844593756860423807L;
    //编号    
    @TableId(type = IdType.AUTO,value = "id")
    private Integer id;
    //维修单id    
    @TableField("repair_id")
    private String repair_id;
    //所属楼房id    
    @TableField("building_id")
    private Integer building_id;
    //所属房屋id    
    @TableField("landlord_id")
    private Integer landlord_id;
    //维修类型 空调维修、水电维修    
    @TableField("repair_type")
    private Integer repair_type;
    //维修描述    
    @TableField("repair_describe")
    private String repair_describe;
    //期望维修时间    
    @TableField("repair_expect_time")
    private Integer repair_expect_time;
    //支付方式 线上支付、线下支付    
    @TableField("pay_type")
    private Integer pay_type;
    //订单编号    
    @TableField("order_id")
    private String order_id;
    //所属房屋id    
    @TableField("house_id")
    private Integer house_id;
    //维修完成时间    
    @TableField("finsh_time")
    private Integer finsh_time;
    //维修单状态 等待接单、已接单、已完成    
    @TableField("repair_state")
    private Integer repair_state;
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