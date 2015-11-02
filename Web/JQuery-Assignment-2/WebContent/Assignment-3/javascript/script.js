$(document).ready(init);

function init() {
	$("button#start").on('click', start);
	$("button#stop").on('click', stop);
	$("button#back").on('click', back);
	$("button#left").on('click', left);
	$("button#right").on('click', right);
	$("button#top").on('click', top1);
	$("button#bottom").on('click', bottom);
}

function start() {
	$("div#block").animate({left:'+=200px'},2000);
}

function stop() {
	$("div#block").stop();
}
function back() {
	$("div#block").animate({left:'-=200px'},2000);
}
function left() {
	$("div#block").animate({left:'-=50px'},2000);
}

function right() {
	$("div#block").animate({left:'+=50px'},2000);
}

function top1() {
	$("div#block").animate({top:'-=50px'},2000);
}

function bottom() {
	$("div#block").animate({top:'+=50px'},2000);
}