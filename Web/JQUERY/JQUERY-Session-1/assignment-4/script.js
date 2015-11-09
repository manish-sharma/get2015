$(document).ready(alterColor);

function alterColor() {
	
	$( "tr:even" ).css( "background-color", "#bbbbff" );
	
	$( "tr:odd" ).css( "background-color", "red" );
	
	$( "tr:even" ).on("mouseenter ",changeColorEvenOn);
	
	$( "tr:odd" ).on("mouseenter ",changeColorOddOn);
	
	$( "tr:even" ).on("mouseleave ",changeColorEvenOff);
	
	$( "tr:odd" ).on("mouseleave ",changeColorOddOff);
}

function changeColorEvenOn() {
	
	$( "tr:even" ).css( "background-color", "lightpink" );
	
}

function changeColorOddOn() {
	
	$( "tr:odd" ).css( "background-color", "green" );
	
}

function changeColorEvenOff() {
	
	$( "tr:even" ).css( "background-color", "#bbbbff" );
	
}

function changeColorOddOff() {
	
	$( "tr:odd" ).css( "background-color", "red" );
	
}