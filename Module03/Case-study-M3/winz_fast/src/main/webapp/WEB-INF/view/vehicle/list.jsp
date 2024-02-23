<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 10/12/2023
  Time: 11:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
    />
    <title>Vehicle</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            display: flex;
            flex-direction: column;
            height: 100vh;
        }

        .container {
            display: flex;
            flex: 1;
        }

        .sidebar {
            background-color: #333;
            color: #fff;
            width: 240px;
            padding: 20px;
        }

        .sidebar__logo {
            font-size: 24px;
            font-weight: bold;
            margin-bottom: 20px;
        }

        #sidebar-nav a {
            display: block;
            padding: 10px 0;
            text-decoration: none;
            color: #fff;
            transition: background-color 0.3s;
        }

        #sidebar-nav a:hover {
            background-color: #555;
        }

        #sidebar-nav {
            list-style: none;
            padding: 0;
        }

        #sidebar-nav i {
            margin-right: 10px;
        }

        #sidebar-nav a + a {
            margin-top: 10px;
        }


        .main {
            flex: 1;
            padding: 0px;
            background-color: #eeeeee;
        }

        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 14px;
            background-color: #fff;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        .navbar__name {
            font-size: 34px;
            font-weight: bold;
        }

        .navbar__avatar {
            font-size: 2em;
            color: #ffb969;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }

        th,
        td {
            padding: 10px;
            border: 1px solid #ddd;
            text-align: center;
        }

        th {
            background-color: #63db34;
            color: white;
            font-weight: bold;
            border-radius: 5px;
        }

        tr:nth-child(even) {
            background-color: #ffe4e1;
        }

        tr:nth-child(odd) {
            background-color: #fff5ee;
        }

        button {
            background-color: #ffa369;
            color: white;
            border: none;
            padding: 5px 10px;
            cursor: pointer;
            border-radius: 5px;
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #ff9114;
        }

        th:last-child,
        td:last-child {
            border-right: 2px solid #53db34;
        }

        th:first-child,
        td:first-child {
            border-left: 2px solid #34db63;
            border-right: 1px solid #ddd;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="sidebar">
        <div class="sidebar__logo">Manage<span>Admin</span></div>
        <div class="col-2 px-0">
            <div id="sidebar" class="collapse collapse-horizontal show border-end">
                <div id="sidebar-nav" class="list-group border-0 rounded-0 text-sm-start min-vh-100">
                    <a href="/user"><span>User</span> </a>
                    <br>
                    <a href="/employee"> <span>Employee</span></a>
                    <br>
                    <a href="/vehicle"> <span>Vehicle</span></a>
                    <br>
                    <a href="/customer"> <span>Customer</span></a>
                    <br>
                    <a href="/contract"> <span>Contract</span></a>
                    <br>
                    <a href="/logout"> <span>Logout</span></a>
                    <br>
                </div>
            </div>
        </div>

    </div>
    <div class="main">
        <nav class="navbar">
            <span class="navbar__name">Admin</span>
            <div class="navbar__avatar">
                <a href="/img/hehe.jpg">
                    <svg
                            xmlns="http://www.w3.org/2000/svg"
                            height="2em"
                            viewBox="0 0 512 512"
                    >
                        <path
                                d="M406.5 399.6C387.4 352.9 341.5 320 288 320H224c-53.5 0-99.4 32.9-118.5 79.6C69.9 362.2 48 311.7 48 256C48 141.1 141.1 48 256 48s208 93.1 208 208c0 55.7-21.9 106.2-57.5 143.6zm-40.1 32.7C334.4 452.4 296.6 464 256 464s-78.4-11.6-110.5-31.7c7.3-36.7 39.7-64.3 78.5-64.3h64c38.8 0 71.2 27.6 78.5 64.3zM256 512A256 256 0 1 0 256 0a256 256 0 1 0 0 512zm0-272a40 40 0 1 1 0-80 40 40 0 1 1 0 80zm-88-40a88 88 0 1 0 176 0 88 88 0 1 0 -176 0z"></path>
                    </svg>
                </a>
            </div>
        </nav>
        <section class="content">
            <p class="content__items">
            <h1 align="center">Vehicle Manager</h1>
            <table class="table table-striped table-success">
                <caption>
                    <h2>List Of Vehicle</h2>
                    <form action="${pageContext.request.contextPath}/vehicle" method="get">
                        <input type="hidden" name="action" value="create">
                        <button type="submit" value="create">Create</button>
                    </form>
                </caption>
                <thead>
                <tr>
                    <td>STT</td>
                    <td>Name</td>
                    <td>Brand</td>
                    <td>Variant</td>
                    <td>Price</td>
                    <td>Status</td>
                    <td>Remove</td>
                    <td>Edit</td>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="vehicle" items="${vehicles}">
                    <tr>
                        <td><c:out value="${vehicle.vehicle_id}"/></td>
                        <td><c:out value="${vehicle.vehicle_name}"/></td>
                        <c:forEach var="brand" items="${brands}">
                            <c:if test="${brand.brand_id == vehicle.brand_id}">
                                <td><c:out value="${brand.brand_name}"/></td>
                            </c:if>
                        </c:forEach>
                        <c:forEach var="variant" items="${variants}">
                            <c:if test="${variant.variant_id == vehicle.variant_id}">
                                <td>
                                    <c:out value="${variant.model}"/>
                                    <c:out value="${variant.color}"/>
                                </td>
                            </c:if>
                        </c:forEach>
                        <td><c:out value="${vehicle.price}"/></td>
                        <td><c:out value="${vehicle.status}"/></td>
                        <td>
                            <form action="${pageContext.request.contextPath}/vehicle" method="get">
                                <input type="hidden" name="action" value="remove">
                                <input type="hidden" name="vehicle_id" value="${vehicle.vehicle_id}">
                                <button type="submit">Remove</button>
                            </form>
                        </td>
                        <td>
                            <form action="${pageContext.request.contextPath}/vehicle" method="get">
                                <input type="hidden" name="action" value="edit">
                                <input type="hidden" name="vehicle_id" value="${vehicle.vehicle_id}">
                                <button type="submit">Edit</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <script
                    src="https://kit.fontawesome.com/4788e609ac.js"
                    crossorigin="anonymous"
            ></script>
</body>
</html>
