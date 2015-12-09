<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<div class="header-proposition">
	<div class="content">
		<a href="#proposition-links" class="js-header-toggle menu">Menu</a>
		<nav id="proposition-menu">
			<c:set var="authenticatedUser" value="${sessionScope.user.user}"
				scope="session" />
			<a href="<c:url value="/admin/home" />" id="proposition-name">IG Calculator</a>
			<c:if test="${authenticatedUser != null}">
				<form:form method="post" name="userForm">
					<%-- <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> --%>
					<ul id="proposition-links">
						<li><label style="color: white; font-weight: bold;">Welcome
								<c:out value="${authenticatedUser.firstName}" /> <c:out
									value="${authenticatedUser.lastName}"></c:out>
						</label></li>
						<c:if test="${sessionScope.customerDetails != null}">
							<li><a href="<c:url value="customer_details" />">Customer Details</a></li>
						</c:if>
						<c:if test="${sessionScope.partnerDetails != null}">
							<li><a href="<c:url value="partner_details" />">Partner Details</a></li>
						</c:if>
						<c:if test="${sessionScope.customerDetails != null}">
							<li><a href="<c:url value="select_calculation" />">Select Calculation</a></li>
						</c:if>
						<li><a href="javascript:void(0);" onclick="return logout();">Logout</a></li>
					</ul>
				</form:form>
			</c:if>
		</nav>
	</div>
</div>
