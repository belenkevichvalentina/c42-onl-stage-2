<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty flag}">
    <p>localhost:8080/greetingServlet?name=TestJohn&flag=true</p>
    <p>true localhost:8080/greetingServlet&flag=true</p>
    <p>false localhost:8080/greetingServlet&flag=false</p>
    <p>flag == 'true'</p>

</c:if>
<ul>
    <c:forEach items="${names}" var="name">
        <li>${name}</li>
    </c:forEach>
</ul>

<p>${messageUser}</p>

</body>
</html>
