<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

	<jsp:include page="/views/fragments/header.jsp" />

    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Twibble</title>
 
</head>
 
<body>
    <h2>List of Twibbles</h2>  
 
 <div class="row">
  <div class="col-sm-4"></div>
  
  <div class="col-sm-4">
   <table>
        <c:forEach items="${twibbles}" var="twibble">
        <div class="container">
            <tr>
            	<td><b>${twibble.fullName}</b>, @${twibble.username}</td>
            </tr>
            <tr>
            	<td>${twibble.text}</td>
            </tr>
        </div>
        <br/>
        </c:forEach>
    </table>
  
  </div>
  
  <div class="col-sm-4"></div>
</div>
 
    <jsp:include page="/views/fragments/footer.jsp" />
    
</body>
</html>