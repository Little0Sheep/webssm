<%--
  Created by IntelliJ IDEA.
  User: apg
  Date: 2017/3/12
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<%@ include file="../base/head.jsp" %>

<%@ include file="../base/nav.jsp" %>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-6">

            <form:form action="login" method="post" modelAttribute="user">
                <div class="form-group">
                    <form:label path="userEmail" for="userEmail">邮箱地址</form:label>
                    <form:input path="userEmail" type="email" class="form-control" id="userEmail" placeholder="你的邮箱地址" />
                    <form:errors element="div" path="userEmail" class="alert alert-danger _error_font_size _apg_mtop" role="alert"/>
                </div>
                <div class="form-group">
                    <form:label path="userPswd" for="userPswd">密码</form:label>
                    <form:input path="userPswd" type="password" class="form-control" id="userPswd" placeholder="你的密码"/>
                    <form:errors element="div" path="userPswd" class="alert alert-danger _error_font_size _apg_mtop" role="alert"/>
                </div>
                <button type="submit" class="btn btn-primary">登录</button>
            </form:form>
            <br>

        </div>
        <div class="col-md-3"></div>
    </div>
</div>
