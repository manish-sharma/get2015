/**
 * 
 */


$(document).ready(function() {
	

	$("#name").change(function() {
		$("#name").addClass('border');
		$("#name").delay(100).fadeOut();
		$("#name").delay(100).fadeIn();
		
		
		
		
		var previousDivValue = $("div").html();
		var newName = $("#name").val();
		$("div").html(previousDivValue + "<br>Name : " + newName);
		$("div").scrollTop($("div").prop("scrollHeight"));
		
		
	});

	$("#age").change(function() {
		$("#age").addClass('border');
		$("#age").delay(100).fadeOut();
		$("#age").delay(100).fadeIn();
		var previousDivValue = $("div").html();
		var newAge = $("#age").val();
		$("div").html(previousDivValue + "<br>Age : " + newAge);
		$("div").scrollTop($("div").prop("scrollHeight"));
	});

	$("#address").change(function() {
		$("#address").addClass('border');
		$("#address").delay(100).fadeOut();
		$("#address").delay(100).fadeIn();
		var previousDivValue = $("div").html();
		var newAddress = $("#address").val();
		$("div").html(previousDivValue + "<br>Address : " + newAddress);
		$("div").scrollTop($("div").prop("scrollHeight"));
	});

});