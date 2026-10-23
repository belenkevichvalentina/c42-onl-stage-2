<%--
  Created by IntelliJ IDEA.
  User: procn
  Date: 23.10.2026
  Time: 6:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Users all</title>
</head>
<body>
<h2>Все пользователи:</h2>

<c:if test="${empty allUsers}">
    <p>Пользователей пока нет.</p>
</c:if>
<c:if test="${not empty allUsers}">
<table border="1" cellpadding="8" cellspacing="0">
    <thead>
    <tr>
        <th>ID</th>
        <th>Имя</th>
        <th>Логин</th>
        <th>Email</th>
    </tr>
    </thead>
    <tbody>
    <!-- цикл по всем  -->
    <c:forEach var="u" items="${allUsers}">
        <tr>
            <td>${u.id}</td>
            <td>${u.name}</td>
            <td>${u.username}</td>
            <td>${u.profile.email}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</c:if>

<br>
<a href="${pageContext.request.contextPath}/">На главную</a>
</body>
</html>
