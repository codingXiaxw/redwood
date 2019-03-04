package com.redwood.api.config;

import com.redwood.api.base.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 60 * 60)
public class RedisSessionConfig extends BaseController {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    RedisUtil redisUtil;

    public String SaveSession(Object object) {
        var sessionKey = this.getSessionKey();
        if(redisUtil.set(sessionKey, object, this.SessionOutTime))
            return sessionKey;

        return null;
    }

    public Object QuerySession() {
        return redisUtil.get(this.getHeaderName("redwood-session-token"));
    }

    public boolean ClearSession() {
        return redisUtil.set(this.getSessionKey(), null, -1);
    }
}