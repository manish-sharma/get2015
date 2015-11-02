/**
 * 
 */

// On load function is called
$(document).ready(function() 
{
	$("#empName").change(function() 
	{
		loadInfo();
	});
});
// Function is called when ajax is called
function loadInfo()
{
	// Variable to call the http
	var xhttp;
	if (window.XMLHttpRequest)
	{
		// code for modern browsers
		xhttp = new XMLHttpRequest();
	} 
	else 
	{
		// code for IE6, IE5
		xhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	// On Change State
	xhttp.onreadystatechange = function() 
	{
		if (xhttp.readyState == 4 && xhttp.status == 200) 
		{
			document.getElementById("demo").innerHTML = xhttp.responseText;
		}
	}
	// Calls the employee Name
	var name = $("#empName").val();
	xhttp.open("GET", "EmployeeData?name=" + name, true);
	xhttp.send();
}