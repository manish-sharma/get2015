//function to find the sibling of the para present in the division
$(document).ready(function() {
	$("p").siblings().css({
		"color" : "black",
		"border" : "1px dashed red"
	});
});