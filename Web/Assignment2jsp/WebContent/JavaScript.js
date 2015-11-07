function validate()
 {
	 var flag = true;
	if(document.getElementById("userName").value.trim() == "") 
	{
		document.getElementById("uName").innerHTML="Enter last name";
	    flag=false;
	}
	
	if(document.getElementById("password").value.length < 8 || document.getElementById("password")== "")
	{
		document.getElementById("passwordValue").innerHTML="Password Length should be greater than 8";
	     flag=false;
	}
	return flag;
}