//on load function when Start button is clicked
$(document).ready(function()
{
	$("#start").click(function()
	{
		$("#box").stop();
		$("#box").animate({marginLeft : '1300px'}, 8000);
	});
})
//on load function when Stop button is clicked
$(document).ready(function() {
	$("#stop").click(function() {
		$("#box").stop();
	});
})
//on load function when back button is clicked
$(document).ready(function() {
	$("#back").click(function() {
		$("#box").stop();
		$("#box").animate({
			marginLeft : '0px'
		}, 800);
	});
})
//on load function when left button is clicked
$(document).ready(function() {
	$("#left").click(function() {
		$("#box").stop();
		$("#box").animate({
			marginLeft : '-=50px'
		}, 800);
	});
})
//on load function when right button is clicked
$(document).ready(function() {
	$("#right").click(function() {
		$("#box").stop();
		$("#box").animate({
			marginLeft : '+=50px'
		}, 800);
	});
})
//on load function when bottom button is clicked
$(document).ready(function() {
	$("#bottom").click(function() {
		$("#box").stop();
		$("#box").animate({
			marginTop : '+=50px'
		}, 800);
	});
})
//on load function when top button is clicked
$(document).ready(function() {
	$("#top").click(function() {
		$("#box").stop();
		$("#box").animate({
			marginTop : '-=50px'
		}, 800);
	});
})