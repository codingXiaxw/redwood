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
 * @author makejava
 * @since 2019-02-28 12:49:05
 */
@Data
@TableName("rd_fine_account")
public class FineAccount implements Serializable {

    private static final long serialVersionUID = 652470516010952041L;
    //账户id    
    @TableId(type = IdType.AUTO,value = "account_id")
    private Integer account_id;
    //账户总余额    
    @TableField("all_money")
    private Object all_money;
    //冻结金额    
    @TableField("freeze_money")
    private Object freeze_money;
    //可用金额    
    @TableField("usable_money")
    private Object usable_money;
    //交易次数    
    @TableField("transaction_count")
    private Integer transaction_count;
    //账户等级    
    @TableField("level")
    private Integer level;
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