
function activeSearch() 
{
	var x = document.getElementById("searchListBudget").value;
	var y = document.getElementById("searchListBrand").value;
	if(x != "") 
	{
		document.getElementById("submitSearch").disabled = false;
	}
	else if( y != "")
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

function searchScript1()
{
	document.getElementById("budgetSearch").style.display = "none";
	document.getElementById("brandSearch").style.display = "block";
	document.getElementById("budgetBrand").value = "brand";
}

function searchScript2()
{
	document.getElementById("brandSearch").style.display = "none";
	document.getElementById("budgetSearch").style.display = "block";
	document.getElementById("budgetBrand").value = "budget";
}