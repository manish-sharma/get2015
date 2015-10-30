$(document).ready( function() {
	$("#start").click(floatRight);
	$("#back").click(floatLeft);
	$("#stop").click(stopDiv);
	$("#right").click(floatRight);
	$("#left").click(floatLeft);
	$("#top").click(floatTop);
	$("#bottom").click(floatBottom);
});

function floatRight() {
	$("#sampleDIV").animate({left:'+=250px'},1000);
}
   
function floatLeft() {
	$("#sampleDIV").animate({left:'-=250px'},1000);
}
function stopDiv() {
	$("#sampleDIV").stop();
}

function floatTop() {
	$("#sampleDIV").animate({top:'-=250px'},1000);
}

function floatBottom() {
	$("#sampleDIV").animate({top:'+=250px'},1000);
}

