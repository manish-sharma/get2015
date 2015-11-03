$(document).ready(init);

function init() {
	
	$("#empName").change(loadInfo);
}


function loadInfo() {
	
	var xhttp;
	if (window.XMLHttpRequest) {
		// code for modern browsers
		xhttp = new XMLHttpRequest();
	} else {
		// code for IE6, IE5
		xhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	
	var name = $("#empName").val();
	xhttp.open("GET", "EmployeeDetailController?name=" + name, true);
	xhttp.send();
	
	xhttp.onreadystatechange = function() {
		if (xhttp.readyState == 4 && xhttp.status == 200) {
			document.getElementById("demo").innerHTML = xhttp.responseText;
		}
	}
}

