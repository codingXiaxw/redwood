package com.redwood.core.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 房屋表 房屋表（核心系统体系）(RdCoreHouse)实体类
 *
 * @author laymat
 * @since 2019-03-04 14:52:23
 */
@Data
@TableName("rd_core_house")
public class CoreHouse implements Serializable {

    private static final long serialVersionUID = 752560143489267585L;
    //房屋编号    
    @TableId(type = IdType.AUTO,value = "house_id")
    private Integer houseId;
    //所属楼房 楼房编号,building_id    
    @TableField("building_id")
    private Integer buildingId;
    //所属房东    
    @TableField("landlord_id")
    private Integer landlordId;
    //房屋面积    
    @TableField("house_area")
    private Object houseArea;
    //房屋户型 一室一厅,两室一厅    
    @TableField("house_type")
    private Integer houseType;
    //房屋租金    
    @TableField("rent_money")
    private Object rentMoney;
    //支付方式 在线支付,现金支付    
    @TableField("rent_pay_type")
    private Integer rentPayType;
    //租金支付时间    
    @TableField("rent_pay_time")
    private Integer rentPayTime;
    //押金方式 押一付一，押一付二    
    @TableField("pledge_type")
    private Integer pledgeType;
    //押金金额    
    @TableField("pledge_money")
    private Object pledgeMoney;
    //出租方式 一口价、拍租、面谈    
    @TableField("lease_type")
    private Integer leaseType;
    //出租时间    
    @TableField("lease_time")
    private Integer leaseTime;
    //使用者微信id    
    @TableField("useing_wx_id")
    private String useingWxId;
    //租住人数    
    @TableField("useing_count")
    private Integer useingCount;
    //房屋装修水平 一般装修、精装修、豪装    
    @TableField("decoration_level")
    private Integer decorationLevel;
    //房屋标签    
    @TableField("house_tips")
    private String houseTips;
    //房屋家具配置    
    @TableField("house_furniture_configure")
    private String houseFurnitureConfigure;
    //出租合同    
    @TableField("contract")
    private String contract;
    //签约时间    
    @TableField("contract_time")
    private Integer contractTime;
    //合同开始时间    
    @TableField("contract_st_time")
    private Integer contractStTime;
    //合同到期时间    
    @TableField("contract_end_time")
    private Integer contractEndTime;
    //是否首页推荐    
    @TableField("index_page_display")
    private Integer indexPageDisplay;
    //出租状态 停止出租、等待出租、已出租、即将到期    
    @TableField("useing_type")
    private Integer useingType;
    //添加人    
    @TableField("cr_user")
    private Integer crUser;
    //添加时间    
    @TableField("cr_time")
    private Integer crTime;
    //修改时间    
    @TableField("up_time")
    private Integer upTime;
    //修改人    
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