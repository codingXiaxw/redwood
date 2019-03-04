package com.redwood.core.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 结算表 结算表（财务系统体系）(RdFineBalance)实体类
 *
 * @author laymat
 * @since 2019-03-04 14:52:23
 */
@Data
@TableName("rd_fine_balance")
public class FineBalance implements Serializable {

    private static final long serialVersionUID = -69257013199497156L;
        
    @TableId(type = IdType.AUTO,value = "id")
    private Integer id;
    //结算单编号    
    @TableField("balance_id")
    private String balanceId;
    //结算金额    
    @TableField("total_money")
    private Object totalMoney;
    //结算时间    
    @TableField("time")
    private Integer time;
    //结算类型 房租结算，维修费结算，押金退还结算等    
    @TableField("balance_type")
    private Integer balanceType;
    //付款银行    
    @TableField("payment_bank")
    private String paymentBank;
    //付款账号    
    @TableField("payment_acount")
    private String paymentAcount;
    //付款金额    
    @TableField("payment_money")
    private Object paymentMoney;
    //付款时间    
    @TableField("payment_time")
    private Integer paymentTime;
    //付款人    
    @TableField("payment_user")
    private Integer paymentUser;
    //收款方    
    @TableField("collection_bank")
    private String collectionBank;
    //收款账号    
    @TableField("collection_account")
    private String collectionAccount;
    //收款金额    
    @TableField("collection_money")
    private Integer collectionMoney;
    //收款人/用户    
    @TableField("user_id")
    private Integer userId;
    //收款人/房东    
    @TableField("landlord_id")
    private Integer landlordId;
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
    //结算单状态    
    @TableField("balance_state")
    private Integer balanceState;
}