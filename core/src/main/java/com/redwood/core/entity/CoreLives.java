package com.redwood.core.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 入住表 入住表（核心系统体系）(RdCoreLives)实体类
 *
 * @author makejava
 * @since 2019-02-28 12:49:05
 */
@Data
@TableName("rd_core_lives")
public class CoreLives implements Serializable {

    private static final long serialVersionUID = 366472217573002432L;
    //入住编号    
    @TableField("live_id")
    private Integer live_id;
    //所属房屋id    
    @TableField("house_id")
    private Integer house_id;
    //所属房东id    
    @TableField("landlord_id")
    private Integer landlord_id;
    //入住用户    
    @TableField("user_id")
    private Integer user_id;
    //入住时间    
    @TableField("live_time")
    private Integer live_time;
    //入住人数    
    @TableField("live_number")
    private Integer live_number;
    //入住状态 等待入住、已入住、已退房    
    @TableField("live_state")
    private Integer live_state;
    //创建人    
    @TableField("cr_user")
    private Integer cr_user;
    //创建时间    
    @TableField("cr_time")
    private Integer cr_time;
    //修改人    
    @TableField("up_time")
    private Integer up_time;
    //修改时间    
    @TableField("up_user")
    private Integer up_user;
    //审核人    
    @TableField("audit_user")
    private Integer audit_user;
    //审核时间    
    @TableField("audit_time")
    private Integer audit_time;
    //审核状态    
    @TableField("audit_state")
    private Integer audit_state;
}