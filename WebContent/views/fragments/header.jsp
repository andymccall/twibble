<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<head>
<title>Twibble</title>

<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />

<link href="${bootstrapCss}" rel="stylesheet" />

</head>

<spring:url value="/" var="urlHome" />

<nav class="navbar navbar-inverse ">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="${urlHome}">Twibble</a>
		</div>
	</div>
</nav>