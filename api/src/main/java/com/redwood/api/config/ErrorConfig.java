package com.redwood.api.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ErrorConfig implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        ErrorPage[] errorPages = new ErrorPage[]{
                //new ErrorPage(HttpStatus.NOT_FOUND, "/404.html"),
                new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/v1/admin")
        };

        registry.addErrorPages(errorPages);
    }
}