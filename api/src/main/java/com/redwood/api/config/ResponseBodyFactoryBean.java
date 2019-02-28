package com.redwood.api.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;

/**
 * 设置bean过滤原则
 */
@Configuration
public class ResponseBodyFactoryBean implements InitializingBean {

    @Autowired
    private RequestMappingHandlerAdapter adapter;

    @Override
    public void afterPropertiesSet() throws Exception {
        List<HandlerMethodReturnValueHandler> returnValueHandlers = adapter.getReturnValueHandlers();
        var newHandlers = decorateHandlers(returnValueHandlers);
        adapter.setReturnValueHandlers(newHandlers);
    }


    private ArrayList decorateHandlers(List<HandlerMethodReturnValueHandler> handlers) {
        var newHandlers = new ArrayList();
        for (HandlerMethodReturnValueHandler handler : handlers) {
            if (handler instanceof RequestResponseBodyMethodProcessor) {
                newHandlers.add(new ResponseBodyHandler(handler));
            } else {
                newHandlers.add(handler);
            }
        }
        return newHandlers;
    }

}

