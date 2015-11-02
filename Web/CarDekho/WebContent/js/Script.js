/*function searchScript1() {	
	document.getElementById("SearchCar").innerHTML = ;
	document.getElementById("searchModel").innerHTML = "Model";
	document.getElementById("searchList").innerHTML = "<option value = ''>- - Select Make - -</option><option value = 'Hyundai'>Hyundai</option><option value = 'Porsche'>Porsche</option>";
	document.getElementById("secondList").innerHTML = "<option value = ''>- - Select Model - -</option>";
}

function searchScript2() {
	activeSearch();
	document.getElementById("submitSearch").disabled = true;
	document.getElementById("searchMake").innerHTML = "Min Price";
	document.getElementById("searchModel").innerHTML = "Max Price";
	document.getElementById("firstList").innerHTML = "<option value = ''>- - Select Min Price - -</option><option value = '1Lac'>1 Lac</option><option value = '2Lac'>2 Lac</option><option value = '3Lac'>3 Lac</option>";
	document.getElementById("secondList").innerHTML = "<option value = ''>- - Select Max Price - -</option><option value = '3Lac'>3 Lac</option><option value = '4Lac'>4 Lac</option><option value = '5Lac'>5 Lac</option>";
}*/
	
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