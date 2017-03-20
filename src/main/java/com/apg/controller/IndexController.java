package com.apg.controller;

import com.apg.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by apg on 2017/3/4.
 */
@Controller
public class IndexController {
    @RequestMapping(value={"/","/index"})
    public String toIndex(){
        return "views/index";
    }
}
