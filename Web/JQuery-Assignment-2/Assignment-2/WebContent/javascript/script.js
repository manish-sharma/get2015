/*$(document).ready(function() {
	alert("1");
	$("dropdown").change(function(event) {
		// Get the button id, as we will pass it to the servlet
		// using a GET request and it will be used to get different
		// results (bands OR bands and albums).
		
		//var selectID = event.target.id;
		//var value = $('employee').val();
		var select = document.getElementById("employee");
		var answer = select.options[select.selectedIndex].value;
		
		alert(answer);
		// Basic JQuery Ajax GET request. We need to pass 3 arguments:
		//      1. The servlet url that we will make the request to.
		//      2. The GET data (in our case just the button ID).
		//      3. A function that will be triggered as soon as the request is successful.
		// Optionally, you can also chain a method that will handle the possibility
		// of a failed request.
		$.get('DBRetrievalServlet', {
			"selected" : value
		},
		function(resp) { // on sucess
			alert("fun");
			// We need 2 methods here due to the different ways of
			// handling a JSON object.
			//document.getElementById("demo").innerHTML = xhttp.responseText;
			 $('#demo').text(resp);
		}).fail(function() { // on failure
			alert("Request failed.");
		});
	});
});*/
$(document).ready(init);

function init() {	
$("#employee").change(loadInfo);
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

var name = $("#employee").val();

xhttp.open("GET","DBRetrievalServlet?name="+name, true);
xhttp.send();

xhttp.onreadystatechange = function() {
if (xhttp.readyState == 4 && xhttp.status == 200) {
document.getElementById("demo").innerHTML = xhttp.responseText;
}
}
}
  


