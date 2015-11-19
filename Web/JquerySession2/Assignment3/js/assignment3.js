$(document).ready(init);

function init() {
	$('#startButton').click(start);
	$('#stopButton').click(stop);
	$('#backButton').click(back);
	$('#leftButton').click(left);
	$('#rightButton').click(right);
	$('#topButton').click(topMove);
	$('#bottomButton').click(bottom);
}

/* function to start moving the div */
function start() {
$('#demoDiv').animate({left: '+=250px'}, 3000);
}

/* this function will stop the div */
function stop() {
$('#demoDiv').stop();
}

/* this function will move the div in reverse direction */
function back() {
$('#demoDiv').animate({left: '-=250px'}, 3000);
}

/* this function will move the div 50px from left */
function left() {
$('#demoDiv').animate({left: '+=50px'}, 1000);
}

/* this function will move the div 50px from right */
function right() {
$('#demoDiv').animate({left: '-=50px'}, 1000);
}

/* this function will move the div 50px from top */
function topMove() {
$('#demoDiv').animate({top: '+=50px'}, 1000);
}

/* this function will move the div 50px from bottom */
function bottom() {
$('#demoDiv').animate({top: '-=50px'}, 1000);
}