
function activeSearch() 
{
	var x = document.getElementById("searchList").value;
	if(x != "") 
	{
		document.getElementById("submitSearch").disabled = false;
	}
}

function activeLogin() 
{	
	var x = document.getElementById("username").value;
	var y = document.getElementById("password").value;
	if(x != "" && y != "")
	{
		document.getElementById("submitLogin").disabled = false;
	}
}