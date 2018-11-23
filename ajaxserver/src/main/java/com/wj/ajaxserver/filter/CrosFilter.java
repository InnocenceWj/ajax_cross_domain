package com.wj.ajaxserver.filter;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @创建人 wj
 * @创建时间 2018/11/23
 * @描述 测试nginx配置时，不用filter。注释下面注解就行
 */
//@Component
//@ServletComponentScan
//@WebFilter(urlPatterns = "/*", filterName = "crosFilter")
public class CrosFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) response;
        HttpServletRequest req = (HttpServletRequest) request;
        res.addHeader("Access-Control-Allow-Origin", req.getHeader("Origin"));
        res.addHeader("Access-Control-Allow-Methods", req.getHeader("Access-Control-Request-Method"));
//        带cookie时，需要的字段
        res.addHeader("Access-Control-Allow-Credentials", "true");
//        非简单请求，需要加上这句.支持所有自定义头
        res.addHeader("Access-Control-Allow-Headers", req.getHeader("Access-Control-Request-Headers"));
//       告诉浏览器在1h内可以缓存这段信息，不用再发送预检命令。单位：s。
//       没有这句话，非简单请求的Method是OPTIONS
        res.addHeader("Access-Control-Max-Age", "3600");
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
