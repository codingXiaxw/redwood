package com.redwood.core.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 房东表 房东表（核心系统体系）(RdCoreLandlord)实体类
 *
 * @author makejava
 * @since 2019-02-28 12:49:05
 */
@Data
@TableName("rd_core_landlord")
public class CoreLandlord implements Serializable {

    private static final long serialVersionUID = -98662290462607537L;
    //编号    
    @TableId(type = IdType.AUTO,value = "landlord_id")
    private Integer landlord_id;
    //账户id    
    @TableField("account_id")
    private Integer account_id;
    //微信id    
    @TableField("wx_id")
    private String wx_id;
    //微信名    
    @TableField("wx_name")
    private String wx_name;
    //微信头像    
    @TableField("wx_head_url")
    private String wx_head_url;
    //房东姓名    
    @TableField("landlord_name")
    private String landlord_name;
    //房东手机    
    @TableField("landlord_phone")
    private String landlord_phone;
    //房东身份证正面    
    @TableField("landlord_idcard_a")
    private String landlord_idcard_a;
    //房东身份证反面    
    @TableField("landlord_idcard_b")
    private String landlord_idcard_b;
    //账户余额    
    @TableField("account_money")
    private Object account_money;
    //冻结金额    
    @TableField("freeze_money")
    private Object freeze_money;
    //添加人    
    @TableField("cr_user")
    private Integer cr_user;
    //添加时间    
    @TableField("cr_time")
    private Integer cr_time;
    //修改人    
    @TableField("up_user")
    private Integer up_user;
    //更新时间    
    @TableField("up_time")
    private Integer up_time;
    //审核人    
    @TableField("audit_user")
    private Integer audit_user;
    //审核时间    
    @TableField("audit_time")
    private Integer audit_time;
    //房东审核状态 等待审核、审核中、已通过    
    @TableField("audit_state")
    private Integer audit_state;
    //房东状态 已暂停、正常、已销户    
    @TableField("landlord_state")
    private Integer landlord_state;
}