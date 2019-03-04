package com.redwood.core.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 资金表 资金表（财务系统体系）(RdFineAccount)实体类
 *
 * @author laymat
 * @since 2019-03-04 14:52:23
 */
@Data
@TableName("rd_fine_account")
public class FineAccount implements Serializable {

    private static final long serialVersionUID = 145669704287160095L;
    //账户id    
    @TableId(type = IdType.AUTO,value = "account_id")
    private Integer accountId;
    //账户总余额    
    @TableField("all_money")
    private Object allMoney;
    //冻结金额    
    @TableField("freeze_money")
    private Object freezeMoney;
    //可用金额    
    @TableField("usable_money")
    private Object usableMoney;
    //交易次数    
    @TableField("transaction_count")
    private Integer transactionCount;
    //账户等级    
    @TableField("level")
    private Integer level;
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