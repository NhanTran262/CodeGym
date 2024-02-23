<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 10/28/2023
  Time: 9:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form modelAttribute="mailConfig" method="post" action="/config/save">
    <table>
        <tr>
            <td><form:hidden path="id"/></td>
        </tr>
        <tr>
            <td>Language:</td>
            <td colspan="2"><form:select path="language" items="${languages}"/></td>
        </tr>
        <tr>
        <td>Page Size:</td>
        <td colspan="2">Show <form:select path="pageSize">
            <form:options items="${pageSizes}"/>
        </form:select>
            emails per page
        </td>
        </tr>
        <tr>
            <td>Spams Filter:</td>
            <td colspan="2"><form:checkbox path="spamFilter"/> Enable spams filter</td>
        </tr>
        <tr>
            <td>Signature:</td>
            <td colspan="2"><form:textarea path="signature"/></td>
        </tr>
        <tr>
            <td></td>
            <td><form:button>Update</form:button></td>
            <td><form:button>Cancel</form:button></td>
        </tr>
    </table>
</form:form>
</body>
</html>
