function navigateFromHome(button) {
	if (button.id === "newCalcBtn") {
		document.forms[1].action = "customer_details";
	}/*
		 * else if (button.id === "retrieveCalcBtn") { document.forms[1].action =
		 * "customer_details"; }
		 */
	document.forms[1].submit();
}

function navigateFromCustomerDetails() {
	var maritalStatusDropDown = document
			.getElementById("customerMaritalStatus");
	var maritalStatus = maritalStatusDropDown.options[maritalStatusDropDown.selectedIndex].value;
	if (maritalStatus === "Married") {
		document.forms[1].action = "partner_details";
	} else {
		document.forms[1].action = "select_calculation_customer";
	}
	document.forms[1].submit();
}

function selectCalculation(button) {
	if (button.id === "espCalcBtn") {
		document.forms[1].action = "esp_calculation";
	} else if (button.id === "rreCalcBtn") {
		document.forms[1].action = "rre_calculation";
	} else if (button.id === "inheritedCalcBtn") {
		document.forms[1].action = "inherited_calculation";
	} else if (button.id === "nspCalcBtn") {
		document.forms[1].action = "nsp_calculation";
	} else if (button.id === "proRataEuCalcBtn") {
		document.forms[1].action = "prorata_eu_calculation_pre75";
	} else if (button.id === "proRataRaCalcBtn") {
		document.forms[1].action = "prorata_ra_calculation_pre75";
	} else if (button.id === "proRataUsaCalcBtn") {
		document.forms[1].action = "prorata_usa_calculation_pre75";
	}
	document.forms[1].submit();
}

function goBack(button) {
	if (button.id === "proRataEuPost75BackBtn") {
		window.location.href = "prorata_eu_calculation_pre75";
	} else if (button.id === "proRataEuPost16BackBtn") {
		window.location.href = "prorata_eu_calculation_post75";
	} else if (button.id === "proRataRaPost75BackBtn") {
		window.location.href = "prorata_ra_calculation_pre75";
	} else if (button.id === "proRataRaPost16BackBtn") {
		window.location.href = "prorata_ra_calculation_post75";
	} else if (button.id === "proRataUsaPost75BackBtn") {
		window.location.href = "prorata_usa_calculation_pre75";
	} else if (button.id === "proRataUsaPost16BackBtn") {
		window.location.href = "prorata_usa_calculation_post75";
	}
}

function generatePdf() {
	document.forms[1].action = "generatePdf";
	document.forms[1].method = "get";
	document.forms[1].submit();
}

function logout() {
	document.forms[0].action = "../logout";
	document.forms[0].submit();
}