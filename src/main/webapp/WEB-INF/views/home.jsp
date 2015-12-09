<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:import url="includes/layout.jsp"></c:import>

<main id="content" role="main">

	<div class="phase-banner-alpha">
		<p>
			<strong class="phase-tag">ALPHA</strong> <span>This is a new
				service.</span>
		</p>
	</div>
	
		
	<h1 class="heading-xlarge">Welcome to IG Calculator</h1>
	
	<form:form method="post">
		<div class="with-space">
			<input type="button" id="newCalcBtn" name="newCalcBtn"
				class="button-start form-control-1-3" alt="New Calculation"
				value="New Calculation" onclick="return navigateFromHome(this);" />
		</div>
		<div class="with-space">
			<input type="button" id="retrieveCalcBtn" name="retrieveCalcBtn"
				class="button-start form-control-1-3" alt="Retrieve Calculation"
				value="Retrieve Calculation" onclick="javascript: void(0);" disabled="disabled" />
		</div>
	</form:form>
	
</main>

<c:import url="includes/footer.jsp"></c:import>