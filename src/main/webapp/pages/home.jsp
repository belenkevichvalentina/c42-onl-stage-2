
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
<%--    <meta name="viewport" content="width=device-width, initial-scale=1">--%>
    <title>Home</title>
<%--    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">--%>
</head>
<body>
<jsp:include page="_header.jsp"/>
<h1>Главная страница</h1>
<div class="container">
    <div class="row justify-content-center">
        <c:forEach items="${posts}" var="post">
            <div class="card" style="width: 18rem;">
                <img src="${post.imageUrl}" class="card-img-top" alt="">
                <div class="card-body">
                    <h5 class="card-title">${post.title}</h5>
                    <p class="card-text">${post.content}</p>
                    <p class="card-text">${post.author.name}</p>
                </div>
            </div>
        </c:forEach>
    </div>

</div>
<%--<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>--%>
</body>
</html>