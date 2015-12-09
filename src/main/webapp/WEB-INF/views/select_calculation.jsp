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
	
	<h1 class="heading-xlarge">Select Calculation</h1>

	<form:form action="partner_details" method="get">
		<div>
			<input type="button" id="nspCalcBtn" name="nspCalcBtn" class="button-custom-1-2" alt="nSP" value="nSP" onclick="return selectCalculation(this);" />
			<%-- <label class="block-label" for="nSPAccessed">
		    	<input id="nSPAccessed" name="nSPAccessed" type="checkbox" readonly="readonly" <c:if test="${sessionScope.nspDetails != null}">checked="checked"</c:if> />
		 	</label> --%>
		</div>
		<div>
			<input type="button" id="espCalcBtn" name="espCalcBtn" class="button-custom-1-2" alt="ESP" value="ESP" onclick="return selectCalculation(this);" />
		</div>
		<div>
			<input type="button" id="rreCalcBtn" name="rreCalcBtn" class="button-custom-1-2" alt="RRE" value="RRE" onclick="return selectCalculation(this);" />
		</div>
		<div>
			<input type="button" id="inheritedCalcBtn" name="inheritedCalcBtn" class="button-custom-1-2" alt="Inherited" value="Inherited" onclick="return selectCalculation(this);" />
		</div>
		<div>
			<input type="button" id="proRataEuCalcBtn" name="proRataEuCalcBtn" class="button-custom-1-2" alt="Pro Rata EU" value="Pro Rata EU" onclick="return selectCalculation(this);" />
		</div>
		<div>
			<input type="button" id="proRataRaCalcBtn" name="proRataRaCalcBtn" class="button-custom-1-2" alt="Pro Rata RA" value="Pro Rata RA" onclick="return selectCalculation(this);" />
		</div>
		<div>
			<input type="button" id="proRataUsaCalcBtn" name="proRataUsaCalcBtn" class="button-custom-1-2" alt="Pro Rata USA Only" value="Pro Rata USA Only" onclick="return selectCalculation(this);" />
		</div>
	</form:form>
	
</main>

<c:import url="includes/footer.jsp"></c:import>