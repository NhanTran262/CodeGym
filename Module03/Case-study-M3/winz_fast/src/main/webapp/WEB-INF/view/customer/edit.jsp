<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 10/15/2023
  Time: 2:50 AM
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
    <title>Customer</title>
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
            background-color: #63db34;
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
            background-color: rgba(255, 255, 255, 0.13);
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

        form {
            background-color: #fff5ee;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            max-width: 400px;
            margin: 0 auto;
        }

        label {
            color: #ff9114;
            font-weight: bold;
        }

        input[type="text"],
        input[type="date"],
        input[type="email"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ff9114;
            border-radius: 5px;
        }

        input[type="radio"] {
            margin-right: 5px;
        }

        button[type="submit"] {
            background-color: #ff9114;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
        }

        button[type="submit"]:hover {
            background-color: #ff9114;
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
            <center>
                <h1>Customer Manager</h1>
                <h2>Edit Customer</h2>
            </center>
            <div class="container">
                <div class="col-2"></div>
                <div class="col-8">
                    <form action="${pageContext.request.contextPath}/customer?action=edit" method="post">
                        <div>
                            <input type="hidden" name="id" value="${customer.id}">
                        </div>
                        <div class="form-floating mb-3">
                            <label for="customerTypeId">Customer Type:</label>
                            <select name="customerTypeId" id="customerTypeId" class="form-select"
                                    aria-label="Default select example"
                                    style="padding: 0 20px">
                                <option selected>Select Customer Type</option>
                                <c:forEach var="customerType" items="${customerTypes}">
                                    <option value="${customerType.id}">
                                            ${customerType.name}
                                    </option>
                                </c:forEach>
                            </select><br><br>
                        </div>
                        <div>
                            <label for="name">Name:</label>
                            <input type="text" id="name" name="name" value="${customer.name}" placeholder="Name"
                                   required><br><br>
                        </div>
                        <div>
                            <label for="dateOfBirth">Date Of Birth:</label>
                            <input type="date" id="dateOfBirth" name="dateOfBirth" value="${customer.dateOfBirth}"
                                   placeholder="Date Of Birth" required><br><br>
                        </div>
                        <div class="form-floating mb-3">
                            <label for="gender">Gender:</label>
                            <select name="gender" id="gender" class="form-select" aria-label="Default select example">
                                <option selected>Select Gender</option>
                                <option value="1">Male</option>
                                <option value="0">Female</option>
                            </select><br><br>
                        </div>
                        <div>
                            <label for="idCard">Id Card:</label>
                            <input type="text" id="idCard" name="idCard" value="${customer.idCard}"
                                   placeholder="Id Card"
                                   required><br><br>
                        </div>
                        <div>
                            <label for="phoneNumber">Phone Number:</label>
                            <input type="text" id="phoneNumber" name="phoneNumber" value="${customer.phoneNumber}"
                                   placeholder="Phone Number" required><br><br>
                        </div>
                        <div>
                            <label for="email">Email:</label>
                            <input type="text" id="email" name="email" value="${customer.email}" placeholder="Email"
                                   required><br><br>
                        </div>
                        <div>
                            <label for="customerAddress">Address:</label>
                            <input type="text" id="customerAddress" name="customerAddress"
                                   value="${customer.customerAddress}"
                                   placeholder="Address" required><br><br>
                        </div>
                        <button type="submit" value="edit">Edit</button>
                    </form>
                    <form action="${pageContext.request.contextPath}/customer">
                        <input type="hidden" name="action" value="customer">
                        <button type="submit" value="customer">Back</button>
                    </form>
                </div>
                <div class="col-2"></div>
            </div>
            <script
                    src="https://kit.fontawesome.com/4788e609ac.js"
                    crossorigin="anonymous"
            ></script>
</body>
</html>
