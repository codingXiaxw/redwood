package com.redwood.api.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.redwood.core.common.RedwoodCoreStatus;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//Spring boot方式
@EnableTransactionManagement
@Configuration
@MapperScan({"com.redwood.core.dao"})
@MappedTypes(value = {RedwoodCoreStatus.StationStateEnum.class})
public class MybatisPlusConfig {

    /**
     * 分页插件
     * (必须实例化该组件，否则无法自动分页)
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
