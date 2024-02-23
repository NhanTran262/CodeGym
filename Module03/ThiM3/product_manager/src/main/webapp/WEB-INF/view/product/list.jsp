<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 10/17/2023
  Time: 10:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <style>
        img{
            width: 50px;
            height: 50px;
        }
    </style>
</head>
<body>
<h2>T - Shirts</h2>
<table class="table table-dark">
    <thead>
    <tr >
        <th>Name</th>
        <th>Image</th>
        <th>Price</th>
        <th> </th>
    </tr>
    </thead>
    <tbody>
    <C:forEach var="product" items="${products}">
        <tr>
            <td>
                <c:out value="${product.name}"></c:out>
            <td>
                <c:out value="${product.imageUrl}"/>
            </td>
            <td>
                <c:out value="${product.price}"></c:out>
            </td>

            <td>
                <form action="${pageContext.request.contextPath}/product" method="get">
                    <input type="hidden" name="action" value="buy">
                    <input type="hidden" name="id" value="${product.id}">
                    <button type="submit">Buy</button>
                </form>
            </td>
        </tr>
    </C:forEach>
    </tbody>
</table>


</body>
</html>
