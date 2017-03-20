package com.apg.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apg.pojo.User;
import com.apg.service.IUserService;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public ModelAndView toIndex(HttpServletRequest request,Model model){
        ModelAndView mv=new ModelAndView("showUser");
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        mv.addObject("user",user);
        mv.addObject("haha","fuck");
        return mv;
    }

    @RequestMapping("/showList")
    public ModelAndView showList(){
        ModelAndView mv=new ModelAndView("list");
        mv.addObject("users",this.userService.queryUsers());
        return mv;
    }

    @RequestMapping("/addUser")
    public String addUser(HttpServletRequest request,Model model){
        User u=new User();
        u.setUserName("hahah");
        u.setId(2);
//        int result=this.userService.insertUser(u);
//        model.addAttribute(result);
        return "addUser";
    }

    @RequestMapping("/delUser")
    public String delUser(HttpServletRequest request,Model model){
        int userId=Integer.parseInt(request.getParameter("id"));
        User user=this.userService.getUserById(userId);
        model.addAttribute("user",user);
        int result=this.userService.deleteUser(userId);
        return "delUser";
    }

    @RequestMapping("/updateUser")
    public String updateUser(HttpServletRequest request,Model model){
        User user=new User();
        user.setId(1);
        user.setUserName("哇哈哈");
        int result=this.userService.updateUser(user);
        model.addAttribute("user",user);
        return "updateUser";
    }
}
