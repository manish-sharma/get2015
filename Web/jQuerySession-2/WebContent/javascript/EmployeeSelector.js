$(document).ready(init);

function init() {
	$('Select').change(dropList);
}



function dropList() {
	var select = $('#select').val(); 
	xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (xhttp.readyState == 4 && xhttp.status == 200) {
			document.getElementById("details").innerHTML = xhttp.responseText;
		}
	}
	xhttp.open("GET", "/jQuerySession-2/EmployeeDetailController?name=" + select, true);
	xhttp.send();
}