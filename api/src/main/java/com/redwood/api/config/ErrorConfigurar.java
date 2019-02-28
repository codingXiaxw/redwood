package com.redwood.api.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ErrorConfigurar implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        var errorPages = new ArrayList<ErrorPage>();
        errorPages.add(new ErrorPage(HttpStatus.NOT_FOUND, "/404.html"));
        errorPages.add(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/v1/admin"));

        var pages = new ErrorPage[errorPages.size()];
        for (var i = 0; i < errorPages.size(); i++) {
            pages[i] = errorPages.get(i);
        }
        registry.addErrorPages(pages);
    }
}