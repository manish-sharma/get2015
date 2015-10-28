/**
 * function to show span content
 */
function show() {
	var s = document.getElementById("span").style.visibility = "visible";
	myButton.value = "hide";
}

/**
 * function to hide span content
 */
function hide() {
	var h = document.getElementById("span").style.visibility = "hidden";
	myButton.value = "show";
}

/**
 * Show or hide button depending on the span state
 */
function change(){
	if(document.getElementById("myButton").value == "hide")
		hide();
	else
		show();
}
