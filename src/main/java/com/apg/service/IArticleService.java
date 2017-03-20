package com.apg.service;

import com.apg.pojo.Article;

/**
 * Created by apg on 2017/3/13.
 */
public interface IArticleService {
    public int deleteByPrimaryKey(Integer articleId);

    public int insert(Article record);

    public int insertSelective(Article record);

    public Article selectByPrimaryKey(Integer articleId);

    public int updateByPrimaryKeySelective(Article record);

    public int updateByPrimaryKey(Article record);
}
