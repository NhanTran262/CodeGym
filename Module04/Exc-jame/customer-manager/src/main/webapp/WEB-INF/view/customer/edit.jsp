<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 10/18/2023
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer</title>
</head>
<body>
<h2>Customer Information</h2>
<form action="${pageContext.request.contextPath}/customer?action=edit" method="post">
    <div>
        <label>ID:</label>
        <c:out value="${customer.id}"/><br><br>
    </div>
    <div>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="${customer.name}" placeholder="Name" required><br><br>
    </div>

    <div>
        <label for="email">Email:</label>
        <input type="text" id="email" name="email" value="${customer.email}" placeholder="Email" required><br><br>
    </div>
    <div>
        <label for="customerAddress">Address:</label>
        <input type="text" id="customerAddress" name="customerAddress"
               value="${customer.address}" placeholder="Address" required><br><br>
    </div>
    <button type="submit" value="edit">Edit</button>
    <a href="/customers">Back To List</a>
</form>
<div class="col-2"></div>
</body>
</html>
