<%--
  Created by IntelliJ IDEA.
  User: apg
  Date: 2017/3/12
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<c:set value="/webssm/static/" var="static_url" scope="page"/>
<c:set value="小绵羊博客" var="sitename" scope="page"/>
<html>
<head>
    <meta charset="utf-8">
    <title>${sitename}</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Loading Bootstrap -->
    <link href="${static_url}flat-ui/css/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Loading Flat UI -->
    <link href="${static_url}flat-ui/css/flat-ui.min.css" rel="stylesheet">

    <!-- Loading Common css -->
    <link href="${static_url}csss/common.css" rel="stylesheet">

    <link rel="shortcut icon" href="${static_url}flat-ui/img/favicon.ico">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
    <!--[if lt IE 9]>
    <script src="${static_url}flat-ui/js/vendor/html5shiv.js"></script>
    <script src="${static_url}flat-ui/js/vendor/respond.min.js"></script>
    <![endif]-->
</head>
<body>

