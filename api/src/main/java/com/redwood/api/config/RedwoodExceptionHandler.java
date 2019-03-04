package com.redwood.api.config;

import com.redwood.core.common.impl.SimpleResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 定义未处理异常统一拦截
 */
@ControllerAdvice
public class RedwoodExceptionHandler {

    static final String TO_URL = "/error";

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Object handle(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception {
        e.printStackTrace();
        return SimpleResult.retSystemFail(e.getMessage());
    }


    /**
     * 判断是否是ajax请求
     * <p>Title: isAjax</p>
     * <p>Description: </p>
     *
     * @param httpRequest
     * @return
     */
    public static boolean isAjax(HttpServletRequest httpRequest) {
        return (httpRequest.getHeader("X-Requested-With") != null
                && "XMLHttpRequest"
                .equals(httpRequest.getHeader("X-Requested-With")));

    }
}