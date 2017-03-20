package com.apg.pojo;

import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;

public class Article {
    private Integer articleId;

    private Integer userId;

    @NotEmpty
    private String articleTitle;

    private Date createDate;

    private Date updateDate;

    private Boolean articleStatus;

    @NotEmpty
    private String articleSummary;

    @NotEmpty
    private String articleContent;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Boolean getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(Boolean articleStatus) {
        this.articleStatus = articleStatus;
    }

    public String getArticleSummary() {
        return articleSummary;
    }

    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", userId=" + userId +
                ", articleTitle='" + articleTitle + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", articleStatus=" + articleStatus +
                ", articleSummary='" + articleSummary + '\'' +
                ", articleContent='" + articleContent + '\'' +
                '}';
    }
}