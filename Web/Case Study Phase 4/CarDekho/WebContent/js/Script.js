
/** Function to active search button */
function activeSearch() 
{
	var x = document.getElementById("searchList").value;
	if(x != "") 
	{
		document.getElementById("submitSearch").disabled = false;
	}
}

/** Function to active login button */
function activeLogin() 
{	
	var x = document.getElementById("username").value;
	var y = document.getElementById("password").value;
	if(x != "" && y != "")
	{
		document.getElementById("submitLogin").disabled = false;
	}
}