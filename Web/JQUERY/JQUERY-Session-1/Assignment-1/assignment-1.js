function show(){
	//var TEXT = document.getElementById("text");
	//TEXT.style.visibility = "hidden";
//	var showButton = document.getElementById("show");
//	showButton.value = "jj";
    document.getElementById("text").style.visibility = "visible";
	document.getElementById("toggle").value = "Hide";
}
function hide(){
	document.getElementById("text").style.visibility = "hidden";
	document.getElementById("toggle").value = "Show";
	
}

function toggle(){
	var TEXT = document.getElementById("text");
	if(TEXT.style.visibility == "visible")
	{
		document.getElementById("text").style.visibility = "hidden";
	    document.getElementById("toggle").value = "Show";
		
	}
	else
	{
		document.getElementById("text").style.visibility = "visible";
	    document.getElementById("toggle").value = "Hide";
		
	}
	
	
}