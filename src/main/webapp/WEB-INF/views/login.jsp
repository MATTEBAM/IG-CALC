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

	<c:url var="loginUrl" value="/login" />
	
	<form:form action="${loginUrl}" method="post" modelAttribute="user">
		
		<c:if test="${param.error != null}">
            <div class="form-group error">
                <p>Invalid username and password.</p>
            </div>
        </c:if>
        <c:if test="${param.logout != null}">
            <div class="form-group error">
                <p>You have been logged out successfully.</p>
            </div>
        </c:if>
        <c:if test="${param.expiredSession != null}">
            <div class="form-group error">
                <p>Your session is either invalid or expired. Please login again.</p>
            </div>
        </c:if>
        <c:if test="${param.accessDenied != null}">
            <div class="form-group error">
                <p>Access denied. Please login.</p>
            </div>
        </c:if>
				
		<fieldset class="form-group">
			<legend class="visuallyhidden">Login Credentials</legend>
			<label class="form-label-bold"> Username: <span
				class="form-hint">Enter your username.</span>
			</label> <form:input class="form-control" path="username"
				id="username" />
		</fieldset>
		
		<fieldset class="form-group">
			<label class="form-label-bold"> Password: <span
				class="form-hint">Enter your password.</span>
			</label> <form:password class="form-control" path="password"
				id="password" />
		</fieldset>
		
		<%-- <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> --%>
		
		<input type="submit" id="loginBtn" name="loginBtn" class="button"
			alt="Login" value="Login" />
			
	</form:form>

</main>
	
<c:import url="includes/footer.jsp"></c:import>
	