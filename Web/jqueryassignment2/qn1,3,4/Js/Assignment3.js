$(document).ready(function()
{
	$("#start").click(function()
	{
		$("#box").stop();
		$("#box").animate({marginLeft : '1300px'}, 8000);
	});
})
$(document).ready(function() {
	$("#stop").click(function() {
		$("#box").stop();
	});
})
$(document).ready(function() {
	$("#back").click(function() {
		$("#box").stop();
		$("#box").animate({
			marginLeft : '0px'
		}, 800);
	});
})
$(document).ready(function() {
	$("#left").click(function() {
		$("#box").stop();
		$("#box").animate({
			marginLeft : '-=50px'
		}, 800);
	});
})
$(document).ready(function() {
	$("#right").click(function() {
		$("#box").stop();
		$("#box").animate({
			marginLeft : '+=50px'
		}, 800);
	});
})
$(document).ready(function() {
	$("#bottom").click(function() {
		$("#box").stop();
		$("#box").animate({
			marginTop : '+=50px'
		}, 800);
	});
})
$(document).ready(function() {
	$("#top").click(function() {
		$("#box").stop();
		$("#box").animate({
			marginTop : '-=50px'
		}, 800);
	});
})