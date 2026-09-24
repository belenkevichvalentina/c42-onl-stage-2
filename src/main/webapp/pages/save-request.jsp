<%--
  Created by IntelliJ IDEA.
  User: procn
  Date: 24.09.2026
  Time: 5:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <title>Создание заявки</title>
</head>
<body>
<jsp:include page="_header.jsp"/>
<div class="container mt-5">
    <h1>Оставить заявку</h1>
    <c:if test="${not empty error}">
        <div class="alert alert-danger">
            ${error}
        </div>
    </c:if>

    <form action="/save-request" method="post">
        <div class="mb-3">
            <label for="name" class="form-label">Имя: </label>
            <input type="text"  class="form-control" id="name" name="name" value="${param.name}">
        </div>
        <div class="mb-3">
            <label for="name" class="form-label">Email: </label>
            <input type="email" class="form-control" id="email" name="email" value="${param.email}">
        </div>
        <div class="mb-3">
            <label for="message" class="form-label">Сообщение:</label>
            <textarea class="form-control" id="message" name="message" rows="3">${param.message}</textarea>
        </div>
        <button type="submit" class="btn btn-primary">Отправить заявку</button>

    </form>

</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
        crossorigin="anonymous"></script>
</body>
</html>
