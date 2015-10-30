$(function() {
	$("#submit").click(function() {

		var text = $("#textbox").val();

		$("p").html(text);
		$("#textbox").val("");
	})
});

$(document).ready(function() {

	$(".hello").text("Hello World !!").css("font-size", "20px");
	$(".hello").css("border", "2px dashed red");
});