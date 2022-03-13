package com.silence.purview.config;

import com.silence.purview.filter.AuthHandlerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置要拦截的路径 -- web配置类
 */

@Configuration
public class AuthWebMvcConfigurer implements WebMvcConfigurer {

    @Autowired
    AuthHandlerInterceptor authHandlerInterceptor;

    /**
     * 给除了 /login 的接口都配置拦截器,拦截转向到 authHandlerInterceptor
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(authHandlerInterceptor)
               .addPathPatterns("/**")
               .excludePathPatterns("/login");
    }
}
