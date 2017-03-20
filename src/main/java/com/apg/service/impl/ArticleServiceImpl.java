package com.apg.service.impl;

import com.apg.dao.ArticleDao;
import com.apg.pojo.Article;
import com.apg.service.IArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by apg on 2017/3/13.
 */
@Service
public class ArticleServiceImpl implements IArticleService {

    @Resource
    private ArticleDao articleDao;

    public int deleteByPrimaryKey(Integer articleId) {
        return articleDao.deleteByPrimaryKey(articleId);
    }

    public int insert(Article record) {
        return articleDao.insert(record);
    }

    public int insertSelective(Article record) {
        return 0;
    }

    public Article selectByPrimaryKey(Integer articleId) {
        return null;
    }

    public int updateByPrimaryKeySelective(Article record) {
        return 0;
    }

    public int updateByPrimaryKey(Article record) {
        return 0;
    }
}
