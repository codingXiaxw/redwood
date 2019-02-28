package com.redwood.core.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 用户表 用户表（核心系统体系）(RdCoreUser)实体类
 *
 * @author makejava
 * @since 2019-02-28 12:49:05
 */
@Data
@TableName("rd_core_user")
public class CoreUser implements Serializable {

    private static final long serialVersionUID = 101621039835008997L;
    //编号    
    @TableId(type = IdType.AUTO,value = "user_id")
    private Integer user_id;
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
    //用户姓名    
    @TableField("user_name")
    private String user_name;
    //用户手机    
    @TableField("user_phone")
    private String user_phone;
    //用户当前居住房屋    
    @TableField("current_house_id")
    private Double current_house_id;
    //用户当前职业    
    @TableField("current_occupation")
    private Integer current_occupation;
    //用户当前登记地址    
    @TableField("live_address")
    private String live_address;
    //用户身份证登记地址    
    @TableField("idcard_address")
    private String idcard_address;
    //用户身份证号码    
    @TableField("idcard_number")
    private String idcard_number;
    //身份证正面    
    @TableField("idcard_image_a")
    private String idcard_image_a;
    //身份证反面    
    @TableField("idcard_image_b")
    private String idcard_image_b;
    //用户身份证认证状态    
    @TableField("user_idcard_certified")
    private Integer user_idcard_certified;
    //用户最高学历    
    @TableField("high_school")
    private String high_school;
    //用户毕业学校    
    @TableField("school_name")
    private String school_name;
    //用户工作单位    
    @TableField("company_name")
    private String company_name;
    //用户工作单位地址    
    @TableField("company_address")
    private String company_address;
    //创建人    
    @TableField("cr_user")
    private Integer cr_user;
    //添加时间    
    @TableField("cr_time")
    private Integer cr_time;
    //更新人    
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
    //用户状态 已暂停、使用中    
    @TableField("user_state")
    private Integer user_state;
}