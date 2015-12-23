$(document).ready(removeLabel);
$(window).resize(function() {
	removeLabel();
}
);

function removeLabel() {
var w = window.innerWidth;
	if(w < 768) {
		$('#txtMovieTitle').attr("placeholder", "Enter Movie Title");
		$('#txtDirector').attr("placeholder", "Enter Director Name");
		$('#txtWriter').attr("placeholder", "Enter Writer Name");
		$('#txtProducer').attr("placeholder", "Enter Producer Name");
		$('#txtComposer').attr("placeholder", "Enter Composer Name");
		$('#txtWebsite').attr("placeholder", "Enter Website");
		$('#txtYoutubeTrailer').attr("placeholder", "Enter Youtube Link of Trailer");
		$('#txtAreaReview').attr("placeholder", "Enter Review");
	}
	else {
		$('#txtMovieTitle').attr("placeholder", "");
		$('#txtDirector').attr("placeholder", "");
		$('#txtWriter').attr("placeholder", "");
		$('#txtProducer').attr("placeholder", "");
		$('#txtComposer').attr("placeholder", "");
		$('#txtWebsite').attr("placeholder", "");
		$('#txtYoutubeTrailer').attr("placeholder", "");
		$('#txtAreaReview').attr("placeholder", "");
	}
}