package com.apg.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.apg.pojo.User;

/**
 * Created by apg on 2017/3/12.
 */
public class LoginInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

/*        User user=(User)httpServletRequest.getSession().getAttribute("user");

        if(user==null){
            return true;
        }else{
            System.out.println("已经登录");
        }*/

        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
