<%--
  Created by IntelliJ IDEA.
  User: procn
  Date: 13.10.2026
  Time: 3:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login" method="post">

    <input type="text" name="username" placeholder="Username">
    <input type="password" name="password" placeholder="Password">
    <button>Submit</button>
</form>
</body>
</html>
