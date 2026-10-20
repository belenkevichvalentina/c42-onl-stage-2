<%--
  Created by IntelliJ IDEA.
  User: procn
  Date: 13.10.2026
  Time: 2:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<span>Hello ${sessionScope.user.name}- ${sessionScope.user.profile.email}</span>
<a href="/user/reg">Registration</a>
<a href="/user/login">Login</a>
<a href="/user/update">Update</a>
<a href="/logout">Logout</a>


<%-- Блок CRUD скрыт для гостей --%>
<c:if test="${not empty sessionScope.user}">
<hr>
<h3>CRUD:</h3>
<%--<a href="/user/get?id=1">Найти пользователя (?id=1)</a><br>--%>
<%--<a href="/user/delete?id=1">Удалить пользователя (?id=1)</a><br>--%>
    <form action="${pageContext.request.contextPath}/user/find" method="get" style="margin-bottom: 10px;">
        <input type="number" name="id" placeholder="ID" required>
        <button type="submit">Найти пользователя</button>
    </form>

    <form action="${pageContext.request.contextPath}/user/delete" method="post">
        <input type="number" name="id" placeholder="ID" required>
        <button type="submit" onclick="return confirm('Удалить?');">Удалить пользователя</button>
    </form>
</c:if>
</body>
</html>
