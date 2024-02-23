<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 10/25/2023
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
<div align="Center">
  <h1>Products List</h1>
    <table border="1">
        <tr>
            <td>Id</td>
            <td>Name</td>
            <td>Price</td>
            <td>Qty</td>
        </tr>
        <c:forEach var="product" items="${products}">
            <tr>
                <td>${product.id}</td>
<%--                <td><a href="/products/detail?id=${product.id}">${product.name}</a></td>--%>
                <td><a href="/products/${product.id}"> ${product.name}</a></td>
                <td>${product.price}</td>
                <td>${product.quantity}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
