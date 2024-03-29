package com.redwood.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.Resource;

@Configuration
public class WebAppConfig implements WebMvcConfigurer {
    /**
     * 注册 拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 设置拦截的路径、不拦截的路径、优先级等等
        //registry.addInterceptor(new SessionInterceptor())
                //.addPathPatterns("/**")
                //.excludePathPatterns("/static/**","/assets/**", "/oauth/**");
    }
}
