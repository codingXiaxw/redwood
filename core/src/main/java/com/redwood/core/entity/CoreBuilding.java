package com.redwood.core.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 楼房表 楼房表（核心系统体系）(RdCoreBuilding)实体类
 *
 * @author laymat
 * @since 2019-03-04 14:52:23
 */
@Data
@TableName("rd_core_building")
public class CoreBuilding implements Serializable {

    private static final long serialVersionUID = -79050174334058767L;
    //楼房编号    
    @TableId(type = IdType.AUTO,value = "building_id")
    private Integer buildingId;
    //楼房名称    
    @TableField("building_name")
    private String buildingName;
    //楼房所属区域 宝安福永、宝安沙井、宝安西乡、宝安松岗    
    @TableField("current_region")
    private String currentRegion;
    //楼房gps地理数据    
    @TableField("current_region_gps")
    private String currentRegionGps;
    //楼房具体地址    
    @TableField("current_region_address")
    private String currentRegionAddress;
    //楼房来源（所属村） 石龙头旧村、盐田村    
    @TableField("join_from")
    private String joinFrom;
    //楼房添加来源    
    @TableField("add_from")
    private Integer addFrom;
    //所属房东    
    @TableField("landlord_id")
    private Integer landlordId;
    //楼房二维码被扫次数    
    @TableField("scan_number")
    private Integer scanNumber;
    //楼房点赞次数    
    @TableField("up_number")
    private Integer upNumber;
    //楼房被踩次数    
    @TableField("step_number")
    private Integer stepNumber;
    //是否首页推荐    
    @TableField("index_page_display")
    private Integer indexPageDisplay;
    //是否隐藏推荐    
    @TableField("page_hide")
    private Integer pageHide;
    //创建人    
    @TableField("cr_user")
    private Integer crUser;
    //房屋添加时间    
    @TableField("cr_time")
    private Integer crTime;
    //修改人    
    @TableField("up_user")
    private Integer upUser;
    //更新时间    
    @TableField("up_time")
    private Integer upTime;
    //审核人    
    @TableField("audit_user")
    private Integer auditUser;
    //审核时间    
    @TableField("audit_time")
    private Integer auditTime;
    //楼房审核状态 新提交,等待审核,审核通过    
    @TableField("audit_state")
    private Integer auditState;
    //房屋系统状态 等待上线,已上线,已下线    
    @TableField("building_state")
    private Integer buildingState;
}