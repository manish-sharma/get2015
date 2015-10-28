/**
 * call to init function having all other functions
 */
$(document).ready(init);

/**
 * init function having all other functions
 */
function init(){	
	 $("#buttonForSiblings").click(siblings1);   
	 $("#buttonForNext").click(next1);
	 $("#buttonForNextAll").click(nextAll1);
	 $("#buttonForNextUntil").click(nextUntil1);
	 $("#buttonForPrev").click(prev1);
	 $("#buttonForPervAll").click(prevAll1);
	 $("#buttonForPrevUntil").click(prevUntil1);	    
}

/**
 * function traversing siblings of particular element
 */
function siblings1(){
	$("div").children().css({"color": "lightgrey", "background-color":"#ffffff", "border": "2px solid lightgrey"});
	$("h3").siblings().css({"color": "red", "background-color":"yellow", "border": "2px solid red"});
}

/**
 * function traversing next element of particular element
 */
function next1(){
	$("div").children().css({"color": "lightgrey", "background-color":"#ffffff",  "border": "2px solid lightgrey"});
	$("h3").next().css({"color": "red", "background-color":"yellow", "border": "2px solid red"});
} 

/**
 * function traversing all next element from particular element
 */
function nextAll1(){
	$("div").children().css({"color": "lightgrey",  "background-color":"#ffffff", "border": "2px solid lightgrey"});
	$("h3").nextAll().css({"color": "red", "background-color":"yellow", "border": "2px solid red"});
}

/**
 * function traversing all next element from particular element until particular element
 */
function nextUntil1(){
	$("div").children().css({"color": "lightgrey",  "background-color":"#ffffff", "border": "2px solid lightgrey"});
	$("h3").nextUntil("h5").css({"color": "red", "background-color":"yellow", "border": "2px solid red"});
}

/**
 * function traversing previous element of particular element
 */
function prev1(){
	$("div").children().css({"color": "lightgrey", "background-color":"#ffffff",  "border": "2px solid lightgrey"});
	$("h3").prev().css({"color": "red", "background-color":"yellow", "border": "2px solid red"});
}

/**
 * function traversing all previous element from particular element
 */
function prevAll1(){
	$("div").children().css({"color": "lightgrey",  "background-color":"#ffffff", "border": "2px solid lightgrey"});
	$("h3").prevAll().css({"color": "red", "background-color":"yellow", "border": "2px solid red"});
}

/**
 * function traversing all previous element from particular element until particular element
 */
function prevUntil1(){
	$("div").children().css({"color": "lightgrey", "background-color":"#ffffff",  "border": "2px solid lightgrey"});
	$("h3").prevUntil("span").css({"color": "red", "background-color":"yellow", "border": "2px solid red"});
}