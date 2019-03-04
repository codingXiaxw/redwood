package com.redwood.core.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 用户订单表 订单表（产品体系）(RdProdOrder)实体类
 *
 * @author laymat
 * @since 2019-03-04 14:52:23
 */
@Data
@TableName("rd_prod_order")
public class ProdOrder implements Serializable {

    private static final long serialVersionUID = -16330992024925069L;
    //编号    
    @TableId(type = IdType.AUTO,value = "id")
    private Integer id;
    //订单编号    
    @TableField("order_id")
    private String orderId;
    //订单类型 保证金、租金、水电费、拍房金、押金、维修费    
    @TableField("order_type")
    private Integer orderType;
    //订单关联来源id 所属房屋编号、所属维修单编号    
    @TableField("from_id")
    private String fromId;
    //订单金额    
    @TableField("order_amount")
    private Object orderAmount;
    //订单优惠金额    
    @TableField("discount_amount")
    private Object discountAmount;
    //订单实际支付金额    
    @TableField("pay_amount")
    private Object payAmount;
    //订单优惠券id    
    @TableField("coupon_id")
    private String couponId;
    //订单支付状态 等待支付、支付成功、支付失败    
    @TableField("pay_state")
    private Integer payState;
    //订单备注    
    @TableField("order_note")
    private String orderNote;
    //订单联系人id    
    @TableField("user_id")
    private Integer userId;
    //房东id    
    @TableField("landlord_id")
    private Integer landlordId;
    //楼房id    
    @TableField("building_id")
    private Integer buildingId;
    //房屋id    
    @TableField("house_id")
    private Integer houseId;
    //订单支付时间    
    @TableField("cr_user")
    private Integer crUser;
    //订单创建时间    
    @TableField("cr_time")
    private Integer crTime;
    //修改人    
    @TableField("up_user")
    private Integer upUser;
    //修改时间    
    @TableField("up_time")
    private Integer upTime;
    //审核人 为0系统审核    
    @TableField("audit_user")
    private Integer auditUser;
    //审核时间    
    @TableField("audit_time")
    private Integer auditTime;
}