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
	
	<h1 class="heading-xlarge">nSP Calculation</h1>
	<div class="grid-row">
		<form:form action="select_calculation_nsp" method="post" modelAttribute="nspDetails">
			<div id="nspDiv">
				<fieldset class="form-group">
					<legend class="visuallyhidden">MQP Achieved</legend>
					<label class="form-label inline">MQP Achieved</label>
					<form:input class="form-control" path="mqpAchieved" readonly="true" />
				</fieldset>

				<fieldset class="form-group">
					<legend class="visuallyhidden">RRE Flag Held</legend>
					<label class="form-label inline">RRE Flag Held</label>
					<form:input class="form-control" path="rreFlagHeld" readonly="true" />
				</fieldset>

				<fieldset class="form-group">
					<legend class="visuallyhidden">OLE Rates @ 6/4/2016</legend>
					<label class="form-label-bold">OLE Rates @ 6/4/2016</label>
					<label class="form-label">Old rules amount</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="oldRulesAmt" />
					<label class="form-label">New rules amount</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="newRulesAmt" />
					<label class="form-label">Starting Amount</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="startingAmt" readonly="true" />
				</fieldset>

				<fieldset class="form-group">
					<legend class="visuallyhidden">Pre 2016 Qualifying</legend>
					<label class="form-label-bold">Pre 2016 Qualifying</label>
					<label class="form-label">UK Qualifying Years</label>
					<form:input class="form-control number" path="ukQualYrsPre2016" />
					<label class="form-label">Additional UK Weeks identified</label>
					<form:input class="form-control number" path="addUKWeeksPre2016" readonly="true" />
					<label class="form-label">Foreign Weeks (to meet MQP)</label>
					<form:input class="form-control number" path="foreignWeeksPre2016" readonly="true" />
					<label class="form-label">Pre 75 Weeks (to meet MQP)</label>
					<form:input class="form-control number" path="pre75WeeksPre2016" readonly="true" />
				</fieldset>

				<fieldset class="form-group">
					<legend class="visuallyhidden">Revised Starting Amount @ 6/4/2016</legend>
					<label class="form-label-bold">Revised Starting Amount @ 6/4/2016</label>
					<label class="form-label">Revised Starting Amount Total</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="revisedStartingAmt" readonly="true" />
					<label class="form-label">New State Pension</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="newStatePensionRevised" readonly="true" />
					<label class="form-label">Protected Payment</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="protectedPaymentRevised" readonly="true" />
				</fieldset>

				<fieldset class="form-group">
					<legend class="visuallyhidden">Revalued Starting Amount at Date of Entitlement</legend>
					<label class="form-label-bold">Revalued Starting Amount at Date of Entitlement</label>
					<label class="form-label">Uprating Year</label>
					<form:input class="form-control" path="upratingYear" />
					<label class="form-label">Revalued Total</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="revaluedTotal" readonly="true" />
					<label class="form-label">New State Pension</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="newStatePensionRevalued" readonly="true" />
					<label class="form-label">Protected Payment</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="protectedPaymentRevalued" readonly="true" />
				</fieldset>

				<fieldset class="form-group">
					<legend class="visuallyhidden">Post 2016 Qualifying</legend>
					<label class="form-label-bold">Post 2016 Qualifying</label>
					<label class="form-label">UK Qualifying Years</label>
					<form:input class="form-control number" path="ukQualYrsPost2016" />
					<label class="form-label">Additional UK Weeks Identified</label>
					<form:input class="form-control number" path="addUKWeeksPost2016" readonly="true" />
					<label class="form-label">Foreign Weeks (to meet MQP)</label>
					<form:input class="form-control number" path="foreignWeeksPost2016" readonly="true" />
				</fieldset>

				<fieldset class="form-group">
					<legend class="visuallyhidden">NSP Components</legend>
					<label class="form-label-bold">NSP Components</label>
					<label class="form-label">New State Pension</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="newStatePensionNsp" readonly="true" />
					<label class="form-label">Protected Payment</label>
					<span>&#163;</span><input class="form-control numberWithDecimal" path="protectedPaymentNsp" readonly="true" />
					<label class="form-label">RRE Lower</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="rreLowerNsp" readonly="true" />
					<label class="form-label">RRE Higher</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="rreHigherNsp" readonly="true" />
					<label class="form-label">Protected Payment (Inh)</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="protectedPaymentInhNsp" readonly="true" />
					<label class="form-label">SP Top UP / ESP (Inh)</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="spTopUpInhNsp" readonly="true" />
					<label class="form-label">AP (Inh)</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="apInhNsp" readonly="true" />
					<label class="form-label">GRB (Inh)</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="grbInhNsp" readonly="true" />
					<label class="form-label">PSOD Debit</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="psodDebitNsp" />
					<label class="form-label">PSOD Credit</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="psodCreditNsp" />
					<label class="form-label">New State Pension ESP</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="newStatePensionEspNsp" readonly="true" />
					<label class="form-label">Protected Payment ESP</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="protectedPaymentEspNsp" readonly="true" />
					<label class="form-label">AP ESP (Inh)</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="apEspInhNsp" readonly="true" />
					<label class="form-label">GRB ESP (Inh)</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="grbEspInhNsp"  readonly="true"/>
					<label class="form-label">BP ESP (Inh)</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="bpEspInhNsp" readonly="true" />
				</fieldset>

				<fieldset class="form-group">
					<legend class="visuallyhidden">Total Weekly SP Award</legend>
					<label class="form-label">Total Weekly SP Award</label>
					<span>&#163;</span><form:input class="form-control numberWithDecimal" path="totalWeeklySPAward" readonly="true" />
				</fieldset>

				<input type="submit" id="nspNextBtn" name="nspNextBtn" class="button" alt="Continue" value="Continue" />
				<input type="button" id="nspPrintBtn" name="nspPrintBtn" class="button" alt="Print" value="Print" onclick="return generatePdf();" />
			</div>
		</form:form>
	</div>
</main>

<c:import url="includes/footer.jsp"></c:import>