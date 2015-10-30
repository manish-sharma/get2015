/**
 * 
 */
$(document).ready(init);

function init() {
	$('#employeeName').change(loadInfo);
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

	var id = $("#employeeName").val();
	xhttp.open("POST", "EmployeeDetail?id=" + id, true);
	xhttp.send();

	xhttp.onreadystatechange = function() {
		if (xhttp.readyState == 4 && xhttp.status == 200) {
			$('#demo').html(xhttp.responseText);
		}
	}
}