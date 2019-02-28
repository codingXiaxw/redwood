package com.redwood.api.config;

import cn.hutool.json.JSONUtil;
import com.redwood.core.common.impl.SimpleResult;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

@Component
public class SessionInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("开始请求地址拦截");

        if (request.isRequestedSessionIdValid()) {
            return true;
        } else {
            var ajaxRequest = (request.getHeader("X-Requested-With") != null
                    && "XMLHttpRequest"
                    .equals(request.getHeader("X-Requested-With")));

            //判断是否为ajax请求
            if (ajaxRequest) {
                var json = JSONUtil.toJsonStr(SimpleResult.retNeedLogin);
                response.getWriter().write(json);
            } else {
                response.sendRedirect("/oauth/login.html");
            }
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {


    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
