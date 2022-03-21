<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello Test!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

${requestScope.msg}
<br>
<br>
<br>

<c:forEach items="${applicationScope.konti}" var="item">
    <p>${item.value.navn} : ${item.value.saldo}</p>
</c:forEach>



</body>
</html>