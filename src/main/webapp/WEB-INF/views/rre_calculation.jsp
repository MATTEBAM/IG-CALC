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
	
	<h1 class="heading-xlarge">nSP Reduced Rate Election Calculation</h1>
	<div class="grid-row">
		<form:form action="select_calculation_rre" method="post" modelAttribute="rreDetails">
			<div id="rreDiv">
				<fieldset class="form-group">
					<legend class="visuallyhidden">RRE held</legend>
					<label class="form-label">RRE held</label>
					<form:select class="form-control" path="rreFlagHeld">
						<form:option value="Yes">Yes</form:option>
						<form:option value="No">No</form:option>
					</form:select>
				</fieldset>
				
				<fieldset class="form-group">
					<legend class="visuallyhidden">RRE Rate</legend>
					<label class="form-label">RRE Rate</label>
					<form:input class="form-control" path="rreRate" readonly="true" />
				</fieldset>

				<fieldset class="form-group">
					<legend class="visuallyhidden">RRE Calculation @ 06/04/2016</legend>
					<label class="form-label-bold">RRE Calculation @ 06/04/2016</label>
					<label class="form-label">RRE Amount</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="rreAmount" readonly="true" />
					<label class="form-label">AP</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="ap" />
					<label class="form-label">GRB</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="grb" />
				</fieldset>
				
				<fieldset class="form-group">
					<legend class="visuallyhidden">NSP Starting Amount @ 06/04/2016</legend>
					<label class="form-label-bold">NSP Starting Amount @ 06/04/2016</label>
					<label class="form-label">New State Pension</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="nspStarting" readonly="true" />
					<label class="form-label">Protected Payment</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="protectedPaymentStarting" readonly="true" />
				</fieldset>
				
				<fieldset class="form-group">
					<legend class="visuallyhidden">NSP Calculation at Date of Entitlement</legend>
					<label class="form-label-bold">NSP Calculation at Date of Entitlement</label>
					<label class="form-label">Uprating Year</label>
					<form:input class="form-control" path="upratingYearNspEntitlement" title="This should be in the format yyyy/yy" />
					<label class="form-label">New State Pension</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="nspNspEntitlement" readonly="true" />
					<label class="form-label">Protected Payment</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="protectedPaymentNspEntitlement" readonly="true" />
					<label class="form-label">NSP Total Amount</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="nspTotalNspEntitlement" readonly="true" />
				</fieldset>
				
				<fieldset class="form-group">
					<legend class="visuallyhidden">RRE Calculation at Date of Entitlement</legend>
					<label class="form-label-bold">RRE Calculation at Date of Entitlement</label>
					<label class="form-label">Uprating Year</label>
					<form:input class="form-control" path="upratingYearRreEntitlement" title="This should be in the format yyyy/yy" />
					<label class="form-label">RRE Amount</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="rreRreEntitlement" readonly="true" />
					<label class="form-label">AP</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="apRreEntitlement" readonly="true" />
					<label class="form-label">GRB</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="grbRreEntitlement" readonly="true" />
					<label class="form-label">RRE Total Amount</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="rreTotalRreEntitlement" readonly="true" />
				</fieldset>
				

				<input type="submit" id="rreNextBtn" name="rreNextBtn" class="button" alt="Continue" value="Continue" />
			</div>
		</form:form>
	</div>
</main>

<c:import url="includes/footer.jsp"></c:import>