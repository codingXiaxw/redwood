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
 * @author makejava
 * @since 2019-02-28 12:49:05
 */
@Data
@TableName("rd_fine_balance")
public class FineBalance implements Serializable {

    private static final long serialVersionUID = -67146800036000466L;
        
    @TableId(type = IdType.AUTO,value = "id")
    private Integer id;
    //结算单编号    
    @TableField("balance_id")
    private String balance_id;
    //结算金额    
    @TableField("total_money")
    private Object total_money;
    //结算时间    
    @TableField("time")
    private Integer time;
    //结算类型 房租结算，维修费结算，押金退还结算等    
    @TableField("balance_type")
    private Integer balance_type;
    //付款银行    
    @TableField("payment_bank")
    private String payment_bank;
    //付款账号    
    @TableField("payment_acount")
    private String payment_acount;
    //付款金额    
    @TableField("payment_money")
    private Object payment_money;
    //付款时间    
    @TableField("payment_time")
    private Integer payment_time;
    //付款人    
    @TableField("payment_user")
    private Integer payment_user;
    //收款方    
    @TableField("collection_bank")
    private String collection_bank;
    //收款账号    
    @TableField("collection_account")
    private String collection_account;
    //收款金额    
    @TableField("collection_money")
    private Integer collection_money;
    //收款人/用户    
    @TableField("user_id")
    private Integer user_id;
    //收款人/房东    
    @TableField("landlord_id")
    private Integer landlord_id;
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
    //结算单状态    
    @TableField("balance_state")
    private Integer balance_state;
}