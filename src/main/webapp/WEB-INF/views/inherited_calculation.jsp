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
	
	<h1 class="heading-xlarge">Inherited Components Calculation</h1>
	<div class="grid-row">
		<form:form action="select_calculation_inherited" method="post" modelAttribute="inheritedDetails">
			<div id="inheritedDiv">
				<fieldset class="form-group">
					<legend class="visuallyhidden">Rules to apply</legend>
					<label class="form-label-bold">Rules to apply</label>
					<label class="form-label">Customer SPa</label>
					<form:input class="form-control" path="customerSpaDateRule" readonly="true" />
					<label class="form-label">Spouse/Civil Partner SPa</label>
					<form:input class="form-control" path="partnerSpaDateRule" readonly="true" />
					<label class="form-label">Date of Marriage</label>
					<form:input class="form-control" path="dateOfMarriageRule" readonly="true" />
				</fieldset>

				<fieldset class="form-group">
					<legend class="visuallyhidden">Deferral lump sum requested</legend>
					<label class="form-label inline">Deferral lump sum requested</label>
					<form:select class="form-control" path="deferralLumpSum">
						<form:option value="Yes">Yes</form:option>
						<form:option value="No">No</form:option>
						<form:option value="N/A">N/A</form:option>
					</form:select>
				</fieldset>

				<fieldset class="form-group">
					<legend class="visuallyhidden">Spouse/CP Components at Date of Death</legend>
					<label class="form-label-bold">Spouse/CP Components at Date of Death</label>
					<label class="form-label">Tax Year</label>
					<form:input class="form-control" path="taxYear" title="This should be in the format yyyy/yy" />
					<span class="hiddenSpan">
						<label class="form-label">Protected Payment</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="protectedPayment" />
						<label class="form-label">SP Top UP / ESP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="spTopUp" />
						<label class="form-label">Pre 97 AP (Net)</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="pre97Ap" />
						<label class="form-label">Post 97 AP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="post97Ap" />
						<label class="form-label">Post 02 AP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="post02Ap" />
						<label class="form-label">Pre 97 AP (Gross)</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="pre97ApGross" />
						<label class="form-label">Pre 88 GMP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="pre88Gmp" />
						<label class="form-label">Pre 88 Non GMP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="pre88NonGmp" />
						<label class="form-label">Post 88 GMP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="post88Gmp" />
						<label class="form-label">Post 88 Non GMP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="post88NonGmp" />
						<label class="form-label">GRB</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="grb" />
						<label class="form-label">Pre 2002 AP ESP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="pre2002ApEsp" />
						<label class="form-label">Post  2002 AP ESP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="post2002ApEsp" />
						<label class="form-label">GRB ESP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="grbEsp" />
						<label class="form-label">BP ESP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="bpEsp" />
					</span>
				</fieldset>

				<fieldset class="form-group">
					<legend class="visuallyhidden">Re-valued Spouse/CP Components at Customer's Date of Entitlement</legend>
					<label class="form-label-bold">Re-valued Spouse/CP Components at Customer's Date of Entitlement</label>
					<label class="form-label">Tax Year</label>
					<form:input class="form-control" path="taxYearRevalued" title="This should be in the format yyyy/yy" />
					<span class="hiddenSpan">
						<label class="form-label">Protected Payment</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="protectedPaymentRevalued" readonly="true" />
						<label class="form-label">SP Top UP / ESP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="spTopUpRevalued" readonly="true" />
						<label class="form-label">Pre 97 AP (Net)</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="pre97ApRevalued" readonly="true" />
						<label class="form-label">Post 97 AP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="post97ApRevalued" readonly="true" />
						<label class="form-label">Post 02 AP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="post02ApRevalued" readonly="true" />
						<label class="form-label">Pre 97 AP (Gross)</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="pre97ApGrossRevalued" readonly="true" />
						<label class="form-label">Pre 88 GMP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="pre88GmpRevalued" />
						<label class="form-label">Pre 88 Non GMP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="pre88NonGmpRevalued" />
						<label class="form-label">Post 88 GMP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="post88GmpRevalued" readonly="true" />
						<label class="form-label">Post 88 Non GMP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="post88NonGmpRevalued" readonly="true" />
						<label class="form-label">GRB</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="grbRevalued" readonly="true" />
						<label class="form-label">Pre 2002 AP ESP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="pre2002ApEspRevalued" readonly="true" />
						<label class="form-label">Post  2002 AP ESP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="post2002ApEspRevalued" readonly="true" />
						<label class="form-label">GRB ESP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="grbEspRevalued" readonly="true" />
						<label class="form-label">BP ESP</label>
						<span>&#163;</span><form:input class="form-control numberWithDecimal" path="bpEspRevalued" readonly="true" />
					</span>
				</fieldset>

				<fieldset class="form-group">
					<span class="hiddenSpan">
						<legend class="visuallyhidden">Payable Amount at Customer's Date of Entitlement</legend>
						<label class="form-label-bold">Payable Amount at Customer's Date of Entitlement</label>
						<label class="form-label">Protected Payment (Inh)</label>
						<span>&#163;</span><form:input class="form-control" path="protectedPaymentInh" />
						<label class="form-label">SP Top UP / ESP (Inh)</label>
						<span>&#163;</span><form:input class="form-control" path="spTopupInh" />
						<label class="form-label">AP (Inh)</label>
						<span>&#163;</span><form:input class="form-control" path="apInh" />
						<label class="form-label">GRB (Inh)</label>
						<span>&#163;</span><form:input class="form-control" path="grbInh" />
						<label class="form-label">AP ESP (Inh)</label>
						<span>&#163;</span><form:input class="form-control" path="apEspInh" />
						<label class="form-label">GRB ESP (Inh)</label>
						<span>&#163;</span><form:input class="form-control" path="grbEspInh" />
						<label class="form-label">BP ESP (Inh)</label>
						<span>&#163;</span><form:input class="form-control" path="bpEspInh" />
					</span>
				</fieldset>
				
				<div class="hiddenDiv" style="display: none;">NO COMPONENTS INHERITABLE</div>

				<input type="submit" id="inheritedNextBtn" name="inheritedNextBtn" class="button" alt="Continue" value="Continue" />
			</div>
		</form:form>
	</div>
</main>

<c:import url="includes/footer.jsp"></c:import>