package com.redwood.core.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;


/**
 * 用户表 用户表（核心系统体系）(RdCoreUser)实体类
 *
 * @author laymat
 * @since 2019-03-04 15:10:29
 */
@Data
@TableName("rd_core_user")
public class CoreUser implements Serializable {

    private static final long serialVersionUID = 634748743865745255L;
    //编号    
    @TableId(type = IdType.AUTO,value = "user_id")
    private Integer userId;
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
    //用户性别    
    @TableField("wx_gender")
    private Integer wxGender;
    //微信国家    
    @TableField("wx_province")
    private String wxProvince;
    //微信城市    
    @TableField("wx_city")
    private String wxCity;
    //微信区域    
    @TableField("wx_country")
    private String wxCountry;
    //微信unionId    
    @TableField("wx_union_id")
    private String wxUnionId;
    //用户姓名    
    @TableField("user_name")
    private String userName;
    //用户手机    
    @TableField("user_phone")
    private String userPhone;
    //用户当前居住房屋    
    @TableField("current_house_id")
    private Double currentHouseId;
    //用户当前职业    
    @TableField("current_occupation")
    private Integer currentOccupation;
    //用户当前登记地址    
    @TableField("live_address")
    private String liveAddress;
    //用户身份证登记地址    
    @TableField("idcard_address")
    private String idcardAddress;
    //用户身份证号码    
    @TableField("idcard_number")
    private String idcardNumber;
    //身份证正面    
    @TableField("idcard_image_a")
    private String idcardImageA;
    //身份证反面    
    @TableField("idcard_image_b")
    private String idcardImageB;
    //用户身份证认证状态    
    @TableField("user_idcard_certified")
    private Integer userIdcardCertified;
    //用户最高学历    
    @TableField("high_school")
    private String highSchool;
    //用户毕业学校    
    @TableField("school_name")
    private String schoolName;
    //用户工作单位    
    @TableField("company_name")
    private String companyName;
    //用户工作单位地址    
    @TableField("company_address")
    private String companyAddress;
    //创建人    
    @TableField("cr_user")
    private Integer crUser;
    //添加时间    
    @TableField("cr_time")
    private Integer crTime;
    //更新人    
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
    //用户状态 已暂停、使用中    
    @TableField("user_state")
    private Integer userState;
}