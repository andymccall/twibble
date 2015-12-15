<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Twibbles</title>
 
    <style>
        tr:first-child{
            font-weight: bold;
            background-color: #C6C9C4;
        }
    </style>
 
</head>
 
<body>
    <h2>List of Twibbles</h2>  
    <table>
       <tr>
            <th>Twibble ID</th>
            <th>Twibble</th>
            <th>Username</th>
        </tr>
        <c:forEach items="${twibbles}" var="twibble">
            <tr>
            <td>${twibble.id}</td>
            <td>${twibble.text}</td>
            <td>${twibble.username}</td>
            </tr>
        </c:forEach>
    </table>
    <br/>
</body>
</html>