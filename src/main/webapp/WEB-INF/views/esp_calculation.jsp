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
	
	<h1 class="heading-xlarge">nSP ESP Calculation</h1>

	<div class="grid-row">
		<form:form action="select_calculation_esp" method="post" modelAttribute="espDetails">
			
			<table class="tableWithBorder" id="espTable">
				<tbody>
					<c:forEach items="${espDetails.listOfEspRecords}" var="pre75InsuranceRecord" varStatus="x" begin="0">
						<tbody>
							<tr>
								<th>Country of Residence</th>
								<th>Temporary or Permanent?</th>
								<th>NSP ESP Uprating Payable</th>
							</tr>
							<tr>
								<td>
									<form:select class="form-control fillSpace" path="listOfEspRecords[${x.index}].countryOfResidence">
										<form:options items="${countries}"/>
									</form:select>
								</td>
								<td>
									<form:select class="form-control fillSpace" path="listOfEspRecords[${x.index}].status">
										<form:option value="Permanent">Permanent</form:option>
										<form:option value="Temporary">Temporary</form:option>
									</form:select>
								</td>
								<td>
									<form:select class="form-control fillSpace" path="listOfEspRecords[${x.index}].upratingPayable">
										<form:option value="Yes">Yes</form:option>
										<form:option value="No">No</form:option>
									</form:select>
								</td>
							</tr>
							<tr>
								<th>Start Date</th>
								<th>End Date</th>
								<th>Uprating Year</th>
							</tr>
							<tr>
								<td><form:input class="form-control datepicker fillSpace" path="listOfEspRecords[${x.index}].startDate" title="This should be in the format dd/mm/yyyy" /></td>
								<td><form:input class="form-control datepicker fillSpace" path="listOfEspRecords[${x.index}].endDate" title="This should be in the format dd/mm/yyyy" /></td>
								<td><form:input class="form-control fillSpace" path="listOfEspRecords[${x.index}].upratingYear" title="This should be in the format yy/yy" /></td>
							</tr>
							<tr>
								<th>Combined NSP & PP Amount</th>
								<th>NSP ESP Amount</th>
								<th></th>
							</tr>
							<tr>
								<td><span>&#163;</span><form:input class="form-control fillSpace numberWithDecimal" path="listOfEspRecords[${x.index}].combinedAmount" /></td>
								<td>
									<span>&#163;</span>
									<form:input class="form-control fillSpace numberWithDecimal" path="listOfEspRecords[${x.index}].nspEspAmount" />
									<form:errors class="field-error" path="listOfEspRecords[${x.index}].nspEspAmount" />
								</td>
								<td>
									<c:choose>
										<c:when test="${x.index == 0}">
											<a href="javascript:void(0);" class="addEsp"><c:out value="Add" /></a>
										</c:when>
										<c:otherwise>
											<a href="javascript:void(0);" class="removeEsp"><c:out value = "Remove" /></a>
										</c:otherwise>
									</c:choose>
								</td>
							</tr>
						</tbody>
					</c:forEach>
					<c:if test="${espDetails.listOfEspRecords.size() == 0}">
						<tbody>
							<tr>
								<th>Country of Residence</th>
								<th>Temporary or Permanent?</th>
								<th>NSP ESP Uprating Payable</th>
							</tr>
							<tr>
								<td>
									<form:select class="form-control fillSpace" path="listOfEspRecords[0].countryOfResidence">
										<form:options items="${countries}"/>
									</form:select>
								</td>
								<td>
									<form:select class="form-control fillSpace" path="listOfEspRecords[0].status">
										<form:option value="Permanent">Permanent</form:option>
										<form:option value="Temporary">Temporary</form:option>
									</form:select>
								</td>
								<td>
									<form:select class="form-control fillSpace" path="listOfEspRecords[0].upratingPayable">
										<form:option value="Yes">Yes</form:option>
										<form:option value="No">No</form:option>
									</form:select>
								</td>
							</tr>
							<tr>
								<th>Start Date</th>
								<th>End Date</th>
								<th>Uprating Year</th>
							</tr>
							<tr>
								<td><form:input class="form-control datepicker fillSpace" path="listOfEspRecords[0].startDate" title="This should be in the format dd/mm/yyyy" /></td>
								<td><form:input class="form-control datepicker fillSpace" path="listOfEspRecords[0].endDate" title="This should be in the format dd/mm/yyyy" /></td>
								<td><form:input class="form-control fillSpace" path="listOfEspRecords[0].upratingYear" title="This should be in the format yy/yy" /></td>
							</tr>
							<tr>
								<th>Combined NSP & PP Amount</th>
								<th>NSP ESP Amount</th>
								<th></th>
							</tr>
							<tr>
								<td><span>&#163;</span><form:input class="form-control fillSpace numberWithDecimal" path="listOfEspRecords[0].combinedAmount" /></td>
								<td>
									<span>&#163;</span>
									<form:input class="form-control fillSpace numberWithDecimal" path="listOfEspRecords[0].nspEspAmount" />
									<form:errors class="field-error" path="listOfEspRecords[0].nspEspAmount" />
								</td>
								<td><a href="javascript:void(0);" class="addEsp"><c:out value="Add" /></a></td>
							</tr>
						</tbody>
					</c:if>
				</tbody>
			</table>

			<fieldset class="form-group">
				<legend class="visuallyhidden">Total New State Pension ESP</legend>
				<span>&#163;</span><label class="form-label">Total New State Pension ESP</label>
				<form:input class="form-control numberWithDecimal" path="totalNspEspAmount" readonly="true" />
			</fieldset>

			<div class="form-group">
				<input type="submit" name="espSubmitBtn" class="button" alt="Continue" value="Continue" />
			</div>

		</form:form>
	</div>

</main>

<c:import url="includes/footer.jsp"></c:import>