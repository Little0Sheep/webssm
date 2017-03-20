package com.apg.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by apg on 2017/3/12.
 */
public class SessionFilter extends OncePerRequestFilter {
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

        Object obj=httpServletRequest.getSession().getAttribute("userSession");
        if(obj==null){
            filterChain.doFilter(httpServletRequest,httpServletResponse);
        }else{
            httpServletResponse.sendRedirect(httpServletRequest.getServletPath()+"index");
        }
    }
}
