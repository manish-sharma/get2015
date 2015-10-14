/**
 * Assignment-1
 * Write a user registration application:
 * 1. Contains a user registration information form (JSP page) that requests a servlet.
 * 2. Contains a servlet that accepts the request sent by client and persists the information in the database tables.
 */
/**
 * Function to enable and disable submit button
 */
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

/**
 * Function to select city according to state.
 */
function createCity() 
{
	var cityObject = document.getElementById("city");
	var stateObject = document.getElementById("states");
	switch(stateObject.value) {
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
		case "Punjab":
			cityObject.innerHTML = "<Option>Amritsar</option><Option>Jalandhar</option><Option>Patiala</option><Option>chandigarh</option>";
			break;
	}
}


