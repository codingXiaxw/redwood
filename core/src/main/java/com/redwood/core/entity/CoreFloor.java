package com.redwood.core.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 房屋表 房屋表（核心系统体系）(RdCoreFloor)实体类
 *
 * @author makejava
 * @since 2019-02-28 12:17:42
 */
@Data
@TableName("rd_core_floor")
public class CoreFloor implements Serializable {

    private static final long serialVersionUID = 496007551092688186L;
    //房屋编号    
    @TableField("floor_id")
    private Integer floor_id;
    //所属楼房 楼房编号,building_id    
    @TableField("floor_building_id")
    private Integer floor_building_id;
    //所属房东    
    @TableField("floor_landlord_id")
    private Integer floor_landlord_id;
    //房屋面积    
    @TableField("floor_area")
    private Object floor_area;
    //房屋户型 一室一厅,两室一厅    
    @TableField("floor_house_type")
    private Integer floor_house_type;
    //房屋租金    
    @TableField("rent_money")
    private Object rent_money;
    //支付方式 在线支付,现金支付    
    @TableField("rent_pay_type")
    private Integer rent_pay_type;
    //租金支付时间    
    @TableField("rent_pay_time")
    private Integer rent_pay_time;
    //押金方式 押一付一，押一付二    
    @TableField("pledge_type")
    private Integer pledge_type;
    //押金金额    
    @TableField("pledge_money")
    private Object pledge_money;
    //出租方式 一口价、拍租、面谈    
    @TableField("lease_type")
    private Integer lease_type;
    //出租时间    
    @TableField("lease_time")
    private Integer lease_time;
    //使用者微信id    
    @TableField("useing_wx_id")
    private String useing_wx_id;
    //租住人数    
    @TableField("useing_count")
    private Integer useing_count;
    //房屋装修水平 一般装修、精装修、豪装    
    @TableField("decoration_level")
    private Integer decoration_level;
    //房屋标签    
    @TableField("floor_tips")
    private String floor_tips;
    //房屋家具配置    
    @TableField("floor_configure")
    private String floor_configure;
    //出租合同    
    @TableField("floor_contract")
    private String floor_contract;
    //签约时间    
    @TableField("contract_time")
    private Integer contract_time;
    //合同开始时间    
    @TableField("contract_st_time")
    private Integer contract_st_time;
    //合同到期时间    
    @TableField("contract_end_time")
    private Integer contract_end_time;
    //是否首页推荐    
    @TableField("index_page_display")
    private Integer index_page_display;
    //出租状态 停止出租、等待出租、已出租、即将到期    
    @TableField("floor_useing_type")
    private Integer floor_useing_type;
    //添加人    
    @TableField("cr_user")
    private Integer cr_user;
    //添加时间    
    @TableField("cr_time")
    private Integer cr_time;
    //修改时间    
    @TableField("up_time")
    private Integer up_time;
    //修改人    
    @TableField("up_user")
    private Integer up_user;
    //审核人    
    @TableField("audit_user")
    private Integer audit_user;
    //审核时间    
    @TableField("audit_time")
    private Integer audit_time;
}