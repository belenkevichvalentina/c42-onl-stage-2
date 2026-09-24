<%--
  Created by IntelliJ IDEA.
  User: procn
  Date: 24.09.2026
  Time: 5:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Заявка сохранена успех</title>
</head>
<body>
<jsp:include page="_header.jsp"/>
<div class="container mt-5" >
    <div class="alert alert-success">
        <h3 > Заявка успешно сохранена</h3>
        <hr>

        <div class="text-start bg-light p-3 border rounded">
            <p><strong>Имя отправителя:</strong> ${name}</p>
            <p><strong>email отправителя:</strong> ${email}</p>
            <p><strong>Текст обращения:</strong> ${message}</p>
        </div>


        <a href="/save-request" class="btn btn-primary mt-3">Создать новую заявку</a>
    </div>
</div>

</body>
</html>
