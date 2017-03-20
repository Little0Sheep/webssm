package com.apg.dao;

import com.apg.pojo.Article;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleDao {
    int deleteByPrimaryKey(Integer articleId);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer articleId);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);
}