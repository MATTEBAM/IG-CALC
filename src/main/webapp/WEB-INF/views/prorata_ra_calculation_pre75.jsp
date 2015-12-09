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
	
	<h1 class="heading-xlarge">nSP Pro Rata Calculation RA Countries</h1>

	<div class="grid-row">
		<form:form action="prorata_ra_calculation_post75" method="post" modelAttribute="pre75RaDetails">

			<label class="form-label-bold with-space">Record of insurance from <form:input id="fromPre75" path="fromPre75" class="datepicker" size="12" /> to <input size="12" id="toPre75" name="toPre75" value="06/04/1975" readonly="readonly" /></label>
			<table class="tableWithBorder" id="proRataTablePre75">
				<c:forEach items="${pre75RaDetails.listOfInsuranceRecords}" var="pre75InsuranceRecord" varStatus="x" begin="0">
					<tbody>
						<tr>
							<th colspan="3">Country</th>
						</tr>
						<tr>
							<td colspan="3">
								<form:select class="form-control fillSpace" path="listOfInsuranceRecords[${x.index}].countryProRata">
									<form:options items="${countriesWithoutFrozenRate}"/>
								</form:select>
							</td>
						</tr>
						<tr>
							<th>From</th>
							<th>To</th>
							<th>No. of Weeks</th>
						</tr>
						<tr>
							<td><form:input class="form-control datepickershortyear fillSpace" path="listOfInsuranceRecords[${x.index}].fromProRata" title="This should be in the format dd/mm/yy" /></td>
							<td><form:input class="form-control datepickershortyear fillSpace" path="listOfInsuranceRecords[${x.index}].toProRata" title="This should be in the format dd/mm/yy" /></td>
							<td><form:input class="form-control fillSpace number" path="listOfInsuranceRecords[${x.index}].noOfWeeks" /></td>
							<td>
								<c:choose>
									<c:when test="${x.index == 0}">
										<a href="javascript:void(0);" class="addProRataPre75"><c:out value="Add" /></a>
									</c:when>
									<c:otherwise>
										<a href="javascript:void(0);" class="removeProRataPre75"><c:out value = "Remove" /></a>
									</c:otherwise>
								</c:choose>
							</td>
						</tr>
					</tbody>
				</c:forEach>
				<c:if test="${pre75RaDetails.listOfInsuranceRecords.size() == 0}">
					<tbody>
						<tr>
							<th colspan="3">Country</th>
						</tr>
						<tr>
							<td colspan="3">
								<form:select class="form-control fillSpace" path="listOfInsuranceRecords[0].countryProRata">
									<form:options items="${countriesWithoutFrozenRate}"/>
								</form:select>
							</td>
						</tr>
						<tr>
							<th>From</th>
							<th>To</th>
							<th>No. of Weeks</th>
						</tr>
						<tr>
							<td><form:input class="form-control datepickershortyear fillSpace" path="listOfInsuranceRecords[0].fromProRata" title="This should be in the format dd/mm/yy" /></td>
							<td><form:input class="form-control datepickershortyear fillSpace" path="listOfInsuranceRecords[0].toProRata" title="This should be in the format dd/mm/yy" /></td>
							<td><form:input class="form-control fillSpace number" path="listOfInsuranceRecords[0].noOfWeeks" /></td>
							<td><a href="javascript:void(0);" class="addProRataPre75"><c:out value="Add" /></a></td>
						</tr>
					</tbody>
				</c:if>
			</table>

			<fieldset class="form-group">
				<legend class="visuallyhidden">Total</legend>
				<label class="form-label">Total</label>
				<form:input class="form-control" path="total" readonly="true" />
			</fieldset>

			<fieldset class="form-group">
				<legend class="visuallyhidden">No of Reckonable Years</legend>
				<label class="form-label">No of Reckonable Years</label>
				<form:input class="form-control" path="noOfReckonableYears" readonly="true" />
			</fieldset>

			<div class="form-group">
				<input type="submit" name="proRataRaPre75SubmitBtn" class="button" alt="Continue" value="Continue" />
			</div>

		</form:form>
	</div>

</main>

<c:import url="includes/footer.jsp"></c:import>