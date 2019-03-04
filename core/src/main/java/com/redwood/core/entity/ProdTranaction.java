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
 * @author laymat
 * @since 2019-03-04 14:52:23
 */
@Data
@TableName("rd_prod_tranaction")
public class ProdTranaction implements Serializable {

    private static final long serialVersionUID = 161584736448337041L;
        
    @TableId(type = IdType.AUTO,value = "id")
    private Integer id;
    //交易单号    
    @TableField("trade_id")
    private String tradeId;
    //订单号    
    @TableField("order_id")
    private String orderId;
    //第三方订单号    
    @TableField("third_pay_id")
    private String thirdPayId;
    //支付渠道id    
    @TableField("third_pay_type")
    private Integer thirdPayType;
    //支付渠道名称    
    @TableField("third_pay_name")
    private String thirdPayName;
    //交易状态    
    @TableField("trade_state")
    private Integer tradeState;
    //交易金额    
    @TableField("trade_amount")
    private Object tradeAmount;
    //优惠金额    
    @TableField("discount_amount")
    private Object discountAmount;
    //实付金额    
    @TableField("pay_amount")
    private Object payAmount;
    //支付时间    
    @TableField("pay_time")
    private Integer payTime;
    //通知时间    
    @TableField("notify_time")
    private Integer notifyTime;
    //支付账号    
    @TableField("pay_account")
    private String payAccount;
    //支付对象    
    @TableField("user_id")
    private Integer userId;
    //备注    
    @TableField("attach")
    private String attach;
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