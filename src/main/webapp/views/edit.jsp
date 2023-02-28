<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 28.02.2023
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit Student</title>
    <style>
        *{
            background-color: #109097;
        }
    </style>
</head>
<body>
<div style="text-align: center"><h1>Edit Student</h1></div>

<hr>

<form action="/edit" method="post">
    <table>
        <tr>
            <td>Student ID</td>
            <input type="hidden" name="id" value="${student.getId()}">
            <td>${student.getId()}</td>
        </tr>
        <tr>
            <td>Student First name</td>
            <td><input type="text" name="Fname" value="${student.getFirstName()}"></td>
        </tr>
        <tr>
            <td>Student Last name</td>
            <td><input type="text" name="Lname" value="${student.getLastName()}"></td>
        </tr>
        <tr>
            <td>Student Major</td>
            <td><input type="text" name="major" value="${student.getMajor()}"></td>
        </tr>
        <tr>
            <td>Student Phone</td>
            <td><input type="text" name="phone" value="${student.getPhoneNumber()}"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Update">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
