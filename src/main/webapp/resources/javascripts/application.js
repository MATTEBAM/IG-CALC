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

/*
$(window).on('beforeunload', function() {
		return function(){
	      var dialog = $('<p> Are you want to Logout ?</p>').dialog({
              buttons: {
                  "Continue with deletion of details": function() {},
                  "Return without any loss of information":  function() {},
                  "Continue with deletion of details":  function() {
                  },
                  "Return without any loss of information":  function() {
                      dialog.dialog('close');
                  
                  }
              }
          });	
		}
		});  
*/

logoutmain=null;
function logoutp(){
$(function() {
	var dialog = $('<p> Are you want to Logout ?</p>').dialog({
        buttons: {
            "Continue with deletion of details": function() {},
            "Return without any loss of information":  function() {},
            "Continue with deletion of details":  function() {
            	document.forms[0].action = "../logout";
        		document.forms[0].submit();
            	dialog.dialog('close');
                },
            
            "Return without any loss of information":  function() {
              dialog.dialog('close');
            }
        }
    });
});

}
logoutmain=logoutp;

var validNavigation = false;
function wireUpEvents() {

  window.onbeforeunload = function() {
      if (!validNavigation) {
      return "Closing this window will erase all data";
      }
  }
  $("a").bind("click", function() {
     validNavigation = true;
  });
  $("form").bind("submit", function() {
     validNavigation = true;
  });
  $("input[type=submit]").bind("click", function() {
	    validNavigation = true;
  });
  $("button").bind("click", function() {
	    validNavigation = true;
  });
  $("input[type=button]").bind("click", function() {
	    validNavigation = true;
  });
 
  $('.backLink').click(function(){
	  validNavigation = true;
  });
  $('window.back').click(function(){
	  validNavigation = true;
  });
  
  
}

$(document).ready(function() {
    wireUpEvents();  
});



function logout() {
	logoutmain();
	//	document.forms[0].action = "../logout";
		//document.forms[0].submit();
	
	
}