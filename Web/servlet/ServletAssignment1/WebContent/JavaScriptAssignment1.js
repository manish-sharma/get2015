



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

function createCity() 
{
	var cityObject = document.getElementById("city");
	
	var stateObject = document.getElementById("states");
	switch(stateObject.value) {
		case "Rajasthan" :
			cityObject.innerHTML = "<Option>Jaipur</option><Option>Bikaner</option><Option>Kota</option><Option>Ajmer</option>";
			break;
		case "gujarat" :
			cityObject.innerHTML = "<Option>Ahmedabad</option><Option>Surat</option><Option>Vadodara</option><Option>Rajkot</option>";
			break;
		case "Uttar pradesh" :
			cityObject.innerHTML = "<Option>Agra</option><Option>Kanpur</option><Option>Aligarh</option><Option>Mathura</option>";
			break;
		case "uttarakhand":
			cityObject.innerHTML = "<Option>Dehradun</option><Option>Haridwar</option><Option>Roorkee</option><Option>Rishikesh</option>";
			break;
	    case "Haryana":
			cityObject.innerHTML = "<Option>Bhiwani‎</option><Option>Gurgaon‎</option><Option>Kurukshetra</option><Option>Faridabad‎</option>";
			break;
		case "punjab":
			cityObject.innerHTML = "<Option>Amritsar</option><Option>Jalandhar</option><Option>Patiala</option><Option>chandigarh</option>";
			break;
	}
}


