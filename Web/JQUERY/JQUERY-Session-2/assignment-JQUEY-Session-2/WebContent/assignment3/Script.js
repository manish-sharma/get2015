var originLeft;
$(document).ready(function()
{
	$('#start').click(fnStart);
	$('#stop').click(fnStop);
	$('#back').click(fnBack);
    $('#left').click(fnLeft);
	$('#right').click(fnRight);
	$('#top').click(fnTop);
	$('#bottom').click(fnBottom);
	
});

function fnStart()
{
	
	var offset = $(this).offset();
    originLeft = offset.left;
	$('#animatedDiv').animate({left:'300px'},3000);
	
}
function fnStop()
{
	$('#animatedDiv').stop();
	
}
function fnBack()
{
	$('#animatedDiv').animate({'left' : originLeft},3000);
	
}
function fnLeft()
{
	$('#animatedDiv').animate({'left' : "-=50"},3000);
	
}
function fnRight()
{
	$('#animatedDiv').animate({'left' : "+=50"},3000);
	
}
function fnTop()
{
	$('#animatedDiv').animate({'top' : "-=50"},3000);
	
}
function fnBottom()
{
	$('#animatedDiv').animate({'top' : "+=50"},3000);
	
}


    
	
	