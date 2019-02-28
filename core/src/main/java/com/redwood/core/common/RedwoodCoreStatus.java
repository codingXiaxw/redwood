package com.redwood.core.common;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

/**
 * 系统字典
 */
public class RedwoodCoreStatus {
    /**
     * 检测站状态
     */
    public enum StationStateEnum implements IEnum {
        Normal(1000,"正常"),
        Wait(1001,"暂停"),
        Cancel(1000,"注销");

        StationStateEnum(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        private int code;
        private String desc;

        @Override
        public Serializable getValue() {
            return this.desc;
        }
    }
}
