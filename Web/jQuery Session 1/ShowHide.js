function show() {
	document.getElementById("name").style.visibility = "visible";
}

function hide() {
	document.getElementById("name").style.visibility = "hidden";
}

function showHide() {
	if (document.getElementById("name").style.visibility == "visible") {
		document.getElementById("name").style.visibility = "hidden";
		document.getElementById("showHideButton").value = "Show";
	} else {
		document.getElementById("name").style.visibility = "visible";
		document.getElementById("showHideButton").value = "Hide";
	}
}