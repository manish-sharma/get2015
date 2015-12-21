$(document).ready(init);

function init() {
	$('input#name').change(name);
	$('input#age').change(age);
	$('input#address').change(address);
}

function name() {
	$('#name').animate({backgroundColor: "#FFCCFF"}, 1000);
	$("#demo").html("<br/> Name:  "+$('input#name').val()+"<br/>");
	$('#name').animate({backgroundColor: "white"}, 1000);
}

function age() {
	$('#age').animate({backgroundColor: "#FFCCFF"}, 1000);
	$("#demo").html("<br/> Age:  "+$('input#age').val()+"<br/>");
	$('#age').animate({backgroundColor: "white"}, 1000);
}

function address() {
	$('#address').animate({backgroundColor: "#FFCCFF"}, 1000);
	$("#demo").html("<br/> Address:  "+$('input#address').val()+"<br/>");
	$('#address').animate({backgroundColor: "white"}, 1000);
}