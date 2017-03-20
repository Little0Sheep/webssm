<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <#list users as user>
        <tr>
            <td>${user.id }</td>
            <td>${user.userName}</td>
            <td>${user.age}</td>
            <td>${user.password}</td>
        </tr>
    </#list>
</body>
</html>