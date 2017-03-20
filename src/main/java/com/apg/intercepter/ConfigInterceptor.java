package com.apg.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by apg on 2017/3/4.
 */
public class ConfigInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{

/*        String[] allowUrls=new String[]{"/register","/login"};

        String url=request.getRequestURL().toString();

        User user=(User)request.getSession().getAttribute("user");

        for(String strUrl:allowUrls){
            if(url.contains(strUrl)){
                return true;
            }
        }

        if(user==null){
            System.out.println("未登录");
        }*/

        return true;

    }

    public void postHandle(HttpServletRequest request,HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {
//        modelAndView.addObject("sitename","小绵羊博客");
    }

    public void afterCompletion(HttpServletRequest request,HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // TODO Auto-generated method stub

    }
}
