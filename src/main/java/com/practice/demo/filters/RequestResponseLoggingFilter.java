package com.practice.demo.filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RequestResponseLoggingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) request;

        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        System.out.println("request uri" + httpServletRequest.getRequestURI());
        chain.doFilter(request, response);
    }
}
