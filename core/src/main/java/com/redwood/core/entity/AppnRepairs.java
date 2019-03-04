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
 * @author laymat
 * @since 2019-03-04 14:52:23
 */
@Data
@TableName("rd_appn_repairs")
public class AppnRepairs implements Serializable {

    private static final long serialVersionUID = -28837827751428758L;
    //编号    
    @TableId(type = IdType.AUTO,value = "id")
    private Integer id;
    //维修单id    
    @TableField("repair_id")
    private String repairId;
    //所属楼房id    
    @TableField("building_id")
    private Integer buildingId;
    //所属房屋id    
    @TableField("landlord_id")
    private Integer landlordId;
    //维修类型 空调维修、水电维修    
    @TableField("repair_type")
    private Integer repairType;
    //维修描述    
    @TableField("repair_describe")
    private String repairDescribe;
    //期望维修时间    
    @TableField("repair_expect_time")
    private Integer repairExpectTime;
    //支付方式 线上支付、线下支付    
    @TableField("pay_type")
    private Integer payType;
    //订单编号    
    @TableField("order_id")
    private String orderId;
    //所属房屋id    
    @TableField("house_id")
    private Integer houseId;
    //维修完成时间    
    @TableField("finsh_time")
    private Integer finshTime;
    //维修单状态 等待接单、已接单、已完成    
    @TableField("repair_state")
    private Integer repairState;
    //创建人    
    @TableField("cr_user")
    private Integer crUser;
    //创建时间    
    @TableField("cr_time")
    private Integer crTime;
    //修改人    
    @TableField("up_user")
    private Integer upUser;
    //修改时间    
    @TableField("up_time")
    private Integer upTime;
    //审核人    
    @TableField("audit_user")
    private Integer auditUser;
    //审核时间    
    @TableField("audit_time")
    private Integer auditTime;
}