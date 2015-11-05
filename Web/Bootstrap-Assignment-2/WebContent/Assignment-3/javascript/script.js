$(window).resize(hideLabel);
$(document).ready(function() {
	/*addTable();*/
});
function hideLabel() {
	var w = window.innerWidth;
	if (w < 768) {
		$('#txtTitle').attr("placeholder", "Enter Movie Title");
		$('#txtDirector').attr("placeholder", "Enter Director Name");
		$('#txtWritter').attr("placeholder", "Enter Writer Name");
		$('#txtProducer').attr("placeholder", "Enter Producer Name");
		$('#txtComposer').attr("placeholder", "Enter Composer Name");
		$('#txtWebsite').attr("placeholder", "Enter Website");
		$('#txtYouTube').attr("placeholder",
			"Enter Youtube Link of Trailer");
		$('#txtAreaReview').attr("placeholder", "Enter Review");
	} else {
		$('#txtTitle').attr("placeholder", "");
		$('#txtDirector').attr("placeholder", "");
		$('#txtWritter').attr("placeholder", "");
		$('#txtProducer').attr("placeholder", "");
		$('#txtComposer').attr("placeholder", "");
		$('#txtWebsite').attr("placeholder", "");
		$('#txtYouTube').attr("placeholder", "");
		$('#txtAreaReview').attr("placeholder", "");
	}
}
