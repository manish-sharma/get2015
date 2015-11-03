$(document).ready(init);

function init() {
	$('select').change(dropList);
}



function dropList() {

	var select = $('#select').val(); 
	xhttp = new XMLHttpRequest();
	
	xhttp.open("GET", "/assignment-JQUEY-Session-2/EmployeeDetailServlet?name=" + select, true);
	xhttp.send();
	xhttp.onreadystatechange = function() {
		if (xhttp.readyState == 4 && xhttp.status == 200) {
			document.getElementById("details").innerHTML = xhttp.responseText;
		}
	}
	

}