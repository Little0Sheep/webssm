<%--
  Created by IntelliJ IDEA.
  User: apg
  Date: 2017/3/13
  Time: 12:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<div class="col-md-8">
<form:form action="articlePublish" method="post" modelAttribute="article" class="form-horizontal">
    <div class="form-group">
        <label for="inputTitle" class="col-sm-2 control-label">文章标题</label>
        <div class="col-sm-10">
            <form:input path="articleTitle" type="text" class="form-control" id="inputTitle" placeholder="文章标题"/>
            <form:errors element="div" path="articleTitle" class="alert alert-danger _error_font_size _apg_mtop" role="alert"/>
        </div>
    </div>
    <div class="form-group">
        <label for="inputText" class="col-sm-2 control-label">摘要</label>
        <div class="col-sm-10">
            <form:input path="articleSummary" type="text" class="form-control" id="inputText" placeholder="摘要"/>
            <form:errors element="div" path="articleSummary" class="alert alert-danger _error_font_size _apg_mtop" role="alert"/>
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-2 control-label">内容</label>
        <div class="col-sm-10">
            <form:textarea path="articleContent" class="form-control" rows="3"></form:textarea>
            <form:errors element="div" path="articleContent" class="alert alert-danger _error_font_size _apg_mtop" role="alert"/>
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-2 control-label">发布</label>
        <div class="col-sm-10">
            <div class="checkbox">
                <label>
                    <form:checkbox path="articleStatus"> Check me out</form:checkbox>
                </label>
            </div>
        </div>
    </div>


    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-primary">保存</button>
        </div>
    </div>
</form:form>
</div>