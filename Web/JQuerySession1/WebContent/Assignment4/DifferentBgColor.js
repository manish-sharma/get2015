/**
 * call to init function 
 */
$(document).ready(init);

/**
 * function init to set even and odd row color 
 */
function init() { 
	$("table#table1 tr:even").css("background-color", "#b6e1ae"); 
	$("table#table1 tr:odd").css("background-color", "#FFFFD1");
}