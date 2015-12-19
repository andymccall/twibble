<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

    <jsp:include page="/views/fragments/header.jsp" />

<div class="container">

	<h1>Add User</h1>
	
	<br />

	<spring:url value="/users" var="userActionUrl" />

	<form:form class="form-horizontal" method="post" 
                modelAttribute="userForm" action="${userActionUrl}">

		<form:hidden path="userId" />

		<spring:bind path="username">
		  <div class="form-group ${status.error ? 'has-error' : ''}">
			<label class="col-sm-2 control-label">Username</label>
			<div class="col-sm-10">
				<form:input path="username" type="text" class="form-control" 
                                id="username" placeholder="username" />
				<form:errors path="username" class="control-label" />
			</div>
		  </div>
		</spring:bind>

		<spring:bind path="firstName">
		  <div class="form-group ${status.error ? 'has-error' : ''}">
			<label class="col-sm-2 control-label">First Name</label>
			<div class="col-sm-10">
				<form:input path="firstName" type="text" class="form-control" 
                                id="firstName" placeholder="firstName" />
				<form:errors path="firstName" class="control-label" />
			</div>
		  </div>
		</spring:bind>

		<spring:bind path="lastName">
		  <div class="form-group ${status.error ? 'has-error' : ''}">
			<label class="col-sm-2 control-label">First Name</label>
			<div class="col-sm-10">
				<form:input path="lastName" type="text" class="form-control" 
                                id="lastName" placeholder="lastName" />
				<form:errors path="lastName" class="control-label" />
			</div>
		  </div>
		</spring:bind>

		<spring:bind path="emailAddress">
		  <div class="form-group ${status.error ? 'has-error' : ''}">
			<label class="col-sm-2 control-label">Email</label>
			<div class="col-sm-10">
				<form:input path="emailAddress" class="form-control" 
                                id="emailAddress" placeholder="emailAddress" />
				<form:errors path="emailAddress" class="control-label" />
			</div>
		  </div>
		</spring:bind>

		<div class="form-group">
		  <div class="col-sm-offset-2 col-sm-10">
			     <button type="submit" class="btn btn-primary pull-right">Add</button>
		  </div>
		</div>
	</form:form>

</div>

       <jsp:include page="/views/fragments/footer.jsp" />

</body>
</html>