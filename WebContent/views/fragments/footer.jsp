<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="container">
	<hr>
	<footer>
		<p>&copy; Twibble.co 2015</p>
	</footer>
</div>

<spring:url value="/resources/scripts/bootstrap.min.js"	var="bootstrapJs" />
<spring:url value="/resources/scripts/jquery-2.1.4.min.js" var="jqueryJs" />

<script src="${jqueryJs}"></script>
<script src="${bootstrapJs}"></script>


