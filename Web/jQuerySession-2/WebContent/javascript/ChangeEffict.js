/**
 * call to init function 
 */
$(document).ready(init);

function init() {
	$('input#name').change(name);
	$('input#age').change(age);
	$('input#address').change(address);
}

function name() {
	$('#name').animate({backgroundColor: "red"}, 1000);
	var temp = $('#details').text();
	document.getElementById("details").innerHTML = temp+"<br/> Name:  "+$('input#name').val()+"<br/>";
	$('#name').animate({backgroundColor: "white"}, 1000);
}

function age() {
	$('#age').animate({backgroundColor: "red"}, 1000);
	var temp = $('#details').text();
	document.getElementById("details").innerHTML = temp+"<br/> Age:  "+$('input#age').val()+"<br/>";
	$('#age').animate({backgroundColor: "white"}, 1000);
}

function address() {
	$('#address').animate({backgroundColor: "red"}, 1000);
	var temp = $('#details').text();
	document.getElementById("details").innerHTML = temp+"<br/> Address:  "+$('input#address').val()+"<br/>";
	$('#address').animate({backgroundColor: "white"}, 1000);
}