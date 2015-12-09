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
	
	<h1 class="heading-xlarge">nSP Pro Rata Calculation USA Only</h1>

	<div class="grid-row">
		<form:form action="prorata_usa_calculation_post16" method="post" modelAttribute="post75UsaDetails">

			<label class="form-label-bold with-space">Record of insurance from <form:input path="fromPost75" class="datepicker" size="12" readonly="true" /> to <form:input path="toPost75" size="12" readonly="true" /></label>
			<div style="overflow: auto;" class="form-group">
				<table class="tableWithBorder" id="proRataUsaTablePost75">
					<c:forEach items="${post75UsaDetails.listOfInsuranceRecords}" var="post75InsuranceRecord" varStatus="x" begin="0">
						<tbody>
							<tr>
								<th>Country (a)</th>
								<th>From (b)</th>
								<th>To (c)</th>
								<th>Total No. of Weeks (d)</th>
							</tr>
							<tr>
								<td>
									<form:select class="form-control fillSpace" path="listOfInsuranceRecords[${x.index}].countryProRata">
										<form:options items="${countriesUsa}"/>
									</form:select>
								</td>
								<td><form:input class="form-control datepickershortyear fillSpace" path="listOfInsuranceRecords[${x.index}].fromProRata" title="This should be in the format dd/mm/yy" /></td>
								<td><form:input class="form-control datepickershortyear fillSpace" path="listOfInsuranceRecords[${x.index}].toProRata" title="This should be in the format dd/mm/yy" /></td>
								<td><form:input class="form-control fillSpace number" path="listOfInsuranceRecords[${x.index}].totalNoOfWeeks" /></td>
							</tr>
							<tr>
								<th>US QC in tax year (e)</th>
								<th>Calculation 1 Total (f) = (e) X (13)</th>
								<th></th>
							</tr>
							<tr>
								<td><form:input class="form-control fillSpace usQcInTaxYear number" path="listOfInsuranceRecords[${x.index}].usQcInTaxYear" /></td>
								<td><form:input class="form-control fillSpace calc1 number" path="listOfInsuranceRecords[${x.index}].calc1" /></td>
								<td></td>
							</tr>
							<tr>
								<th>Appropriate lower earnings level (g)</th>
								<th>Calculation 2 Total (h) = (f) X (g)</th>
								<th></th>
							</tr>
							<tr>
								<td><span>&#163;</span><form:input class="form-control fillSpace appropriateLowerEarnings numberWithDecimal" path="listOfInsuranceRecords[${x.index}].appropriateLowerEarnings" /></td>
								<td><span>&#163;</span><form:input class="form-control fillSpace calc2" path="listOfInsuranceRecords[${x.index}].calc2" readonly="true" /></td>
								<td></td>
							</tr>
							<tr>
								<th>UK earnings factor (i)</th>
								<th>Calculation 3 Total (j) = (h) & (i)</th>
								<th></th>
							</tr>
							<tr>
								<td><span>&#163;</span><form:input class="form-control fillSpace ukEarningsFactor numberWithDecimal" path="listOfInsuranceRecords[${x.index}].ukEarningsFactor" /></td>
								<td><span>&#163;</span><form:input class="form-control fillSpace calc3" path="listOfInsuranceRecords[${x.index}].calc3" readonly="true" /></td>
								<td></td>
							</tr>
							<tr>
								<th>Amount required for qualifying year (k)</th>
								<th>Qualifying years (l) = where (j) equals or exceeds (k)</th>
								<th>Rounded UK Weeks Total (m) = (i) / (g)</th>
							</tr>
							<tr>
								<td><span>&#163;</span><form:input class="form-control fillSpace amountReqForQualYear numberWithDecimal" path="listOfInsuranceRecords[${x.index}].amountReqForQualYear" /></td>
								<td><form:input class="form-control fillSpace" path="listOfInsuranceRecords[${x.index}].qualYears" readonly="true" /></td>
								<td><form:input class="form-control fillSpace roundedUkWeeksTotal" path="listOfInsuranceRecords[${x.index}].roundedUkWeeksTotal" readonly="true" /></td>
							</tr>
							<tr>
								<th>Qualifying UK Weeks (n)</th>
								<th>Qualifying Foreign Weeks (o)</th>
								<th></th>
							</tr>
							<tr>
								<td><form:input class="form-control fillSpace qualUkWeeks number" path="listOfInsuranceRecords[${x.index}].qualUkWeeks" /></td>
								<td><form:input class="form-control fillSpace qualForeignWeeks number" path="listOfInsuranceRecords[${x.index}].qualForeignWeeks" /></td>
								<td>
									<c:choose>
										<c:when test="${x.index == 0}">
											<a href="javascript:void(0);" class="addProRataUsaPost75"><c:out value="Add" /></a>
										</c:when>
										<c:otherwise>
											<a href="javascript:void(0);" class="removeProRataUsaPost75"><c:out value="Remove" /></a>
										</c:otherwise>
									</c:choose>								
								</td>
							</tr>
						</tbody>
					</c:forEach>
					<c:if test="${post75UsaDetails.listOfInsuranceRecords.size() == 0}">
						<tbody>
							<tr>
								<th>Country (a)</th>
								<th>From (b)</th>
								<th>To (c)</th>
								<th>Total No. of Weeks (d)</th>
							</tr>
							<tr>
								<td>
									<form:select class="form-control fillSpace" path="listOfInsuranceRecords[0].countryProRata">
										<form:options items="${countriesUsa}"/>
									</form:select>
								</td>
								<td><form:input class="form-control datepickershortyear fillSpace" path="listOfInsuranceRecords[0].fromProRata" title="This should be in the format dd/mm/yy" /></td>
								<td><form:input class="form-control datepickershortyear fillSpace" path="listOfInsuranceRecords[0].toProRata" title="This should be in the format dd/mm/yy" /></td>
								<td><form:input class="form-control fillSpace number" path="listOfInsuranceRecords[0].totalNoOfWeeks" /></td>
							</tr>
							<tr>
								<th>US QC in tax year (e)</th>
								<th>Calculation 1 Total (f) = (e) X (13)</th>
								<th></th>
							</tr>
							<tr>
								<td><form:input class="form-control fillSpace usQcInTaxYear number" path="listOfInsuranceRecords[0].usQcInTaxYear" /></td>
								<td><form:input class="form-control fillSpace calc1 number" path="listOfInsuranceRecords[0].calc1" readonly="true" /></td>
								<td></td>
							</tr>
							<tr>
								<th>Appropriate lower earnings level (g)</th>
								<th>Calculation 2 Total (h) = (f) X (g)</th>
								<th></th>
							</tr>
							<tr>
								<td><span>&#163;</span><form:input class="form-control fillSpace appropriateLowerEarnings numberWithDecimal" path="listOfInsuranceRecords[0].appropriateLowerEarnings" /></td>
								<td><span>&#163;</span><form:input class="form-control fillSpace calc2" path="listOfInsuranceRecords[0].calc2" readonly="true" /></td>
								<td></td>
							</tr>
							<tr>
								<th>UK earnings factor (i)</th>
								<th>Calculation 3 Total (j) = (h) & (i)</th>
								<th></th>
							</tr>
							<tr>
								<td><span>&#163;</span><form:input class="form-control fillSpace ukEarningsFactor numberWithDecimal" path="listOfInsuranceRecords[0].ukEarningsFactor" /></td>
								<td><span>&#163;</span><form:input class="form-control fillSpace calc3" path="listOfInsuranceRecords[0].calc3" readonly="true" /></td>
								<td></td>
							</tr>
							<tr>
								<th>Amount required for qualifying year (k)</th>
								<th>Qualifying years (l) = where (j) equals or exceeds (k)</th>
								<th>Rounded UK Weeks Total (m) = (i) / (g)</th>
							</tr>
							<tr>
								<td><span>&#163;</span><form:input class="form-control fillSpace amountReqForQualYear numberWithDecimal" path="listOfInsuranceRecords[0].amountReqForQualYear" /></td>
								<td><form:input class="form-control fillSpace" path="listOfInsuranceRecords[0].qualYears" readonly="true" /></td>
								<td><form:input class="form-control fillSpace roundedUkWeeksTotal" path="listOfInsuranceRecords[0].roundedUkWeeksTotal" readonly="true" /></td>
							</tr>
							<tr>
								<th>Qualifying UK Weeks (n)</th>
								<th>Qualifying Foreign Weeks (o)</th>
								<th></th>
							</tr>
							<tr>
								<td><form:input class="form-control fillSpace qualUkWeeks number" path="listOfInsuranceRecords[0].qualUkWeeks" /></td>
								<td><form:input class="form-control fillSpace qualForeignWeeks number" path="listOfInsuranceRecords[0].qualForeignWeeks" /></td>
								<td><a href="javascript:void(0);" class="addProRataUsaPost75"><c:out value="Add" /></a></td>
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

			<input type="button" id="proRataUsaPost75BackBtn" name="proRataUsaPost75BackBtn" class="button" alt="Back" value="Back" onclick="return goBack(this);" />
			<input type="submit" name="proRataUsaPost75SubmitBtn" class="button" alt="Continue" value="Continue" />

		</form:form>
	</div>

</main>

<c:import url="includes/footer.jsp"></c:import>