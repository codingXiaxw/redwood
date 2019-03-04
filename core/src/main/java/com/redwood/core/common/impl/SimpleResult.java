package com.redwood.core.common.impl;

import com.redwood.core.common.RedwoodResult;

/**
 * simple json result class
 * @param <T> custom type
 */
public class SimpleResult<T> extends RedwoodResult {
    public SimpleResult(int code, String message, T data) {
        super(code, message, data);
    }

    /**
     * request fail result
     */
    public static final RedwoodResult retFail = new SimpleResult(-1, "fail", null);
    public static final RedwoodResult retNeedLogin = new SimpleResult(-10, "未经授权的访问", null);

    /**
     * request success result
     */
    public static final RedwoodResult retSuccess = new SimpleResult(0, "success", true);

    /**
     * request fail result as custom message
     *
     * @param message fail message
     * @return
     */
    public static final RedwoodResult retMessageFail(String message) {
        return new SimpleResult(-1, message, null);
    }

    public static final RedwoodResult retSystemFail(String message) {
        return new SimpleResult(-99, message, null);
    }

    /**
     * request success result as custom message and data
     *
     * @param message
     * @param data
     * @return
     */
    public static final RedwoodResult retMessageSuccess(String message, Object data) {
        return new SimpleResult(0, message, data);
    }
}
