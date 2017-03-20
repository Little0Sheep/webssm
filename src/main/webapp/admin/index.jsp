<%--
  Created by IntelliJ IDEA.
  User: apg
  Date: 2017/3/12
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="../base/head.jsp" %>

<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<br>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-2">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">后台管理</h3>
                </div>
                <div class="panel-body">
                    <div class="list-group">
                        <a href="#" class="list-group-item active">
                            发表文章
                        </a>
                        <a href="#" class="list-group-item">所有博文</a>
                        <a href="#" class="list-group-item">Morbi leo risus</a>
                        <a href="#" class="list-group-item">Porta ac consectetur ac</a>
                        <a href="#" class="list-group-item">Vestibulum at eros</a>
                    </div>
                </div>
                <div class="panel-footer">

                </div>
            </div>
        </div>
        <div class="col-md-10">
            <%--<%@ include file="article_post.jsp" %>--%>
            <c:import url="${childPage}"></c:import>
        </div>
    </div>
</div>

<%@ include file="../base/foot.jsp" %>