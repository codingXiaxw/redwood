package com.redwood.api.config;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.redwood.core.dto.BootstrapPageDto;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.MethodParameter;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * 统一返回类型处理
 */
public class ResponseBodyHandler implements HandlerMethodReturnValueHandler {

    private final HandlerMethodReturnValueHandler delegate;

    public ResponseBodyHandler(HandlerMethodReturnValueHandler delegate) {

        this.delegate = delegate;

    }

    @Override
    public boolean supportsReturnType(MethodParameter returnType) {

        return delegate.supportsReturnType(returnType);

    }

    /**
     * 返回类型处理handle
     * @param returnValue 原始返回数据
     * @param returnType 原始返回类型
     * @param mavContainer 实体及视图控制器
     * @param webRequest request请求对象
     * @throws Exception
     */
    @Override
    public void handleReturnValue(Object returnValue, MethodParameter returnType, ModelAndViewContainer mavContainer,
                                  NativeWebRequest webRequest) throws Exception {
        if (returnValue instanceof IPage) {
            var page = (IPage) returnValue;
            returnValue = new BootstrapPageDto(page, page.getRecords());
        }

        delegate.handleReturnValue(returnValue, returnType, mavContainer, webRequest);
    }

}
