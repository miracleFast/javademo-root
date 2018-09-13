package com.miracle.javademo.servlet.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyFilter implements Filter{

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init myfilter");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest)request;
        String requestUrl = httpRequest.getRequestURL().toString();
        String requestUri = httpRequest.getRequestURI();
        String queryString = httpRequest.getQueryString();
        String msg = "requestUrl="+requestUrl+",requestUri="+requestUri+",query="+queryString;

        System.out.println("pre doFilter,msg="+msg);
        chain.doFilter(request,response);
        System.out.println("post doFilter,msg="+msg);
    }

    public void destroy() {
        System.out.println("destory filter");
    }
}
