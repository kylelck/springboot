package com.lick.filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Description: 重写WebMvcConfigurerAdapter方法，增加拦截器过滤链
 * @Author: lick@hsyuntai.com
 * @Date: 2017年10月23日 21:06
 * @Copyright: 版权归hsyuntai 所有
 */
@Configuration
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        //配置多个拦截器
        //registry.addInterceptor(new ErrorInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
