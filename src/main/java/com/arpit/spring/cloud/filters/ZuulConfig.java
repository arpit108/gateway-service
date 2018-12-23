package com.arpit.spring.cloud.filters;

import com.netflix.zuul.ZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulConfig {

    @Bean
    public ZuulFilter getObject()
    {
        return new GatewayFilter();
    }
}
