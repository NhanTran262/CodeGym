<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 10/28/2023
  Time: 9:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Mail Config</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous"></script>
</head>
<body>
<table class="table">
    <tr>
        <th hidden="hidden">ID</th>
        <th>Language</th>
        <th>Page Size</th>
        <th>Spam Filter</th>
        <th>Signature</th>
        <th></th>
    </tr>
    <c:forEach items="${mailConfigs}" var="mailConfig">
        <td hidden="hidden">${mailConfig.id}</td>
        <td>${mailConfig.language}</td>
        <td>${mailConfig.pageSize}</td>
        <td>${mailConfig.spamFilter}</td>
        <td>${mailConfig.signature}</td>
        <td class="text-center"><a href="${pageContext.request.contextPath}/config/edit?id=${mailConfig.id}">
            <span class="fa-solid fa-user-pen text-primary h4 m-auto">Edit</span>
        </a></td>
    </c:forEach>
</table>
</body>
</html>
