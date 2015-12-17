<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Twibble Users</title>
 
    <style>
        tr:first-child{
            font-weight: bold;
            background-color: #C6C9C4;
        }
    </style>
 
</head>
 
<body>
    <h2>List of Twibble Users</h2>  
    <table>
       <tr>
            <th>Twibble User ID</th>
            <th>Username</th>
        </tr>
        <c:forEach items="${users}" var="users">
            <tr>
            <td>${users.id}</td>
            <td>${users.username}</td>
            </tr>
        </c:forEach>
    </table>
    <br/>
</body>
</html>