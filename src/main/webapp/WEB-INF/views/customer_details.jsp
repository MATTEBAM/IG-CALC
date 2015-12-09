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

	<h1 class="heading-xlarge">Customer Details</h1>
	
	<form:form method="post" modelAttribute="customerDetails">
		<div id="customerDetailsDiv">
			<fieldset class="form-group-compound">
				<label class="form-label-bold">NINO:</label>
				<form:input class="form-control" path="nino" />
			</fieldset>
			<fieldset class="form-group-compound">
				<label class="form-label-bold">Name:</label>
				<form:input class="form-control" path="name" />
			</fieldset>
			<fieldset class="form-group-compound">
				<label class="form-label-bold">Gender:</label>
				<form:select class="form-control" path="gender">
					<option value="Male">Male</option>
					<option value="Female">Female</option>
				</form:select>
			</fieldset>
			<fieldset class="form-group-compound">
				<label class="form-label-bold">Date of Birth:</label>
				<form:input class="form-date datepicker" path="dob" />
			</fieldset>
			<fieldset class="form-group-compound">
				<label class="form-label-bold">SPa Date:</label>
				<form:input class="form-date datepicker" path="spaDate" id="customerSpaDate" />
			</fieldset>
			<fieldset class="form-group-compound">
				<label class="form-checkbox">
					<form:checkbox id="nspCustomerCheck" path="nspCustomer" />
					nSP Customer
			  </label>
			</fieldset>
			<fieldset class="form-group-compound">
				<label class="form-label-bold">Date of Entitlement:</label>
				<form:input class="form-date datepicker" path="dateOfEntitlement" />
			</fieldset>
			<fieldset class="form-group-compound">
				<label class="form-label-bold">Marital Status:</label>
				<form:select class="form-control" path="maritalStatus" id="customerMaritalStatus">
					<form:option value="Married">Married/Civil Partnership</form:option>
					<form:option value="Divorced">Divorced</form:option>
					<form:option value="Single">Single</form:option>
					<form:option value="Widow">Widow</form:option>
					<form:option value="Widower">Widower</form:option>
					<form:option value="SurvivingPartner">Surviving Civil Partner</form:option>
				</form:select>
			</fieldset>
			<fieldset class="form-group-compound">
				<label class="form-label-bold">Date of Marriage/Civil Partnership:</label>
				<form:input class="form-date datepicker" path="dateOfMarriage" />
			</fieldset>
			<fieldset class="form-group-compound">
				<label class="form-label-bold">Date of Divorce/CP Dissolved:</label>
				<form:input class="form-date datepicker" path="dateOfDivorce" />
			</fieldset>
			<fieldset class="form-group-compound">
				<label class="form-label-bold">Country of Residence:</label>
				<form:select class="form-control" path="countryOfResidence">
					<form:options items="${countries}"/>
				</form:select>
			</fieldset>
			<fieldset class="form-group-compound">
				<label class="form-label-bold">Frozen Rate:</label>
				<form:input class="form-date" path="frozenRate" readonly="true" />
			</fieldset>
			<fieldset class="form-group-compound">
				<label class="form-label-bold">Date of Permanent Departure:</label>
				<form:input class="form-date datepicker" path="dateOfPermanentDeparture" />
			</fieldset>
			<fieldset class="form-group-compound">
				<label class="form-label-bold">MQP Achieved:</label>
				<form:select class="form-control" path="mqpAchieved">
					<option value="Yes">Yes</option>
					<option value="No">No</option>
				</form:select>
			</fieldset>
			<fieldset class="form-group-compound">
				<label class="form-label-bold">RRE Flag Held:</label>
				<form:select class="form-control" path="rreHeld">
					<option value="Yes">Yes</option>
					<option value="No">No</option>
				</form:select>
			</fieldset>
			<fieldset class="form-group">
				<label class="form-label-bold">OLE Rates @ 6/4/2016:</label>
				<label class="form-label">Old rules amount</label>
				<form:input class="form-control numberWithDecimal" path="oldRulesAmount" />
				<label class="form-label">New rules amount</label>
				<form:input class="form-control numberWithDecimal" path="newRulesAmount" />
				<label class="form-label">Starting Amount</label>
				<form:input class="form-control numberWithDecimal" path="startingAmount" />
			</fieldset>
			<input type="submit" id="customerDetailsNextBtn" class="button" alt="Continue" value="Continue" onclick="return navigateFromCustomerDetails();" />
		</div>
	</form:form>
	
</main>

<c:import url="includes/footer.jsp"></c:import>