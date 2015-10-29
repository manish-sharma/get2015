function toggle() {
	if(document.getElementById("button3").value == "Show") {
		document.getElementById("sampleText").style.visibility="visible";
		document.getElementById("button3").value="Hide";
	} else {
		document.getElementById("sampleText").style.visibility="hidden";
		document.getElementById("button3").value="Show";
	}
}

function show() {
		document.getElementById("sampleText").style.visibility="visible";
		document.getElementById("button3").value="Hide";
}

function hide() {
		document.getElementById("sampleText").style.visibility="hidden";
		document.getElementById("button3").value="Show";
}
