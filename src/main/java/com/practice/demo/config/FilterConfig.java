package com.practice.demo.config;

import com.practice.demo.filters.RateLimiter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<RateLimiter> loggingFilter() {
        FilterRegistrationBean<RateLimiter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new RateLimiter());
        registrationBean.addUrlPatterns("/api/actors");
        System.out.println("sandeepbean");
        return registrationBean;
    }

}