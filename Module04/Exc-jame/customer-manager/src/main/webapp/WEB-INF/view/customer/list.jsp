<%@ page import="java.util.List" %>
<%@ page import="com.example.customermanager.model.Customer" %><%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 10/18/2023
  Time: 9:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
    table{
        border: 1px solid #000;
    }
    th,td {
        border: 1px dotted #555;
    }
</style>
There are ${requestScope.customers.size()}customer(s) in list.
<table>
    <caption>Customer List</caption>
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="c" items="${requestScope.customers}">
        <tr>
            <td><c:out value="${c.id}"/></td>
            <td><a href="edit.jsp?id=${c.id}">${c.name}</a></td>
            <td><c:out value="${c.email}"/></td>
            <td><c:out value="${c.address}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>