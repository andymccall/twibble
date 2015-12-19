<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

    <jsp:include page="/views/fragments/header.jsp" />

<div class="container">

	<h1>User Detail</h1>
	<br />

	<div class="row">
		<label class="col-sm-2">UserID</label>
		<div class="col-sm-10">${user.userId}</div>
	</div>

	<div class="row">
		<label class="col-sm-2">Username</label>
		<div class="col-sm-10">${user.username}</div>
	</div>

	<div class="row">
		<label class="col-sm-2">First Name</label>
		<div class="col-sm-10">${user.firstName}</div>
	</div>

	<div class="row">
		<label class="col-sm-2">Last Name</label>
		<div class="col-sm-10">${user.lastName}</div>
	</div>

	<div class="row">
		<label class="col-sm-2">Email</label>
		<div class="col-sm-10">${user.emailAddress}</div>
	</div>

</div>

       <jsp:include page="/views/fragments/footer.jsp" />

</body>
</html>