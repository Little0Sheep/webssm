<%--
  Created by IntelliJ IDEA.
  User: apg
  Date: 2017/3/12
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<%@ include file="../base/head.jsp" %>

<%@ include file="../base/nav.jsp" %>

    <div class="jumbotron">
        <h1>Hello, world!</h1>
        <p>我的第一个SSM框架的博客系统^^。</p>
        <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
    </div>

    <div class="container-fluid">
        <div class="row">
            <div class="col-md-8">
                <div class="row">
                    <div class="col-md-4 _right">
                        <img src="${static_url}imgs/1.jpg" width="200px"/>
                    </div>
                    <div class="col-md-8">
                        <div class="index_article_content">
                            <ul>
                                <li>我的第一篇文章</li>
                                <li>摘要：撒旦飞洒地方撒旦范德萨范德萨范德萨飞洒</li>
                            </ul>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <span>发表时间</span>
                            </div>
                            <div class="col-md-6 _right">
                                <span>阅读数</span>
                                <span>评论</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-8">
                <div class="row">
                    <div class="col-md-4 _right">
                        <img src="${static_url}imgs/1.jpg" width="200px"/>
                    </div>
                    <div class="col-md-8">
                        <div class="index_article_content">
                            <ul>
                                <li>我的第一篇文章</li>
                                <li>摘要：撒旦飞洒地方撒旦范德萨范德萨范德萨飞洒</li>
                            </ul>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <span>发表时间</span>
                            </div>
                            <div class="col-md-6 _right">
                                <span>阅读数</span>
                                <span>评论</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-4">.col-md-4</div>
        </div>
    </div>
<%@ include file="../base/foot.jsp" %>


