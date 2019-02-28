package com.redwood.core.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 定义统一返回JSON格式
 */
@Data
public abstract class RedwoodResult<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;
    private Boolean success;


    /**
     * 结果包装对象
     * @param code 状态编码
     * @param msg  状态描述
     * @param data  对象结果
     */
    public RedwoodResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.success = code == 0;
    }
    /**
     * 结果包装对象
     * @param code 状态编码
     * @param msg  状态描述
     */
    public RedwoodResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.success = code == 0;
    }

    public RedwoodResult() {
    }
}
