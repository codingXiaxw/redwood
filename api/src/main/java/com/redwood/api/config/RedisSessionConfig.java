package com.redwood.api.config;

import cn.hutool.core.codec.Base64Decoder;
import cn.hutool.extra.servlet.ServletUtil;
import cn.hutool.json.JSONUtil;
import javafx.beans.binding.ObjectBinding;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.DefaultCookieSerializer;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Base64;

@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 60 * 60)
public class RedisSessionConfig {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    RedisUtil redisUtil;
    private static final String requestSessionKey = "redwood-session";

    public static void SaveSession(HttpServletRequest request, Object object) {
        request.getSession().setAttribute(requestSessionKey, object);
    }

    public static Object QuerySession(HttpServletRequest request) {
        return request.getSession().getAttribute(requestSessionKey);
    }

    public static void ClearSession(HttpServletRequest request) {
        request.getSession().invalidate();
    }
}