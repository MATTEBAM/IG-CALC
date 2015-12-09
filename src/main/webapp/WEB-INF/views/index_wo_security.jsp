<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

	<c:import url="includes/layout.jsp"></c:import>

<main id="content" role="main">

	<div class="phase-banner-alpha">
		<p>
			<strong class="phase-tag">ALPHA</strong> <span>This is a new
				service.</span>
		</p>
	</div>

	<h1 class="heading-xlarge">Welcome to IG Calculator</h1>

	<form:form action="login" method="post" modelAttribute="login">
		<c:if test="${not empty error}">
			<div class="form-group error"><c:out value="${error}" /></div>
		</c:if>
		<fieldset class="form-group">
			<legend class="visuallyhidden">Login Credentials</legend>
			<label class="form-label-bold"> Username: <span
				class="form-hint">Enter your username.</span>
			</label> <form:input class="form-control" type="text" path="username"
				id="username" />
		</fieldset>
		<fieldset class="form-group">
			<label class="form-label-bold"> Password: <span
				class="form-hint">Enter your password.</span>
			</label> <form:input class="form-control" type="password" path="password"
				id="password" />
		</fieldset>
		<input type="submit" id="loginBtn" name="loginBtn" class="button"
			alt="Login" value="Login" />
	</form:form>

</main>
	
<c:import url="includes/footer.jsp"></c:import>
	