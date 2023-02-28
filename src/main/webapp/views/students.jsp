<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 28.02.2023
  Time: 0:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>StudentsCRUD</title>
    <style>
        *{
            background-color: #109097;
        }
    </style>
</head>
<body>

<div style="text-align: center; color: brown;box-shadow: darkred"><h1>Students:</h1></div>

<div>
    <table style="margin: auto; width: 50%; text-align: center">
        <tr>
            <th>Id</th>
            <th>First name</th>
            <th>Last name</th>
            <th>Age</th>
            <th>Major</th>
            <th>Phone</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.getId()}</td>
                <td>${student.getFirstName()}</td>
                <td>${student.getLastName()}</td>
                <td>${student.getAge()}</td>
                <td>${student.getMajor()}</td>
                <td>${student.getPhoneNumber()}</td>
                <td>
                    <a href="edit?id=${student.getId()}">Edit</a>
                    <a href="delete?id=${student.getId()}" onclick="return confirm('Are you sure you want to delete this item?');">Delete</a>
<%--                    <a href="delete?id=${student.getId()}">Delete</a>--%>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
