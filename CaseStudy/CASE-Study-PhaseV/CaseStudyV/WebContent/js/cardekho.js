function enableSearch()
{
	var bt = document.getElementById("searchbutton");
	bt.disabled=false;
	bt.style.backgroundColor="brown";
	bt.style.backgroundColor="white";
}
	 
function validateForm() {
    var x = document.forms["myform"]["make"].value;
    if (x == null || x == "") {
        alert("make must be filled out");
        return false;
    }
    
    x = document.forms["myform"]["model"].value;
    if (x == null || x == "") {
        alert("model must be filled out");
        return false;
    }
    
    x = document.forms["myform"]["engincc"].value;
    if (x == null || x == "") {
        alert("engincc must be filled out");
        return false;
    }
    x = document.forms["myform"]["capacity"].value;
    if (x == null || x == "") {
        alert("capacity must be filled out");
        return false;
    }
    x = document.forms["myform"]["milage"].value;
    if (x == null || x == "") {
        alert("milage must be filled out");
        return false;
    }
    x = document.forms["myform"]["price"].value;
    if (x == null || x == "") {
        alert("price must be filled out");
        return false;
    }
    x = document.forms["myform"]["roadtax"].value;
    if (x == null || x == "") {
        alert("roadtax must be filled out");
        return false;
    }
    x = document.forms["myform"]["ac"].value;
    if (x == null || x == "") {
        alert("ac must be selected");
        return false;
    }
    x = document.forms["myform"]["accesorykit"].value;
    if (x == null || x == "") {
        alert("accesorykit must be selected");
        return false;
    }
    x = document.forms["myform"]["powersteering"].value;
    if (x == null || x == "") {
        alert("powersteering must be selected");
        return false;
    }
}
	  