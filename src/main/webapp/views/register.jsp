<%--
  Created by IntelliJ IDEA.
  User: apg
  Date: 2017/3/12
  Time: 10:38
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

            <form:form action="register" method="post" modelAttribute="user">
                <div class="form-group">
                    <form:label path="userName" for="userName">昵称</form:label>
                    <form:input path="userName" type="text" class="form-control" placeholder="你的昵称" />
                    <form:errors element="div" path="userName" class="alert alert-danger _error_font_size _apg_mtop" role="alert"/>
                </div>
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
                <div class="form-group">
                    <label for="userPswd2">密码确认</label>
                    <input type="password" class="form-control" id="userPswd2" placeholder="再次输入你的密码">
                </div>
                <div class="form-group">
                    <form:label path="userPhone" for="userPhone">手机号码</form:label>
                    <form:input path="userPhone" type="tel" class="form-control" id="userPhone" placeholder="你的手机号码" value="${user.userPhone}"/>
                    <form:errors element="div" path="userPhone" class="alert alert-danger _error_font_size _apg_mtop" role="alert"/>
                </div>
                <button type="submit" class="btn btn-primary">注册</button>
            </form:form>
            <br>

        </div>
        <div class="col-md-3"></div>
    </div>
</div>

<%--
<%@ include file="foot.jsp" %>
--%>
