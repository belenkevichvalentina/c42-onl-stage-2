<%--
  Created by IntelliJ IDEA.
  User: procn
  Date: 26.09.2026
  Time: 7:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <title>SOLID Food</title>
</head>
<body>
<jsp:include page="_header.jsp"/>

<div class="container my-5" style="max-width: 500px;">
  <div class="card shadow-sm p-4 bg-white text-center">
    <h3 class="text-warning mb-3">SOLID Food</h3>
    <hr>

    <div class="text-start bg-light p-3 border rounded mb-3">
      <p><strong>Блюдо:</strong> ${orderName}</p>
      <p><strong>Базовая цена:</strong> <del class="text-danger">${oldPrice} BYN</del></p>

      <p class="fs-5 text-success"><strong>Итого к оплате (-5%):</strong> <b>${finalPrice} BYN</b></p>
    </div>

    <div class="alert alert-success" role="alert">
       <b>Статус доставки:</b> Курьер на машине выехал к вам!
    </div>
  </div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
        crossorigin="anonymous"></script>
</body>
</html>
