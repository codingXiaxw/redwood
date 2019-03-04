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
 * @author laymat
 * @since 2019-03-04 14:52:23
 */
@Data
@TableName("rd_core_landlord")
public class CoreLandlord implements Serializable {

    private static final long serialVersionUID = -81971781785946857L;
    //编号    
    @TableId(type = IdType.AUTO,value = "landlord_id")
    private Integer landlordId;
    //账户id    
    @TableField("account_id")
    private Integer accountId;
    //微信id    
    @TableField("wx_id")
    private String wxId;
    //微信名    
    @TableField("wx_name")
    private String wxName;
    //微信头像    
    @TableField("wx_head_url")
    private String wxHeadUrl;
    //房东姓名    
    @TableField("landlord_name")
    private String landlordName;
    //房东手机    
    @TableField("landlord_phone")
    private String landlordPhone;
    //房东身份证正面    
    @TableField("landlord_idcard_a")
    private String landlordIdcardA;
    //房东身份证反面    
    @TableField("landlord_idcard_b")
    private String landlordIdcardB;
    //账户余额    
    @TableField("account_money")
    private Object accountMoney;
    //冻结金额    
    @TableField("freeze_money")
    private Object freezeMoney;
    //添加人    
    @TableField("cr_user")
    private Integer crUser;
    //添加时间    
    @TableField("cr_time")
    private Integer crTime;
    //修改人    
    @TableField("up_user")
    private Integer upUser;
    //更新时间    
    @TableField("up_time")
    private Integer upTime;
    //审核人    
    @TableField("audit_user")
    private Integer auditUser;
    //审核时间    
    @TableField("audit_time")
    private Integer auditTime;
    //房东审核状态 等待审核、审核中、已通过    
    @TableField("audit_state")
    private Integer auditState;
    //房东状态 已暂停、正常、已销户    
    @TableField("landlord_state")
    private Integer landlordState;
}