$(document).ready(function() 
{
	$("#empName").change(function() 
	{
		loadInfo();
	});
});
function loadInfo()
{
	var xhttp;
	if (window.XMLHttpRequest)
	{
		xhttp = new XMLHttpRequest();
	} 
	else 
	{
		xhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	xhttp.onreadystatechange = function() 
	{
		if (xhttp.readyState == 4 && xhttp.status == 200) 
		{
			document.getElementById("demo").innerHTML = xhttp.responseText;
		}
	}
	var name = $("#empName").val();
	xhttp.open("GET", "EmployeeData?name=" + name, true);
	xhttp.send();
}