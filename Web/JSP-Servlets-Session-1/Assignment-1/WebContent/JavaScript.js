//Activate Submit property
function activateSubmit() 
{
	if(document.getElementById("acceptCondition").checked == true)
	{
		document.getElementById("button").disabled = false;
	}
	else 
	{
		document.getElementById("button").disabled = true;
	}
}
//Create city by selecting
function createCity() 
{
	var cityObject = document.getElementById("city");
	var stateObject = document.getElementById("states");
	switch(stateObject.value) 
	{
		case "Rajasthan" :
			cityObject.innerHTML = "<Option>Jaipur</option><Option>Bikaner</option><Option>Kota</option><Option>Ajmer</option>";
			break;
			
		case "Gujrat" :
			cityObject.innerHTML = "<Option>Ahmedabad</option><Option>Surat</option><Option>Vadodara</option><Option>Rajkot</option>";
			break;
			
		case "Uttar Pradesh" :
			cityObject.innerHTML = "<Option>Agra</option><Option>Kanpur</option><Option>Aligarh</option><Option>Mathura</option>";
			break;
			
		case "Uttarakhand":
			cityObject.innerHTML = "<Option>Dehradun</option><Option>Haridwar</option><Option>Roorkee</option><Option>Rishikesh</option>";
			break;
			
		case "Punjab":
			cityObject.innerHTML = "<Option>Amritsar</option><Option>Jalandhar</option><Option>Patiala</option><Option>chandigarh</option>";
			break;
	}
}

//Validation of the numeric Case
var specialKeys = new Array();
specialKeys.push(8);
function IsNumeric(e,input) 
{
	var keyCode = e.which ? e.which : e.keyCode;
	var ret = ((keyCode >= 48 && keyCode <= 57) || specialKeys.indexOf(keyCode)
			!= -1);
	if (input.value < 0)
	{
		ret =false;
	}
	if (input.value > 100)
	{
		ret = false;
	}
	document.getElementById("error").style.display = ret ? "none" : "inline";
	return ret;
}