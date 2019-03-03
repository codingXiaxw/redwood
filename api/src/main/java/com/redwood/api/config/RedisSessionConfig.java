package com.redwood.api.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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