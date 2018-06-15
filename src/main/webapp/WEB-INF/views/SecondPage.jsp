<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>
<div
        xmlns:jsp="http://java.sun.com/JSP/Page"
        xmlns:spring="http://www.springframework.org/tags"
        xmlns:c="http://java.sun.com/jsp/jstl/core"
        xmlns:form="http://www.springframework.org/tags/form"
        xmlns:th="http://www.thymeleaf.org">
    <h1>It's the second page</h1>
    ${user}
</div>
<form action="/ThirdPage">
    <input type="submit" value="Third">
</form>
</body>
</html>
