<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 28.02.2023
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Delete Student</title>
</head>
<body>
<div>
    <h1>Student deleted!</h1>
</div>

<div style="background-color: #f6d5d5; text-align: center">Student:</div>
<div>
    <form action="/students" method="get">
        <table>
            <tr>
                <td>Student ID</td>
                <input type="hidden" name="id" value="${student.getId()}">
                <td>${student.getId()}</td>
            </tr>
            <tr>
                <td>Student First name</td>
                <input type="hidden" name="ffname" value="${student.getFirstName()}">
                <td>${student.getFirstName()}</td>
            </tr>
            <tr>
                <td>Student Last name</td>
                <input type="hidden" name="llname" value="${student.getLastName()}">
                <td>${student.getLastName()}</td>
            </tr>
            <tr>
                <td>Student Major</td>
                <input type="hidden" name="mmajor" value="${student.getMajor()}">
                <td>${student.getMajor()}</td>
            </tr>
            <tr>
                <td>Student Phone</td>
                <input type="hidden" name="pphone" value="${student.getPhoneNumber()}">
                <td>${student.getPhoneNumber()}</td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Ok">
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
