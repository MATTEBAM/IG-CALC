var countriesWithoutFrozenRate = ["", "MIXED YEAR", "ABROAD - NOT KNOWN", "ALDERNEY", "ALGERIA", "AMERICAN SAMOA", "ANDORRA", "ANGOLA", "ANGUILLA", "ANTARCTIC TERRITORIES (BRITISH)", "ANTIGUA", "ANTILLES (NETHERLANDS)", "ARAB EMIRATES (UNITED)", "ARUBA", "AUSTRIA", "BARBADOS", "BELGIUM", "BERMUDA", "BISSAU (GUINEA)", "BOUVET ISLAND", "BRITISH INDIAN OCEAN TERRITORIES", "BULGARIA", "BURUNDI", "CHAD", "COMORO ISLANDS", "COTE D’IVOIRE", "CYPRUS", "DENMARK", "DOMINICAN REPUBLIC", "EAST TIMOR", "ENGLAND", "EQUATORIAL GUINEA", "ERITREA", "FINLAND", "FORMER YUG REP OF MACEDONIA", "FRANCE", "FRENCH GUIANA", "FRENCH OVERSEAS DEPARTMENTS", "FRENCH POLYNESIA", "FRENCH SOUTHERN TERRITORIES", "GABON", "GERMANY", "GHANA", "GIBRALTAR", "GREAT BRITAIN", "GREECE", "GUADELOUPE", "GUAM", "GUERNSEY", "HEARD ISLAND & MCDONALD ISLANDS", "HUNGARY", "ICELAND", "IRELAND", "ISLE OF MAN", "ISRAEL", "ITALY", "JAMAICA", "JERSEY", "LIECHTENSTEIN", "LUXEMBOURG", "MALAGASY REPUBLIC", "MALI", "MALTA", "MARSHALL ISLANDS", "MARTINIQUE", "MAURITANIA", "MAURITIUS", "MAYOTTE", "MICRONESIA, FEDERATED STATES OF", "MONGOLIA", "MYANMAR", "NAURU", "NETHERLANDS", "NORTH KOREA", "NORTHERN IRELAND", "NORTHERN MARIANA ISLANDS", "NORWAY", "NUIE", "PHILIPPINES", "PITCAIRN", "POLAND", "PORTUGAL", "PRINCIPE & SAO TOME", "PUERTO RICO", "REPUBLIC OF ARMENIA", "REPUBLIC OF AZERBAIJAN", "REPUBLIC OF BELARUS", "REPUBLIC OF BOSNIA-HERCEGOVINA", "REPUBLIC OF CROATIA", "REPUBLIC OF ESTONIA", "REPUBLIC OF LATVIA", "REPUBLIC OF LITHUANIA", "REPUBLIC OF SLOVENIA", "REPUBLIC OF TAJIKISTAN", "REUNION", "ROMANIA", "SABAH", "SAINT PIERRE & MIQUELON", "SARK", "SCOTLAND", "SOUTH GEORGIA & SOUTH", "SANDWICH ISLANDS", "SPAIN", "STATE UNION OF SERBIA AND MONTENEGRO", "STATELESS", "SVALBARD & JAN MAYEN", "SWEDEN", "SWITZERLAND", "THE CZECH REPUBLIC", "THE RUSSIAN FEDERATION", "THE SLOVAK REPUBLIC", "TOKELAU", "TRISTAN DA CUNHA", "TURKEY", "TUVALU", "UNITED STATES MINOR OUTLYING ISLANDS", "USA", "VATICAN CITY STATE", "VIRGIN ISLANDS (USA)", "WALES", "WALLIS & FUTUNA", "WESTERN SAHARA", "WESTERN SAMOA", "ZAIRE (Rep. of CONGO)"];
var usa = ["", "MIXED YEAR", "UK", "USA"];
var countries = ["", "ABROAD - NOT KNOWN", "AFGHANISTAN", "ALBANIA", "ALDERNEY", "ALGERIA ", "AMERICAN SAMOA ", "ANDORRA ", "ANGOLA ", "ANGUILLA ", "ANTARCTIC TERRITORIES (BRITISH)", "ANTIGUA ", "ANTILLES (NETHERLANDS)", "ARAB EMIRATES (UNITED) ", "ARGENTINA ", "ARUBA  ", "ASCENSION ISLAND ", "AUSTRALIA ", "AUSTRIA ", "BAHAMAS ", "BAHRAIN ", "BANGLADESH ", "BARBADOS ", "BARBUDA ", "BELGIUM", "BELIZE ", "BENIN ", "BERMUDA ", "BHUTAN ", "BISSAU (GUINEA)", "BOLIVIA", "BOTSWANA", "BOUVET ISLAND", "BRAZIL ", "BRITISH INDIAN OCEAN TERRITORIES", "BRUNEI ", "BULGARIA ", "BURKINA FASO ", "BURMA (MYANMAR) ", "BURUNDI ", "CAMEROON ", "CANADA", "CAPE VERDE ISLANDS", "CAYMAN ISLANDS ", "CENTRAL AFRICAN REPUBLIC ", "CHAD ", "CHILE ", "CHINA PEOPLES REPUBLIC ", "COLOMBIA ", "COMORO ISLANDS ", "CONGO ", "COOK ISLANDS ", "COSTA RICA ", "COTE D’IVOIRE ", "CUBA ", "CYPRUS ", "DENMARK ", "DJIBOUTI ", "DOMINICA COMMONWEALTH ", "DOMINICAN REPUBLIC ", "EAST TIMOR ", "ECUADOR ", "EGYPT ", "EL SALVADOR ", "ENGLAND ", "EQUATORIAL GUINEA ", "ERITREA ", "ETHIOPIA ", "FALKLAND ISLANDS & DEPS", "FAROE ISLANDS", "FIJI ", "FINLAND ", "FORMER YUG REP OF MACEDONIA", "FRANCE ", "FRENCH GUIANA ", "FRENCH OVERSEAS DEPARTMENTS", "FRENCH POLYNESIA ", "FRENCH SOUTHERN TERRITORIES", "GABON ", "GAMBIA", "GERMANY ", "GHANA", "GIBRALTAR", "GREAT BRITAIN", "GREECE", "GREENLAND", "GRENADA", "GUADELOUPE", "GUAM ", "GUATEMALA ", "GUERNSEY ", "GUINEA ", "GUYANA ", "HAITI ", "HEARD ISLAND & MCDONALD ISLANDS", "HONDURAS ", "HONG KONG ", "HUNGARY ", "ICELAND", "INDIA", "INDONESIA ", "IRAN", "IRAQ ", "IRELAND ", "ISLE OF MAN", "ISRAEL", "ITALY ", "JAMAICA", "JAPAN ", "JERSEY", "JORDAN ", "KAMPUCHEA ", "KENYA", "KIRIBATI ", "KUWAIT ", "LAOS ", "LEBANON ", "LESOTHO", "LIBERIA", "LIBYA ", "LIECHTENSTEIN ", "LUXEMBOURG", "MACAU ", "MALAGASY REPUBLIC ", "MALAWI ", "MALAYSIA ", "MALDIVE ISLANDS", "MALI ", "MALTA ", "MARSHALL ISLANDS ", "MARTINIQUE", "MAURITANIA ", "MAURITIUS ", "MAYOTTE ", "MEXICO ", "MICRONESIA, FEDERATED STATES OF", "MONACO ", "MONGOLIA", "MONTSERRAT", "MOROCCO ", "MOZAMBIQUE ", "MYANMAR ", "NAMIBIA ", "NAURU ", "NEPAL ", "NETHERLANDS ", "NEVIS, ST KITTS-NEVIS ", "NEW CALEDONIA ", "NEW ZEALAND ", "NICARAGUA ", "NIGER ", "NIGERIA ", "NORFOLK ISLAND ", "NORTH KOREA ", "NORTHERN IRELAND ", "NORTHERN MARIANA ISLANDS ", "NORWAY ", "NUIE ", "OMAN ", "PAKISTAN ", "PALAU ", "PANAMA ", "PAPUA NEW GUINEA ", "PARAGUAY ", "PERU ", "PHILIPPINES ", "PITCAIRN ", "POLAND ", "PORTUGAL ", "PRINCIPE & SAO TOME ", "PUERTO RICO ", "QATAR", "REPUBLIC OF ARMENIA", "REPUBLIC OF AZERBAIJAN ", "REPUBLIC OF BELARUS ", "REPUBLIC OF BOSNIA-HERCEGOVINA", "REPUBLIC OF CROATIA ", "REPUBLIC OF ESTONIA ", "REPUBLIC OF GEORGIA ", "REP. OF KAZAKHSTAN ", "REP. OF KYRGYZSTAN ", "REPUBLIC OF LATVIA ", "REPUBLIC OF LITHUANIA ", "REPUBLIC OF MALDOVIA ", "REPUBLIC OF SLOVENIA ", "REPUBLIC OF TAJIKISTAN ", "REP. OF TURKMENISTAN ", "REP. OF UZBEKISTAN ", "REPUBLIC OF YEMEN ", "REUNION ", "ROMANIA ", "RWANDA ", "SABAH ", "SAINT PIERRE & MIQUELON", "SAN MARINO ", "SARAWAK ", "SARK ", "SAUDI ARABIA ", "SCOTLAND ", "SENEGAL ", "SEYCHELLES ", "SHARJAH", "SIERRA LEONE ", "SINGAPORE ", "SOLOMON ISLANDS ", "SOMALIA ", "SOUTH AFRICA", "SOUTH GEORGIA & SOUTH", "SANDWICH ISLANDS", "SOUTH KOREA ", "SPAIN ", "SRI LANKA ", "ST HELENA & DEPS ", "ST LUCIA ", "ST MARTINS", "ST VINCENT & GRENADINES ", "STATE UNION OF SERBIA AND MONTENEGRO", "STATELESS ", "SUDAN", "SURINAM ", "SVALBARD & JAN MAYEN ", "SWAZILAND ", "SWEDEN ", "SWITZERLAND ", "SYRIA ", "TAHITI ", "TAIWAN ", "TANZANIA", "THAILAND ", "THE CZECH REPUBLIC", "THE RUSSIAN FEDERATION", "THE SLOVAK REPUBLIC ", "TOGO ", "TOKELAU ", "TONGA ", "TOURS ", "TRINIDAD & TOBAGO ", "TRISTAN DA CUNHA ", "TUNISIA ", "TURKEY", "TURKS & CAICOS ISLAND ", "TUVALU ", "UGANDA ", "UKRAINE ", "UNITED STATES MINOR OUTLYING ISLANDS", "URUGUAY ", "USA", "VANUATU ", "VATICAN CITY STATE ", "VENEZUELA ", "VIETNAM", "VIRGIN ISLANDS (BRITISH) ", "VIRGIN ISLANDS (USA) ", "WALES", "WALLIS & FUTUNA ", "WESTERN SAHARA ", "WESTERN SAMOA ", "ZAIRE (Rep. of CONGO", "ZAMBIA", "ZIMBABWE"]
var rreJson = {
		"2016/17" : {
			"% Increase" : "0.0000",
			"Cumulative %" : "0.0000",
			"AP/GRB Uprating %" : "0.0000",
			"NSP Uprating" : "0.0000"
		},
		"2017/18" : {
			"% Increase" : "2.0000",
			"Cumulative %" : "0.0000",
			"AP/GRB Uprating %" : "2.0000",
			"NSP Uprating" : "0.0000"
		},
		"2018/19" : {
			"% Increase" : "2.0000",
			"Cumulative %" : "2.5000",
			"AP/GRB Uprating %" : "2.5000",
			"NSP Uprating" : "2.5000"
		},
		"2019/20" : {
			"% Increase" : "2.0000",
			"Cumulative %" : "2.7500",
			"AP/GRB Uprating %" : "2.7500",
			"NSP Uprating" : "2.7500"
		},
		"2020/21" : {
			"% Increase" : "2.0000",
			"Cumulative %" : "3.0000",
			"AP/GRB Uprating %" : "3.0000",
			"NSP Uprating" : "3.0000"
		},
		"2021/22" : {
			"% Increase" : "2.0000",
			"Cumulative %" : "3.2500",
			"AP/GRB Uprating %" : "3.2500",
			"NSP Uprating" : "3.2500"
		},
		"2022/23" : {
			"% Increase" : "2.0000",
			"Cumulative %" : "3.5000",
			"AP/GRB Uprating %" : "3.5000",
			"NSP Uprating" : "3.5000"
		},
		"2023/24" : {
			"% Increase" : "2.0000",
			"Cumulative %" : "3.7500",
			"AP/GRB Uprating %" : "3.7500",
			"NSP Uprating" : "3.7500"
		},
		"2024/25" : {
			"% Increase" : "2.0000",
			"Cumulative %" : "4.0000",
			"AP/GRB Uprating %" : "4.0000",
			"NSP Uprating" : "4.0000"
		},
		"2025/26" : {
			"% Increase" : "2.0000",
			"Cumulative %" : "4.2500",
			"AP/GRB Uprating %" : "4.2500",
			"NSP Uprating" : "4.2500"
		},
		"2026/27" : {
			"% Increase" : "0.0000",
			"Cumulative %" : "4.5000",
			"AP/GRB Uprating %" : "4.5000",
			"NSP Uprating" : "4.5000"
		}
};

var oneDay = 24*60*60*1000; // hours*minutes*seconds*milliseconds
var cutoffDate = new Date(2016, 03, 06);

var datepickerOptionsFullYear = {
	dateFormat: 'dd/mm/yy',
	changeMonth: true,
    changeYear: true,
    yearRange: '-100:+100'
};

var datepickerOptionsShortYear = {
		
	dateFormat: 'dd/mm/y',
	changeMonth: true,
    changeYear: true,
    yearRange: '-100:+100'
};

$(document).ready(function() {
	
	$(document).tooltip();
	
	$(".datepicker").datepicker(datepickerOptionsFullYear);
	$(".datepickershortyear").datepicker(datepickerOptionsShortYear);
	
	// Allow only numbers in textbox
	$("#proRataTablePre75, #proRataUsaTablePre75, #proRataEuraTablePost75, #proRataUsaTablePost75, #nspDiv, #rreDiv, #inheritedDiv, #customerDetailsDiv").on("keypress", ".number", function (e) {
	    if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
	    	return false;
	    }
	});
	
	// Allow only numbers with 2 decimal places in textbox
	$("#proRataTablePre75, #proRataUsaTablePre75, #proRataEuraTablePost75, #proRataUsaTablePost75, #espTable, #nspDiv, #rreDiv, #inheritedDiv, #customerDetailsDiv").on("keypress", ".numberWithDecimal", function(event) {
		if ((event.which != 46 || $(this).val().indexOf('.') != -1) &&
				((event.which < 48 || event.which > 57) &&
						(event.which != 0 && event.which != 8))) {
			return false;
		}

		var text = $(this).val();

		if ((text.indexOf('.') != -1) &&
				(text.substring(text.indexOf('.')).length > 2) &&
				(event.which != 0 && event.which != 8) &&
				($(this)[0].selectionStart >= text.length - 2)) {
			return false;
		}
	});
	
	$("#proRataTablePre75, #proRataUsaTablePre75, #proRataEuraTablePost75, #proRataUsaTablePost75, #espTable, #nspDiv, #rreDiv, #inheritedDiv, #customerDetailsDiv").on("change", ".numberWithDecimal", function(event) {
		var text = $(this).val();
		var num = "";
		if (text) {
			num = Number(text).toFixed(2);
		}
		$(this).val(num);
	});
	
	// Make checkbox readonly
	$("input:checkbox").click(function() { return false; });

	
	// Customer/Partner screens
	$( "#customerSpaDate" ).on("change", function() {
		var selectedDate = getDateFromDatePickerString($(this).val());
		if (selectedDate !== "" && selectedDate.getTime() > cutoffDate.getTime()) {
			$('#nspCustomerCheck')[0].checked = true;
		} else {
			$('#nspCustomerCheck')[0].checked = false;
		}
	});

	$( "#partnerSpaDate" ).on("change", function() {
		var selectedDate = getDateFromDatePickerString($(this).val());
		if (selectedDate !== "" && selectedDate.getTime() > cutoffDate.getTime()) {
			$('#nspPartnerCheck')[0].checked = true;
		} else {
			$('#nspPartnerCheck')[0].checked = false;
		}
	});
	
	// Customer calculations
	$("#customerDetailsDiv").on("change", "#countryOfResidence", function() {
		var countryOfResidence = $("#countryOfResidence").val();
		countriesWithoutFrozenRate.every(function(country) {
		    if (countryOfResidence === country) {
		    	$("#frozenRate").val("No");
		    	return false;
		    } else {
		    	// Country selected is a frozen rate country
		    	$("#frozenRate").val("Yes");
		    	return true;
			}
		});
	});

	
	// Pro-Rata calculations
	
	// Pre 75 EU/RA add insurance record
	$("#proRataTablePre75").on("click", ".addProRataPre75", function() {
		var tblRowCount = $("#proRataTablePre75 tbody").length;
		$("#proRataTablePre75 tbody:last").after('<tbody><tr><th colspan="3">Country</th></tr><tr><td colspan="3"><select class="form-control fillSpace" name="listOfInsuranceRecords[' + tblRowCount + '].countryProRata"></select></td></tr><tr><th>From</th><th>To</th><th>No. of Weeks</th></tr><tr><td><input class="form-control datepickershortyear fillSpace" name="listOfInsuranceRecords[' + tblRowCount + '].fromProRata" title="This should be in the format dd/mm/yy" /></td><td><input class="form-control datepickershortyear fillSpace" name="listOfInsuranceRecords[' + tblRowCount + '].toProRata" title="This should be in the format dd/mm/yy" /></td><td><input class="form-control fillSpace number" name="listOfInsuranceRecords[' + tblRowCount + '].noOfWeeks" /></td><td><a href="javascript:void(0);" class="removeProRataPre75">Remove</a></td></tr></tbody>');
		$(".datepickershortyear").datepicker(datepickerOptionsShortYear);
		populateCountriesWithoutFrozenRate();
	});

	// Pre 75 EU/RA remove insurance record
	$("#proRataTablePre75").on("click", ".removeProRataPre75", function(){
		$(this).parent().parent().parent().remove();
		// Re-calculate the total no of weeks and reckonable years
		calculateTotalAndReckonableYearsForPre75();
	});
	
	// Pre 75 USA add insurance record
	$("#proRataUsaTablePre75").on("click", ".addProRataPre75", function() {
		var tblRowCount = $("#proRataUsaTablePre75 tr").length - 1;
		$("#proRataUsaTablePre75 tr:last").after('<tr><td><select class="form-control fillSpace" name="listOfInsuranceRecords[' + tblRowCount + '].countryProRata"></select></td><td><input class="form-control datepickershortyear fillSpace" type="text" name="listOfInsuranceRecords[' + tblRowCount + '].fromProRata" title="This should be in the format dd/mm/yy" /></td><td><input class="form-control datepickershortyear fillSpace" type="text" name="listOfInsuranceRecords[' + tblRowCount + '].toProRata" title="This should be in the format dd/mm/yy" /></td><td><input class="form-control fillSpace number" type="text" name="listOfInsuranceRecords[' + tblRowCount + '].noOfWeeks" /></td><td><a href="javascript:void(0);" class="removeProRataPre75">Remove</a></td></tr>');
		$(".datepickershortyear").datepicker(datepickerOptionsShortYear);
		populateUsa();
	});
	
	// Pre 75 USA remove insurance record
	$("#proRataUsaTablePre75").on("click", ".removeProRataPre75", function(){
		$(this).parent().parent().remove();
		// Re-calculate the total no of weeks and reckonable years
		calculateTotalAndReckonableYearsForPre75();
	});

	// Post 75 EU/RA add insurance record
	$("#proRataEuraTablePost75").on("click", ".addProRataEuraPost75", function() {
		var tblBodyCount = $("#proRataEuraTablePost75 tbody").length;
		$("#proRataEuraTablePost75 tbody:last").after('<tbody><tr><th colspan="3">Country (a)</th></tr><tr><td colspan="3"><select class="form-control fillSpace" name="listOfInsuranceRecords[' + tblBodyCount + '].countryProRata"></select></td></tr><tr><th>From (b)</th><th>To (c)</th><th>Total No. of Weeks (d)</th></tr><tr><td><input class="form-control datepickershortyear fillSpace" type="text" name="listOfInsuranceRecords[' + tblBodyCount + '].fromProRata" title="This should be in the format dd/mm/yy" /></td><td><input class="form-control datepickershortyear fillSpace" type="text" name="listOfInsuranceRecords[' + tblBodyCount + '].toProRata" title="This should be in the format dd/mm/yy" /></td><td><input class="form-control fillSpace number" type="text" name="listOfInsuranceRecords[' + tblBodyCount + '].totalNoOfWeeks" /></td></tr><tr><th>No. of foreign employed persons conts (e)</th><th>2/3 Upper earnings level (f)</th><th>Calculation 1 Total (g) = (e) X (f)</th></tr><tr><td><input class="form-control fillSpace noOfForeignEmployed number" type="text" name="listOfInsuranceRecords[' + tblBodyCount + '].noOfForeignEmployed" /></td><td><span>&#163;</span><input class="form-control fillSpace twoThirdUpper numberWithDecimal" type="text" name="listOfInsuranceRecords[' + tblBodyCount + '].twoThirdUpper" /></td><td><span>&#163;</span><input class="form-control fillSpace calc1" type="text" name="listOfInsuranceRecords[' + tblBodyCount + '].calc1" readonly="readonly" /></td></tr><tr><th>No. of other foreign conts and/or No. of credits (h)</th><th>Appropriate lower earnings level (i)</th><th>Calculation 2 Total (j) = (h) X (i)</th></tr><tr><td><input class="form-control fillSpace noOfOtherForeign number" type="text" name="listOfInsuranceRecords[' + tblBodyCount + '].noOfOtherForeign" /></td><td><span>&#163;</span><input class="form-control fillSpace appropriateLowerEarnings numberWithDecimal" type="text" name="listOfInsuranceRecords[' + tblBodyCount + '].appropriateLowerEarnings" /></td><td><span>&#163;</span><input class="form-control fillSpace calc2" type="text" name="listOfInsuranceRecords[' + tblBodyCount + '].calc2" readonly="readonly" /></td></tr><tr><th>UK earnings factor (k)</th><th>Calculation 3 (l) = Total (g) & (j) & (k)</th><th></th></tr><tr><td><span>&#163;</span><input class="form-control fillSpace ukEarningsFactor numberWithDecimal" type="text" name="listOfInsuranceRecords[' + tblBodyCount + '].ukEarningsFactor" /></td><td><span>&#163;</span><input class="form-control fillSpace" type="text" name="listOfInsuranceRecords[' + tblBodyCount + '].calc3" readonly="readonly" /></td><td></td></tr><tr><th>Amount required for qualifying year (m)</th><th>Qualifying years (n) = where (l) equals or exceeds (m)</th><th></th></tr><tr><td><span>&#163;</span><input class="form-control fillSpace amountReqForQualYear numberWithDecimal" type="text" name="listOfInsuranceRecords[' + tblBodyCount + '].amountReqForQualYear" /></td><td><input type="text" class="form-control fillSpace" name="listOfInsuranceRecords[' + tblBodyCount + '].qualYears" readonly="readonly" /></td><td></td></tr><tr><th>Qualifying UK Weeks (o)</th><th>Qualifying Foreign Weeks (p)</th><th></th></tr><tr><td><input class="form-control fillSpace qualUkWeeks number" type="text" name="listOfInsuranceRecords[' + tblBodyCount + '].qualUkWeeks" /></td><td><input class="form-control fillSpace qualForeignWeeks number" type="text" name="listOfInsuranceRecords[' + tblBodyCount + '].qualForeignWeeks" /></td><td><a href="javascript:void(0);" class="removeProRataEuraPost75">Remove</a></td></tr></tbody>');
		$(".datepickershortyear").datepicker(datepickerOptionsShortYear);
		populateCountriesWithoutFrozenRate();
	});
	
	// Post 75 EU/RA remove insurance record
	$("#proRataEuraTablePost75").on("click", ".removeProRataEuraPost75", function(){
		$(this).parent().parent().parent().remove();
		// Re-calculate the Total Qualifying weeks
		calculateTotalQualWeeksForPost75();
	});

	// Post 75 USA add insurance record
	$("#proRataUsaTablePost75").on("click", ".addProRataUsaPost75", function() {
		var tblBodyCount = $("#proRataUsaTablePost75 tbody").length;
		$("#proRataUsaTablePost75 tbody:last").after('<tbody><tr><th>Country (a)</th><th>From (b)</th><th>To (c)</th><th>Total No. of Weeks (d)</th></tr><tr><td><select class="form-control fillSpace" name="listOfInsuranceRecords[' + tblBodyCount + '].countryProRata"></select></td><td><input class="form-control datepickershortyear fillSpace" name="listOfInsuranceRecords[' + tblBodyCount + '].fromProRata" type="text" title="This should be in the format dd/mm/yy" /></td><td><input class="form-control datepickershortyear fillSpace" name="listOfInsuranceRecords[' + tblBodyCount + '].toProRata" type="text" title="This should be in the format dd/mm/yy" /></td><td><input class="form-control fillSpace number" name="listOfInsuranceRecords[' + tblBodyCount + '].totalNoOfWeeks" type="text" /></td></tr><tr><th>US QC in tax year (e)</th><th>Calculation 1 Total (f) = (e) X (13)</th><th></th></tr><tr><td><input class="form-control fillSpace usQcInTaxYear number" name="listOfInsuranceRecords[' + tblBodyCount + '].usQcInTaxYear" type="text" /></td><td><input class="form-control fillSpace calc1 number" name="listOfInsuranceRecords[' + tblBodyCount + '].calc1" type="text" readonly="readonly" /></td><td></td></tr><tr><th>Appropriate lower earnings level (g)</th><th>Calculation 2 Total (h) = (f) X (g)</th><th></th></tr><tr><td><span>&#163;</span><input class="form-control fillSpace appropriateLowerEarnings numberWithDecimal" name="listOfInsuranceRecords[' + tblBodyCount + '].appropriateLowerEarnings" type="text" /></td><td><span>&#163;</span><input class="form-control fillSpace calc2" name="listOfInsuranceRecords[' + tblBodyCount + '].calc2" type="text" readonly="readonly" /></td><td></td></tr><tr><th>UK earnings factor (i)</th><th>Calculation 3 Total (j) = (h) & (i)</th><th></th></tr><tr><td><span>&#163;</span><input class="form-control fillSpace ukEarningsFactor numberWithDecimal" name="listOfInsuranceRecords[' + tblBodyCount + '].ukEarningsFactor" type="text" /></td><td><span>&#163;</span><input class="form-control fillSpace calc3" name="listOfInsuranceRecords[' + tblBodyCount + '].calc3" type="text" readonly="readonly" /></td><td></td></tr><tr><th>Amount required for qualifying year (k)</th><th>Qualifying years (l) = where (j) equals or exceeds (k)</th><th>Rounded UK Weeks Total (m) = (i) / (g)</th></tr><tr><td><span>&#163;</span><input class="form-control fillSpace amountReqForQualYear numberWithDecimal" name="listOfInsuranceRecords[' + tblBodyCount + '].amountReqForQualYear" type="text" /></td><td><input type="text" class="form-control fillSpace" name="listOfInsuranceRecords[' + tblBodyCount + '].qualYears" readonly="readonly" /></td><td><input class="form-control fillSpace roundedUkWeeksTotal" name="listOfInsuranceRecords[' + tblBodyCount + '].roundedUkWeeksTotal" type="text" readonly="readonly" /></td></tr><tr><th>Qualifying UK Weeks (n)</th><th>Qualifying Foreign Weeks (o)</th><th></th></tr><tr><td><input class="form-control fillSpace qualUkWeeks number" name="listOfInsuranceRecords[' + tblBodyCount + '].qualUkWeeks" type="text" /></td><td><input class="form-control fillSpace qualForeignWeeks number" name="listOfInsuranceRecords[' + tblBodyCount + '].qualForeignWeeks" type="text" /></td><td><a href="javascript:void(0);" class="removeProRataUsaPost75">Remove</a></td></tr></tbody>');
		$(".datepickershortyear").datepicker(datepickerOptionsShortYear);
		populateUsa();
	});
	
	// Post 75 USA remove insurance record
	$("#proRataUsaTablePost75").on("click", ".removeProRataUsaPost75", function(){
		$(this).parent().parent().parent().remove();
		// Re-calculate the Total Qualifying weeks
		calculateTotalQualWeeksForPost75();
	});
	
	// Pre/Post 75 EU/RA/USA calculations
	$("#proRataTablePre75, #proRataUsaTablePre75, #proRataEuraTablePost75, #proRataUsaTablePost75").on("change", ".datepickershortyear, input[name$=noOfWeeks], input[name$=totalNoOfWeeks]", function() {
		var arrayOfElements = $(this).parent().parent().parent().find("td").toArray();
		
		var diffWeeksElem = arrayOfElements[3].childNodes[0];
		
		var fromDateStr = arrayOfElements[1].childNodes[0].value;
		var toDateStr = arrayOfElements[2].childNodes[0].value;
		var fromDate = getDateFromDatePickerString(fromDateStr);
		var toDate = getDateFromDatePickerString(toDateStr);
		
		if (fromDate !== "" && toDate !== "" && toDate >= fromDate) {
			var diffDays = Math.ceil(Math.abs((toDate.getTime() - fromDate.getTime())/(oneDay)));
			var diffWeeks = Math.ceil(diffDays/7);
			$(diffWeeksElem).val(diffWeeks);
			$(diffWeeksElem).prop("readonly", true);
		} else if (fromDate === "" || toDateStr === "") {
			$(diffWeeksElem).prop("readonly", false);
		}
			
		// Calculate the total no of weeks and reckonable years
		calculateTotalAndReckonableYearsForPre75();
	});
	
	// Pre 75 EU/RA/USA calculations
	$("#fromPre75").on("change", function() {
		// Calculate the total no of weeks and reckonable years
		calculateTotalAndReckonableYearsForPre75();
	});
	
	// Post 75 EU/RA Calculation of Calc1/Calc2/Calc3
	$("#proRataEuraTablePost75").on("change", ".noOfForeignEmployed, .twoThirdUpper, .noOfOtherForeign, .appropriateLowerEarnings, .ukEarningsFactor, .amountReqForQualYear", function() {
		
		var arrayOfElements = $(this).parent().parent().parent().find("td").toArray();
		
		var calc1Elem = arrayOfElements[6].childNodes[1];
		var calc2Elem = arrayOfElements[9].childNodes[1];
		var calc3Elem = arrayOfElements[11].childNodes[1];
		var qualYearsElem = arrayOfElements[14].childNodes[0];
		
		var noOfForeignEmployed = "";
		var twoThirdUpper = "";
		var noOfOtherForeign = "";
		var appropriateLowerEarnings = "";
		var ukEarningsFactor = "";
		var amountReqForQualYear = "";
		
		if (arrayOfElements[4].childNodes[0].value) {
			noOfForeignEmployed = Number(arrayOfElements[4].childNodes[0].value);
		}
		if (arrayOfElements[5].childNodes[1].value) {
			twoThirdUpper = Number(arrayOfElements[5].childNodes[1].value).toFixed(2);
		}
		if (arrayOfElements[7].childNodes[0].value) {
			noOfOtherForeign = Number(arrayOfElements[7].childNodes[0].value);
		}
		if (arrayOfElements[8].childNodes[1].value) {
			appropriateLowerEarnings = Number(arrayOfElements[8].childNodes[1].value).toFixed(2);
		}
		if (arrayOfElements[10].childNodes[1].value) {
			ukEarningsFactor = Number(arrayOfElements[10].childNodes[1].value).toFixed(2);
		}
		if (arrayOfElements[13].childNodes[1].value) {
			amountReqForQualYear = Number(arrayOfElements[13].childNodes[1].value).toFixed(2);
		}
		
		var calc1 = "";
		var calc2 = "";
		var calc3 = "";
		
		if (noOfForeignEmployed !== "" && twoThirdUpper !== "") {
			calc1 = Number(noOfForeignEmployed * twoThirdUpper).toFixed(2);
		}
		if (noOfOtherForeign !== "" && appropriateLowerEarnings !== "") {
			calc2 = Number(noOfOtherForeign * appropriateLowerEarnings).toFixed(2);
		}
		if (calc1 !== "" && calc2 !== "" && ukEarningsFactor !== "") {
			calc3 = Number(calc1) + Number(calc2) + Number(ukEarningsFactor);
			calc3 = calc3.toFixed(2);
		}
		
		$(calc1Elem).val(calc1);
		$(calc2Elem).val(calc2);
		$(calc3Elem).val(calc3);		
		if (calc3 !== "" && amountReqForQualYear !== "") {
			if (calc3 >= amountReqForQualYear) {
				$(qualYearsElem).val("Yes");
			} else {
				$(qualYearsElem).val("No");
			}
		} else {
			$(qualYearsElem).val("");
		}
	})
	
	// Post 75 USA Calculation of Calc1/Calc2/Calc3
	$("#proRataUsaTablePost75").on("change", ".usQcInTaxYear, .appropriateLowerEarnings, .ukEarningsFactor, .amountReqForQualYear", function() {
		
		var arrayOfElements = $(this).parent().parent().parent().find("td").toArray();
		
		var calc1Elem = arrayOfElements[5].childNodes[0];
		var calc2Elem = arrayOfElements[8].childNodes[1];
		var calc3Elem = arrayOfElements[11].childNodes[1];
		var qualYearsElem = arrayOfElements[14].childNodes[0];
		var roundedUkWeeksTotalElem = arrayOfElements[15].childNodes[0];
		
		var usQcInTaxYear = "";
		var appropriateLowerEarnings = "";
		var ukEarningsFactor = "";
		var amountReqForQualYear = "";
		
		if (arrayOfElements[4].childNodes[0].value) {
			usQcInTaxYear = Number(arrayOfElements[4].childNodes[0].value);
		}
		if (arrayOfElements[7].childNodes[1].value) {
			appropriateLowerEarnings = Number(arrayOfElements[7].childNodes[1].value);
		}
		if (arrayOfElements[10].childNodes[1].value) {
			ukEarningsFactor = arrayOfElements[10].childNodes[1].value;
		}
		if (arrayOfElements[13].childNodes[1].value) {
			amountReqForQualYear = Number(arrayOfElements[13].childNodes[1].value).toFixed(2);
		}
		
		var calc1 = "";
		var calc2 = "";
		var calc3 = "";
		var roundedUkWeeksTotal = "";
		
		if (usQcInTaxYear !== "") {
			calc1 = Number(usQcInTaxYear * 13);
		}
		if (calc1 !== "" && appropriateLowerEarnings !== "") {
			calc2 = Number(calc1 * appropriateLowerEarnings).toFixed(2);
		}
		if (calc2 !== "" && ukEarningsFactor !== "") {
			calc3 = Number(calc2) + Number(ukEarningsFactor);
			calc3 = calc3.toFixed(2);
		}
		if (ukEarningsFactor !== "" && appropriateLowerEarnings !== "" && Number(appropriateLowerEarnings) !== 0) {
			roundedUkWeeksTotal = Math.floor(ukEarningsFactor/appropriateLowerEarnings);
		}
		
		$(calc1Elem).val(calc1);
		$(calc2Elem).val(calc2);
		$(calc3Elem).val(calc3);
		$(roundedUkWeeksTotalElem).val(roundedUkWeeksTotal);
		if (calc3 !== "" && amountReqForQualYear !== "") {
			if (calc3 >= amountReqForQualYear) {
				$(qualYearsElem).val("Yes");
			} else {
				$(qualYearsElem).val("No");
			}
		} else {
			$(qualYearsElem).val("");
		}
		
	})
	
	// Post 75 EU/RA/USA Calculation of Total Qualifying Weeks
	$("#proRataEuraTablePost75, #proRataUsaTablePost75").on("change", ".qualUkWeeks, .qualForeignWeeks", function() {
		calculateTotalQualWeeksForPost75();
	});
	
	
	// ESP Calculations
	
	// Add Esp record
	$("#espTable").on("click", ".addEsp", function() {
		var tblBodyCount = $("#espTable tbody").length;
		$("#espTable tbody:last").after('<tbody><tr><th>Country of Residence</th><th>Temporary or Permanent?</th><th>NSP ESP Uprating Payable</th></tr><tr><td><select class="form-control fillSpace" name="listOfEspRecords[' + tblBodyCount + '].countryOfResidence"></select></td><td><select class="form-control fillSpace" name="listOfEspRecords[' + tblBodyCount + '].status"><option value="Permanent">Permanent</option><option value="Temporary">Temporary</option></select></td><td><select class="form-control fillSpace" name="listOfEspRecords[' + tblBodyCount + '].upratingPayable"><option value="Yes">Yes</option><option value="No">No</option></select></td></tr><tr><th>Start Date</th><th>End Date</th><th>Uprating Year</th></tr><tr><td><input class="form-control datepicker fillSpace" name="listOfEspRecords[' + tblBodyCount + '].startDate" title="This should be in the format dd/mm/yyyy" /></td><td><input class="form-control datepicker fillSpace" name="listOfEspRecords[' + tblBodyCount + '].endDate" title="This should be in the format dd/mm/yyyy" /></td><td><input class="form-control fillSpace" name="listOfEspRecords[' + tblBodyCount + '].upratingYear" title="This should be in the format yy/yy" /></td></tr><tr><th>Combined NSP & PP Amount</th><th>NSP ESP Amount</th><th></th></tr><tr><td><span>&#163;</span><input class="form-control fillSpace numberWithDecimal" name="listOfEspRecords[' + tblBodyCount + '].combinedAmount" /></td><td><span>&#163;</span><input class="form-control fillSpace numberWithDecimal" name="listOfEspRecords[' + tblBodyCount + '].nspEspAmount" /></td><td><a href="javascript:void(0);" class="removeEsp">Remove</a></td></tr></tbody>');
		$(".datepicker").datepicker(datepickerOptionsFullYear);
		populateCountries();
	});

	// Remove Esp record
	$("#espTable").on("click", ".removeEsp", function(){
		$(this).parent().parent().parent().remove();
		// Re-calculate the total ESP amount
		calculateTotalEsp();
	});
	
	$("#espTable").on("change", "input[name$=nspEspAmount]", function() {
		// Calculate the total Esp
		calculateTotalEsp();
	});
	
	// RRE Calculations
	$("#rreDiv").on("change", "#upratingYearRreEntitlement, #ap, #grb", function() {
		var upratingYearRreEntitlement = $("#upratingYearRreEntitlement").val();
		var rreAmount = Number($("#rreAmount").val()).toFixed(2);
		var ap = Number($("#ap").val()).toFixed(2);
		var grb = Number($("#grb").val()).toFixed(2);
		
		var rreRreEntitlement = Number($("#rreRreEntitlement").val()).toFixed(2);
		var apRreEntitlement = Number($("#apRreEntitlement").val()).toFixed(2);
		var grbRreEntitlement = Number($("#grbRreEntitlement").val()).toFixed(2);
		var rreTotalRreEntitlement = Number($("rreTotalRreEntitlement").val()).toFixed(2);
		
		$.each(rreJson, function(key, value) {
			if (key === upratingYearRreEntitlement) {
			    $.each(value, function(key, value) {
			    	console.log(key, value);
			    	if (key === "NSP Uprating") {
			    		rreRreEntitlement = (Number(rreAmount) + Number((rreAmount * value)/100)).toFixed(2);
			    	} else if (key === "AP/GRB Uprating %") {
			    		apRreEntitlement = (Number(ap) + Number((ap * value)/100)).toFixed(2);
			    		grbRreEntitlement = (Number(grb) + Number((grb * value)/100)).toFixed(2);
			    	}
			    });
			    return false;
			}
			// The uprating year doesn't match any of the values
			
		});
		rreTotalRreEntitlement = (Number(rreRreEntitlement) + Number(apRreEntitlement) + Number(grbRreEntitlement)).toFixed(2);
		
		$("#rreRreEntitlement").val(rreRreEntitlement);
		$("#apRreEntitlement").val(apRreEntitlement);
		$("#grbRreEntitlement").val(grbRreEntitlement);
		$("#rreTotalRreEntitlement").val(rreTotalRreEntitlement);		
	});
	
	// Inherited calculations
	var customerSpaDateRule = false;
	var partnerSpaDateRule = false;
	var dateOfMarriageRule = false;
	$("input[name$=Rule").each(function(index, obj) {
		var name = $(obj).attr("name");
		var val = $(obj).val();
		if (name === "customerSpaDateRule" && val === "Post 2016") {
			customerSpaDateRule = true;
		} else if (name === "partnerSpaDateRule" && val === "Post 2016") {
			partnerSpaDateRule = true;
		} else if (name === "dateOfMarriageRule" && val === "Post 2016") {
			dateOfMarriageRule = true;
		}
	});	
	if (customerSpaDateRule === true && partnerSpaDateRule === true && dateOfMarriageRule === true) {
		$(".hiddenSpan").hide();
		$(".hiddenDiv").show();
	} else {
		$(".hiddenDiv").hide();
		$(".hiddenSpan").show();
	}
	
	// NSP calculations
	$("#nspDiv").on("change", "#oldRulesAmt, #newRulesAmt", function() {
		var oldRulesAmt = Number($("#oldRulesAmt").val()).toFixed(2);
		var newRulesAmt = Number($("#newRulesAmt").val()).toFixed(2);
		var maxAmt;
		if (oldRulesAmt === newRulesAmt) {
			maxAmt = newRulesAmt;
		} else {
			maxAmt = Math.max(oldRulesAmt, newRulesAmt).toFixed(2);
		}
		$("#startingAmt").val(maxAmt);
	});
	$("#nspDiv").on("change", "#ukQualYrsPre2016, #ukQualYrsPost2016", function() {
		var ukQualYrsPre2016 = Number($("#ukQualYrsPre2016").val());
		var ukQualWeeksPre2016 = ukQualYrsPre2016 * 52;
		var addUKWeeksPre2016 = Number($("#addUKWeeksPre2016").val());
		var foreignWeeksPre2016 = Number($("#foreignWeeksPre2016").val());
		var pre75WeeksPre2016 = Number($("#pre75WeeksPre2016").val());
		var totalPre2016 = ukQualWeeksPre2016 + addUKWeeksPre2016 + foreignWeeksPre2016 + pre75WeeksPre2016;
		
		var ukQualYrsPost2016 = Number($("#ukQualYrsPost2016").val());
		var ukQualWeeksPost2016 = ukQualYrsPost2016 * 52;
		var addUKWeeksPost2016 = Number($("#addUKWeeksPost2016").val());
		var foreignWeeksPost2016 = Number($("#foreignWeeksPost2016").val());
		var totalPost2016 = ukQualWeeksPost2016 + addUKWeeksPost2016 + foreignWeeksPost2016;
		
		if (totalPre2016 + totalPost2016 >= 520) {
			$("#mqpAchieved").val("Yes");
		} else {
			$("#mqpAchieved").val("No");
		}
	});
	
});

function calculateTotalEsp() {
	var totalEsp = "";
	$("input[name$=nspEspAmount").each(function(index, obj) {
		if ($(obj).val()) {
			totalEsp = Number(totalEsp) + Number($(obj).val());
		}
	});
	if (totalEsp) {
		$("#totalNspEspAmount").val(Number(totalEsp).toFixed(2));
	} else {
		$("#totalNspEspAmount").val(totalEsp);
	}
}

function calculateTotalAndReckonableYearsForPre75() {
	var totalNoOfWeeks = "";
	$("input[name$=noOfWeeks]").each(function(index, obj) {
		if ($(obj).val()) {
			totalNoOfWeeks = Number(totalNoOfWeeks) + Number($(obj).val());
		}
	});
	$("#total").val(totalNoOfWeeks);
	var noOfReckonableYears = "";
	if (totalNoOfWeeks !== "") {
		noOfReckonableYears = Math.ceil(totalNoOfWeeks/50); // 50 weeks used by business in a year
	}
	var noOfReckonableYearsToDisplay = "";
	
	var from = getDateFromDatePickerString($("#fromPre75").val());
	var to = getDateFromDatePickerString($("#toPre75").val());
	if (from !== "" && to !== "" && noOfReckonableYears !== "" && to >= from) {
		var noOfYears = to.getFullYear() - from.getFullYear();
		if (noOfYears === 0) {
			// Rounding the no of years to 1 if the from and to dates are in the same year
			noOfYears = 1;
		}
		noOfReckonableYearsToDisplay = Math.min(noOfReckonableYears, noOfYears);
	}
	$("#noOfReckonableYears").val(noOfReckonableYearsToDisplay);
}

function calculateTotalQualWeeksForPost75() {
	var totalNoOfQualUkWeeks = "";
	var totalNoOfQualForeignWeeks = "";
	
	// Calculate the total no of qualifying UK and Foreign weeks
	$("input[name$=qualUkWeeks]").each(function(index, obj) {
		if ($(obj).val()) {
			totalNoOfQualUkWeeks = Number(totalNoOfQualUkWeeks) + Number($(obj).val());
		}
	});
	$("input[name$=qualForeignWeeks]").each(function(index, obj) {
		if ($(obj).val()) {
			totalNoOfQualForeignWeeks = Number(totalNoOfQualForeignWeeks) + Number($(obj).val());
		}
	});
	$("#totalQualWeeksUk").val(totalNoOfQualUkWeeks);
	$("#totalQualWeeksForeign").val(totalNoOfQualForeignWeeks);
}

function getDateFromDatePickerString(datePickerStr) {
	var selectedDate = "";
	if (datePickerStr && typeof datePickerStr !== 'undefined') {
		var selectedDay = datePickerStr.substring(0, 2);
		var selectedMonth = datePickerStr.substring(3, 5);
		var selectedYear = datePickerStr.substring(6);
		selectedDate = new Date(selectedYear, selectedMonth - 1, selectedDay);
	}
	return selectedDate;
}

function populateCountriesWithoutFrozenRate() {
	var fragment = document.createDocumentFragment();
	countriesWithoutFrozenRate.forEach(function(country, index) {
	    var opt = document.createElement('option');
	    opt.innerHTML = country;
	    opt.value = country;
	    fragment.appendChild(opt);
	});
	$("select[name$=countryProRata]").append(fragment);
}

function populateCountries() {
	var fragment = document.createDocumentFragment();
	countries.forEach(function(country, index) {
	    var opt = document.createElement('option');
	    opt.innerHTML = country;
	    opt.value = country;
	    fragment.appendChild(opt);
	});
	$("select[name$=countryOfResidence]").append(fragment);
}

function populateUsa() {
	var fragment = document.createDocumentFragment();
	usa.forEach(function(country, index) {
	    var opt = document.createElement('option');
	    opt.innerHTML = country;
	    opt.value = country;
	    fragment.appendChild(opt);
	});
	$("select[name$=countryProRata]").append(fragment);
}
