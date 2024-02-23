<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 10/23/2023
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>USD to VND Conversion</title>
</head>
<body>
<h1>USD to VND Conversion</h1>
<form action="${pageContext.request.contextPath}/convert" method="post">
    <label for="rate">Exchange Rate:</label>
    <input type="number" name="rate" required step="0.01"><br><br>
    <label for="usdAmount">USD Amount:</label>
    <input type="number" name="usdAmount" required step="0.01"><br><br>
    <input type="submit" value="Convert">
</form>
</body>
</html>
