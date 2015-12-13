<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Twibble</title>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
</head>
<body>
<h1>
    Add a Twibble
</h1>

<c:url var="addAction" value="/twibble/add" ></c:url>

<form:form action="${addAction}" commandName="twibble">
<table>
    <c:if test="${!empty twibble.twibble}">
    <tr>
        <td>
            <form:label path="id">
                <spring:message text="ID"/>
            </form:label>
        </td>
        <td>
            <form:input path="id" readonly="true" size="8"  disabled="true" />
            <form:hidden path="id" />
        </td> 
    </tr>
    </c:if>
    <tr>
        <td>
            <form:label path="twibble">
                <spring:message text="twibble"/>
            </form:label>
        </td>
        <td>
            <form:input path="twibble" />
        </td> 
    </tr>
    <tr>
        <td colspan="2">
            <c:if test="${!empty twibble.twibble}">
                <input type="submit"
                    value="<spring:message text="Edit Twibble"/>" />
            </c:if>
            <c:if test="${empty twibble.twibble}">
                <input type="submit"
                    value="<spring:message text="Add Twibble"/>" />
            </c:if>
        </td>
    </tr>
</table>  
</form:form>
<br>
<h3>Twibble List</h3>
<c:if test="${!empty listTwibbles}">
    <table class="tg">
    <tr>
        <th width="80">Twibble ID</th>
        <th width="120">Twibble Twibble</th>
        <th width="60">Edit</th>
        <th width="60">Delete</th>
    </tr>
    <c:forEach items="${listTwibbles}" var="twibble">
        <tr>
            <td>${twibble.id}</td>
            <td>${twibble.twibble}</td>
            <td><a href="<c:url value='/edit/${twibble.id}' />" >Edit</a></td>
            <td><a href="<c:url value='/remove/${twibble.id}' />" >Delete</a></td>
        </tr>
    </c:forEach>
    </table>
</c:if>
</body>
</html>
 
