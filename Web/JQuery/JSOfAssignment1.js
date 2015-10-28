function hide() {
    document.getElementById("span").style.visibility = "hidden";
}

function show() {
    document.getElementById("span").style.visibility = "visible";
}

function showhide(){
	if(document.getElementById("span").style.visibility == "visible"){
		document.getElementById("span").style.visibility = "hidden";
		document.getElementById("showhide").value = "show";
	}
	else{
		
		document.getElementById("span").style.visibility = "visible";
		document.getElementById("showhide").value = "Hide";
	}
	
}