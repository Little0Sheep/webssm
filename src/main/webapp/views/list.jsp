<%--
  Created by IntelliJ IDEA.
  User: apg
  Date: 2017/3/4
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示所有用户</title>
</head>
<body>
    <c:forEach items="${users }" var="u">
        <tr>
            <td>${u.id }</td>
            <td>${u.userName}</td>
            <td>${u.age}</td>
            <td>${u.password}</td>
        </tr>
    </c:forEach>
</body>
</html>
