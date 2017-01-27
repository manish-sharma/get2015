function myfun1() {
   
	document.getElementById("span").style.visibility = "visible";
	document.getElementById("button1").disabled = true;
	document.getElementById("button2").disabled = false;
	document.getElementById("button3").innerHTML = "Hide";
	
}
function myfun2() {
    
	document.getElementById("span").style.visibility = "hidden";
	document.getElementById("button2").disabled = true;
	document.getElementById("button1").disabled = false;
	document.getElementById("button3").innerHTML = "Show";
}

function myfun3() {
	
	if(document.getElementById("button3").innerHTML == "Show"){
		document.getElementById("span").style.visibility = "visible";
		document.getElementById("button1").disabled = true;
		document.getElementById("button2").disabled = false;
		document.getElementById("button3").innerHTML = "Hide";
		
	}
	else{
		
		document.getElementById("span").style.visibility = "hidden";
		document.getElementById("button2").disabled = true;
		document.getElementById("button1").disabled = false;
		document.getElementById("button3").innerHTML = "Show";
		
	}
}



