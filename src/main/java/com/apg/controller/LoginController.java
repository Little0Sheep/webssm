package com.apg.controller;

import com.apg.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import javax.validation.Valid;
import com.apg.pojo.User;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * Created by apg on 2017/3/11.
 */
@Controller
@SessionAttributes({"userSession"})
public class LoginController {

    @Resource
    private IUserService userService;

    /*
    点击登录时
     */
    @RequestMapping(value="/login",method={RequestMethod.GET})
    public String Login(){
        return "views/login";
    }

    /*
    登录提交检查
     */
    @RequestMapping(value="/login",method={RequestMethod.POST})
    public String LoginCheck(Model model, @Valid @ModelAttribute("user")User user, BindingResult result){
          if(result.hasFieldErrors("userEmail") || result.hasFieldErrors("userPswd")){
              return "views/login";
          }else{
              User u=userService.loginCheck(user);
              if(u.getId()>0) {
                  model.addAttribute("userSession",u);
                  return "redirect:index";
              }else{
                  result.rejectValue("userPswd","error","登录失败，请检查邮箱或密码！");
                  return "views/login";
              }
          }
    }

    /*
    注册提交检查
     */
    @RequestMapping(value="/register",method={RequestMethod.POST})
    public String registerCheck(Model model, @Valid @ModelAttribute("user")User user, BindingResult result){
          if(result.hasErrors()){
              return "views/register";
          }else{
              if(userService.selectByEmail(user.getUserEmail())==0){ //如果当前邮箱没有注册
                  userService.insert(user);
                  return "redirect:views/login";
              }else{
                  result.rejectValue("userEmail","misFormat","此邮箱已注册");
                  return "views/register";
              }
          }
    }
    /*
    点击注册链接时
     */
    @RequestMapping(value="/register",method={RequestMethod.GET})
    public String register(){
        return "views/register";
    }

    /*
    注册表单模型
     */
    @ModelAttribute("user")
    public User getUser(){
        User user=new User();
        return user;
    }

    /*
    注销登录处理
     */
    @RequestMapping(value="/loginout",method={RequestMethod.GET})
    public String loginOut(SessionStatus ss){
        ss.setComplete();
        return "redirect:index";
    }

}
