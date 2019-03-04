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
 * @author laymat
 * @since 2019-03-04 14:52:23
 */
@Data
@TableName("rd_core_lives")
public class CoreLives implements Serializable {

    private static final long serialVersionUID = 802845233773276790L;
    //入住编号    
    @TableField("live_id")
    private Integer liveId;
    //所属房屋id    
    @TableField("house_id")
    private Integer houseId;
    //所属房东id    
    @TableField("landlord_id")
    private Integer landlordId;
    //入住用户    
    @TableField("user_id")
    private Integer userId;
    //入住时间    
    @TableField("live_time")
    private Integer liveTime;
    //入住人数    
    @TableField("live_number")
    private Integer liveNumber;
    //入住状态 等待入住、已入住、已退房    
    @TableField("live_state")
    private Integer liveState;
    //创建人    
    @TableField("cr_user")
    private Integer crUser;
    //创建时间    
    @TableField("cr_time")
    private Integer crTime;
    //修改人    
    @TableField("up_time")
    private Integer upTime;
    //修改时间    
    @TableField("up_user")
    private Integer upUser;
    //审核人    
    @TableField("audit_user")
    private Integer auditUser;
    //审核时间    
    @TableField("audit_time")
    private Integer auditTime;
    //审核状态    
    @TableField("audit_state")
    private Integer auditState;
}