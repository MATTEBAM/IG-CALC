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
		<form:form action="select_calculation_prorata_ra" method="post" modelAttribute="post16RaDetails">

			<label class="form-label-bold with-space">Record of insurance from <form:input path="fromPost75" size="12" readonly="true" /> to <form:input path="toPost75" class="datepicker" size="12" title="This should be in the format dd/mm/yyyy" /></label>
			<div style="overflow: auto;" class="form-group">
				<table class="tableWithBorder" id="proRataEuraTablePost75">
					<c:forEach items="${post16RaDetails.listOfInsuranceRecords}" var="post75InsuranceRecord" varStatus="x" begin="0">
						<tbody>
							<tr>
								<th colspan="3">Country (a)</th>
							</tr>
							<tr>
								<td colspan="3">
									<form:select class="form-control fillSpace" path="listOfInsuranceRecords[${x.index}].countryProRata">
										<form:options items="${countriesWithoutFrozenRate}"/>
									</form:select>
								</td>
							</tr>
							<tr>
								<th>From (b)</th>
								<th>To (c)</th>
								<th>Total No. of Weeks (d)</th>
							</tr>
							<tr>
								<td><form:input class="form-control datepickershortyear fillSpace" path="listOfInsuranceRecords[${x.index}].fromProRata" title="This should be in the format dd/mm/yy" /></td>
								<td><form:input class="form-control datepickershortyear fillSpace" path="listOfInsuranceRecords[${x.index}].toProRata" title="This should be in the format dd/mm/yy" /></td>
								<td><form:input class="form-control fillSpace number" path="listOfInsuranceRecords[${x.index}].totalNoOfWeeks" /></td>
							</tr>
							<tr>
								<th>No. of foreign employed persons conts (e)</th>
								<th>2/3 Upper earnings level (f)</th>
								<th>Calculation 1 Total (g) = (e) X (f)</th>
							</tr>
							<tr>
								<td><form:input class="form-control fillSpace noOfForeignEmployed number" path="listOfInsuranceRecords[${x.index}].noOfForeignEmployed" /></td>
								<td><span>&#163;</span><form:input class="form-control fillSpace twoThirdUpper numberWithDecimal" path="listOfInsuranceRecords[${x.index}].twoThirdUpper" /></td>
								<td><span>&#163;</span><form:input class="form-control fillSpace calc1" path="listOfInsuranceRecords[${x.index}].calc1" readonly="true" /></td>
							</tr>
							<tr>
								<th>No. of other foreign conts and/or No. of credits (h)</th>
								<th>Appropriate lower earnings level (i)</th>
								<th>Calculation 2 Total (j) = (h) X (i)</th>
							</tr>
							<tr>
								<td><form:input class="form-control fillSpace noOfOtherForeign number" path="listOfInsuranceRecords[${x.index}].noOfOtherForeign" /></td>
								<td><span>&#163;</span><form:input class="form-control fillSpace appropriateLowerEarnings numberWithDecimal" path="listOfInsuranceRecords[${x.index}].appropriateLowerEarnings" /></td>
								<td><span>&#163;</span><form:input class="form-control fillSpace calc2" path="listOfInsuranceRecords[${x.index}].calc2" readonly="true" /></td>
							</tr>
							<tr>
								<th>UK earnings factor (k)</th>
								<th>Calculation 3 (l) = Total (g) & (j) & (k)</th>
								<th></th>
							</tr>
							<tr>
								<td><span>&#163;</span><form:input class="form-control fillSpace ukEarningsFactor numberWithDecimal" path="listOfInsuranceRecords[${x.index}].ukEarningsFactor" /></td>
								<td><span>&#163;</span><form:input class="form-control fillSpace calc3" path="listOfInsuranceRecords[${x.index}].calc3" readonly="true" /></td>
								<td></td>
							</tr>
							<tr>
								<th>Amount required for qualifying year (m)</th>
								<th>Qualifying years (n) = where (l) equals or exceeds (m)</th>
								<th></th>
							</tr>
							<tr>
								<td><span>&#163;</span><form:input class="form-control fillSpace amountReqForQualYear numberWithDecimal" path="listOfInsuranceRecords[${x.index}].amountReqForQualYear" /></td>
								<td><form:input class="form-control fillSpace" path="listOfInsuranceRecords[${x.index}].qualYears" readonly="true" /></td>
								<td></td>
							</tr>
							<tr>
								<th>Qualifying UK Weeks (o)</th>
								<th>Qualifying Foreign Weeks (p)</th>
								<th></th>
							</tr>
							<tr>
								<td><form:input class="form-control fillSpace qualUkWeeks number" path="listOfInsuranceRecords[${x.index}].qualUkWeeks" /></td>
								<td><form:input class="form-control fillSpace qualForeignWeeks number" path="listOfInsuranceRecords[${x.index}].qualForeignWeeks" /></td>
								<td>
									<c:choose>
										<c:when test="${x.index == 0}">
											<a href="javascript:void(0);" class="addProRataEuraPost75"><c:out value="Add" /></a>
										</c:when>
										<c:otherwise>
											<a href="javascript:void(0);" class="removeProRataEuraPost75"><c:out value="Remove" /></a>
										</c:otherwise>
									</c:choose>								
								</td>
							</tr>
						</tbody>
					</c:forEach>
					<c:if test="${post16RaDetails.listOfInsuranceRecords.size() == 0}">
						<tbody>
							<tr>
								<th colspan="3">Country (a)</th>
							</tr>
							<tr>
								<td colspan="3">
									<form:select class="form-control fillSpace" path="listOfInsuranceRecords[0].countryProRata">
										<form:options items="${countriesWithoutFrozenRate}"/>
									</form:select>
								</td>
							</tr>
							<tr>
								<th>From (b)</th>
								<th>To (c)</th>
								<th>Total No. of Weeks (d)</th>
							</tr>
							<tr>
								<td><form:input class="form-control datepickershortyear fillSpace" path="listOfInsuranceRecords[0].fromProRata" title="This should be in the format dd/mm/yy" /></td>
								<td><form:input class="form-control datepickershortyear fillSpace" path="listOfInsuranceRecords[0].toProRata" title="This should be in the format dd/mm/yy" /></td>
								<td><form:input class="form-control fillSpace number" path="listOfInsuranceRecords[0].totalNoOfWeeks" /></td>
							</tr>
							<tr>
								<th>No. of foreign employed persons conts (e)</th>
								<th>2/3 Upper earnings level (f)</th>
								<th>Calculation 1 Total (g) = (e) X (f)</th>
							</tr>
							<tr>
								<td><form:input class="form-control fillSpace noOfForeignEmployed number" path="listOfInsuranceRecords[0].noOfForeignEmployed" /></td>
								<td><span>&#163;</span><form:input class="form-control fillSpace twoThirdUpper numberWithDecimal" path="listOfInsuranceRecords[0].twoThirdUpper" /></td>
								<td><span>&#163;</span><form:input class="form-control fillSpace calc1" path="listOfInsuranceRecords[0].calc1" readonly="true" /></td>
							</tr>
							<tr>
								<th>No. of other foreign conts and/or No. of credits (h)</th>
								<th>Appropriate lower earnings level (i)</th>
								<th>Calculation 2 Total (j) = (h) X (i)</th>
							</tr>
							<tr>
								<td><form:input class="form-control fillSpace noOfOtherForeign number" path="listOfInsuranceRecords[0].noOfOtherForeign" /></td>
								<td><span>&#163;</span><form:input class="form-control fillSpace appropriateLowerEarnings numberWithDecimal" path="listOfInsuranceRecords[0].appropriateLowerEarnings" /></td>
								<td><span>&#163;</span><form:input class="form-control fillSpace calc2" path="listOfInsuranceRecords[0].calc2" readonly="true" /></td>
							</tr>
							<tr>
								<th>UK earnings factor (k)</th>
								<th>Calculation 3 (l) = Total (g) & (j) & (k)</th>
								<th></th>
							</tr>
							<tr>
								<td><span>&#163;</span><form:input class="form-control fillSpace ukEarningsFactor numberWithDecimal" path="listOfInsuranceRecords[0].ukEarningsFactor" /></td>
								<td><span>&#163;</span><form:input class="form-control fillSpace calc3" path="listOfInsuranceRecords[0].calc3" readonly="true" /></td>
								<td></td>
							</tr>
							<tr>
								<th>Amount required for qualifying year (m)</th>
								<th>Qualifying years (n) = where (l) equals or exceeds (m)</th>
								<th></th>
							</tr>
							<tr>
								<td><span>&#163;</span><form:input class="form-control fillSpace amountReqForQualYear numberWithDecimal" path="listOfInsuranceRecords[0].amountReqForQualYear" /></td>
								<td><form:input class="form-control fillSpace" path="listOfInsuranceRecords[0].qualYears" readonly="true" /></td>
								<td></td>
							</tr>
							<tr>
								<th>Qualifying UK Weeks (o)</th>
								<th>Qualifying Foreign Weeks (p)</th>
								<th></th>
							</tr>
							<tr>
								<td><form:input class="form-control fillSpace qualUkWeeks number" path="listOfInsuranceRecords[0].qualUkWeeks" /></td>
								<td><form:input class="form-control fillSpace qualForeignWeeks number" path="listOfInsuranceRecords[0].qualForeignWeeks" /></td>
								<td><a href="javascript:void(0);" class="addProRataEuraPost75"><c:out value="Add" /></a></td>
							</tr>
						</tbody>
					</c:if>
				</table>
				
				<fieldset class="form-group">
					<legend class="visuallyhidden">Total No. of Qualifying UK Weeks</legend>
					<label class="form-label">Total No. of Qualifying UK Weeks</label>
					<form:input class="form-control" path="totalQualWeeksUk" readonly="true" />
				</fieldset>
	
				<fieldset class="form-group">
					<legend class="visuallyhidden">Total No. of Qualifying Foreign Weeks</legend>
					<label class="form-label">Total No. of Qualifying Foreign Weeks</label>
					<form:input class="form-control" path="totalQualWeeksForeign" readonly="true" />
				</fieldset>
				
			</div>

			<input type="button" id="proRataRaPost16BackBtn" name="proRataRaPost16BackBtn" class="button" alt="Back" value="Back" onclick="return goBack(this);" />
			<input type="submit" name="proRataRaPost16SubmitBtn" class="button" alt="Continue" value="Continue" />

		</form:form>
	</div>

</main>

<c:import url="includes/footer.jsp"></c:import>