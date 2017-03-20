<%--
  Created by IntelliJ IDEA.
  User: apg
  Date: 2017/3/13
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index">${sitename}</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">博文 <span class="sr-only">(current)</span></a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <c:choose>
                    <c:when test="${empty sessionScope.userSession.getUserName()}">
                        <li><a href="register">注册</a></li>
                        <li><a href="login">登录</a></li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="#">${sessionScope.userSession.getUserName()}</a></li>
                        <li><a href="admin/">管理</a></li>
                        <li><a href="loginout">注销</a></li>
                    </c:otherwise>
                </c:choose>
            </ul>
        </div>
    </div>
</nav>