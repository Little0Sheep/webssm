package com.apg.controller;

import com.apg.pojo.Article;
import com.apg.service.IArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;

/**
 * Created by apg on 2017/3/12.
 */
@Controller
@RequestMapping("admin")
public class AdminController {

    @Resource
    private IArticleService articleService;

    @RequestMapping({"/","index"})
    public String index(Model model){
        model.addAttribute("childPage","article_post.jsp");
        return "admin/index";
    }

    @RequestMapping(value={"/articlePublish"},method = {RequestMethod.POST})
    public String articlePost(Model model,@Valid @ModelAttribute("article")Article article, BindingResult result){
        if(result.hasErrors()){
            model.addAttribute("childPage","article_post.jsp");
            return "admin/index";
        }else {
            article.setArticleStatus(false);
            article.setUserId(1);
            article.setCreateDate(new Date());
            article.setUpdateDate(new Date());
            System.out.println(article);
            articleService.insert(article);
            System.out.println("写入成功");
            return null;
        }
    }

    @ModelAttribute("article")
    public Article getArticle(){
        Article article=new Article();
        return article;
    }

}
