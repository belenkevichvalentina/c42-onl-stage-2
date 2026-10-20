<%--
  Created by IntelliJ IDEA.
  User: procn
  Date: 20.10.2026
  Time: 0:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User profile</title>
</head>
<body>
<h2>Результат поиска:</h2>
<ul>
    <li><b>ID:</b> ${foundUser.id}</li>
    <li><b>Имя:</b> ${foundUser.name}</li>
    <li><b>Логин:</b> ${foundUser.username}</li>
    <li><b>Email:</b> ${foundUser.profile.email}</li>
</ul>
<br>
<a href="${pageContext.request.contextPath}/">На главную</a>

</body>
</html>
