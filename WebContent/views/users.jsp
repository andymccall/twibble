<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>

    <jsp:include page="/views/fragments/header.jsp" />

    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Twibble Users</title>
 
</head>
 
<body>

    <div class="container">
    <h2>Twibble Users</h2>  
    <p id="demo"></p>
    <table class="table table-striped">
    <thead>
      <tr>
        <th>UserID</th>
        <th>Username</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email Address</th>
        <th>Actions</th>
      </tr>
    </thead>
    <tbody>
        <c:forEach items="${users}" var="users">
            <tr>
              <td>${users.userId}</td>
              <td>${users.username}</td>
              <td>${users.firstName}</td>
              <td>${users.lastName}</td>
              <td>${users.emailAddress}</td>
              <td><button type="button" class="btn btn-warning">Modify</button></td>
              
              <td>
              <spring:url value="/users/${users.userId}/delete" var="deleteUrl" />             
              <button type="button" class="btn btn-danger" onclick="this.disabled=true;post('${deleteUrl}')">Delete</button></td>
            </tr>
        </c:forEach>
      </tbody>
    </table>
</div>   
    
       <jsp:include page="/views/fragments/footer.jsp" />
 
  <script>
function post(path, params, method) {
	method = method || "post"; 

	var form = document.createElement("form");
	form.setAttribute("method", method);
	form.setAttribute("action", path);
	
	document.body.appendChild(form);
	form.submit();
	
}

</script>
  
</body>
</html>