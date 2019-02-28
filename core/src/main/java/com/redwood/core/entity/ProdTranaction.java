package com.redwood.core.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 交易流水表(RdProdTranaction)实体类
 *
 * @author makejava
 * @since 2019-02-28 12:49:05
 */
@Data
@TableName("rd_prod_tranaction")
public class ProdTranaction implements Serializable {

    private static final long serialVersionUID = -83072416936249713L;
        
    @TableId(type = IdType.AUTO,value = "id")
    private Integer id;
    //交易单号    
    @TableField("trade_id")
    private String trade_id;
    //订单号    
    @TableField("order_id")
    private String order_id;
    //第三方订单号    
    @TableField("third_pay_id")
    private String third_pay_id;
    //支付渠道id    
    @TableField("third_pay_type")
    private Integer third_pay_type;
    //支付渠道名称    
    @TableField("third_pay_name")
    private String third_pay_name;
    //交易状态    
    @TableField("trade_state")
    private Integer trade_state;
    //交易金额    
    @TableField("trade_amount")
    private Object trade_amount;
    //优惠金额    
    @TableField("discount_amount")
    private Object discount_amount;
    //实付金额    
    @TableField("pay_amount")
    private Object pay_amount;
    //支付时间    
    @TableField("pay_time")
    private Integer pay_time;
    //通知时间    
    @TableField("notify_time")
    private Integer notify_time;
    //支付账号    
    @TableField("pay_account")
    private String pay_account;
    //支付对象    
    @TableField("user_id")
    private Integer user_id;
    //备注    
    @TableField("attach")
    private String attach;
    //创建人    
    @TableField("cr_user")
    private Integer cr_user;
    //创建时间    
    @TableField("cr_time")
    private Integer cr_time;
    //修改人    
    @TableField("up_user")
    private Integer up_user;
    //修改时间    
    @TableField("up_time")
    private Integer up_time;
    //审核人    
    @TableField("audit_user")
    private Integer audit_user;
    //审核时间    
    @TableField("audit_time")
    private Integer audit_time;
}