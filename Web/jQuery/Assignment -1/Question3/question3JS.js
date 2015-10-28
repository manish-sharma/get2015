$(document).ready(function()
{
    $("#submitbutton").on('click',action);
});

function action1()
{
	$('span.message').hide();
}

function action2()
{
	$('div.box').first().hide();
}

function action3()
{
	$(':button').hide();
}

function action4()
{
	$('img[alt="hello"]').hide();
}

function action5()
{
	$("#myDiv :text").hide();
}

function action6()
{
	$("input[name^='txt']").hide();
}

function action7()
{
	$("p").not($(".box")).hide();
}

function action9()
{
	$("div.box.error").hide();
}


function action8()
{
	$("div.box,.error").hide();
}

function action()
{
	$("div#myDiv span.info").toggle();
}