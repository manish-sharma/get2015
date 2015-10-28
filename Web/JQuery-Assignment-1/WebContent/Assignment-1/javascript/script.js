function  buttonAction(val) {
	if(val=="HIDE")
		{
			document.getElementById("button").value="SHOW";
			document.getElementById("span").style.display="none";
		}
	else if (val=="SHOW") {
			document.getElementById("button").value="HIDE";
			document.getElementById("span").style.display="";
	}
} 