/**
 * call to init function having all other functions
 */
$(document).ready(init);

/**
 * init function having all other functions
 */
function init(){
	$("#hide").on('click',hide1);    
    $("#show").on('click',show1);     
    $("#myButton").on('click',myButton1);   
}

/**
 * function to hide span content
 */
function hide1(){
    $("#span").hide();
    $('#myButton').val('show');
}

/**
 * function to show span content
 */
function show1(){
    $("#span").show();
    $('#myButton').val('hide');
}

/**
 * Show or hide button depending on the span state
 */
function myButton1(){
	if($('#myButton').val() == 'hide'){
		 $(hide1());
	}
	else
		 $(show1());
}