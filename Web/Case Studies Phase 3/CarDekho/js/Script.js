function searchScript1() {	
	document.getElementById("submitSearch").disabled = true;
	document.getElementById("searchMake").innerHTML = "Make";
	document.getElementById("searchModel").innerHTML = "Model";
	document.getElementById("firstList").innerHTML = "<option value = ''>- - Select Make - -</option><option value = 'Hyundai'>Hyundai</option><option value = 'Porsche'>Porsche</option>";
	document.getElementById("secondList").innerHTML = "<option value = ''>- - Select Model - -</option>";
}

function searchScript2() {
	activeSearch();
	document.getElementById("submitSearch").disabled = true;
	document.getElementById("searchMake").innerHTML = "Min Price";
	document.getElementById("searchModel").innerHTML = "Max Price";
	document.getElementById("firstList").innerHTML = "<option value = ''>- - Select Min Price - -</option><option value = '1Lac'>1 Lac</option><option value = '2Lac'>2 Lac</option><option value = '3Lac'>3 Lac</option>";
	document.getElementById("secondList").innerHTML = "<option value = ''>- - Select Max Price - -</option><option value = '3Lac'>3 Lac</option><option value = '4Lac'>4 Lac</option><option value = '5Lac'>5 Lac</option>";
}
	
function selectModel1(make)
{
var Hyundai=["Hyundai EON", "Hyundai i10"];
var Porsche=["Porscha Macan", "Porsche911"];
var lac=["3lac", "4lac","5lac"];
var selectList = document.getElementById('secondList');
var length = selectList.length - 1;
while(length > 0)
	{
		selectList.remove(1);
		length--;
	}
var listArray;
switch(make)
{
	case "Hyundai":
	listArray=Hyundai;
	break;
	case "Porsche":
	listArray=Porsche;
	break;
	default:
	listArray=lac;
}
	for (i = 0; i < listArray.length; i++)
{
var option = document.createElement('option');
option.text = listArray[i];
option.value = listArray[i];
selectList.add(option);
}
activeSearch();
}

function activeSearch() 
{
	var x = document.getElementById("firstList").value;
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

function validateLogin()
{	
	var flag = false;
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;
	if(username=="amit")
	{
		if(password=="amit")
		{
			flag = true;
		}
	}
	if(flag == false) {
		alert("Invalid Username or password");
	}
	return flag;
}