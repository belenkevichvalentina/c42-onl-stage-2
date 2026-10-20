<%--
  Created by IntelliJ IDEA.
  User: procn
  Date: 16.10.2026
  Time: 5:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/update" method="post">
    <input type="text" name="name" value="${sessionScope.user.name}" placeholder="Name"><br>
    <input type="text" name="email" value="${sessionScope.user.profile.email}" placeholder="Email"><br>
    <input type="text" name="username" value="${sessionScope.user.username}" placeholder="Username"><br>
    <input type="password" name="password" value="${sessionScope.user.password}" placeholder="Password"><br>
    <button>Submit</button>
</form>

</body>
</html>

<%--SELECT * FROM users ORDER BY id DESC LIMIT 5;--%>