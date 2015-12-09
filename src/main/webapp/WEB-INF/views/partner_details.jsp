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
	
	<h1 class="heading-xlarge">Spouse/Civil Partner Details</h1>

	<form:form action="select_calculation_partner" method="post" modelAttribute="partnerDetails">
		<fieldset class="form-group-compound">
			<label class="form-label-bold">NINO:</label>
			<form:input class="form-control" path="nino" />
		</fieldset>
		<fieldset class="form-group-compound">
			<label class="form-label-bold">Name:</label>
			<form:input class="form-control" path="name" />
		</fieldset>
		<fieldset class="form-group-compound">
			<label class="form-label-bold">Date of Birth:</label>
			<form:input class="form-date datepicker" path="dob" />
		</fieldset>
		<fieldset class="form-group-compound">
			<label class="form-label-bold">SPa Date:</label>
			<form:input class="form-date datepicker" path="spaDate" id="partnerSpaDate" />
		</fieldset>
		<fieldset class="form-group-compound">
			<label class="form-checkbox">
				<form:checkbox id="nspPartnerCheck" path="nspCustomer" />
				nSP Customer
		  </label>
		</fieldset>
		<fieldset class="form-group">
			<label class="form-label-bold">Date of Death:</label>
			<form:input class="form-date datepicker" path="dateOfDeath" />
		</fieldset>
		<input type="submit" id="partnerDetailsNextBtn" class="button" alt="Continue" value="Continue" />
	</form:form>
	
</main>

<c:import url="includes/footer.jsp"></c:import>