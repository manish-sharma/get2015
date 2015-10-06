function activateSubmit() 
{
	if(document.getElementById("acceptCondition").checked == true)
	{
		document.getElementById("submitButton").disabled = false;
	}
	else 
	{
		document.getElementById("submitButton").disabled = true;
	}
}
function validate()
 {
	if(document.getElementById("firstName").value.trim() == "")
	{
		alert("First Name Is Empty");
	} 
	
	if(document.getElementById("lastName").value.trim() == "") 
	{
		alert("Last Name Is Empty");
	}
	
	if(document.getElementById("passwd").value.length < 8 )
	{
		alert("Password Length should be greater than 8");
	}
	
	if(document.getElementById("passwd").value != document.getElementById("confirmPasswd").value) 
	{
		alert("Password & Confirm Password mismatch!!");
	}
	if(document.getElementById("state") == "Select State" || document.getElementById("city").value == "Select City" ) 
	{
		alert("State or City are not Selected!!");
	}
	else 
	{
		alert(document.getElementById("textBox").value);
	}
	
}
function createCity() 
{
	var cityObject = document.getElementById("city");
	var stateObject = document.getElementById("state");
	switch(stateObject.value) {
		case "Rajasthan" :
			cityObject.innerHTML = "<Option>Jaipur</option><Option>Bikaner</option><Option>Kota</option><Option>Ajmer</option>";
			break;
		case "MP" :
			cityObject.innerHTML = "<Option>Bilaspur</option><Option>Bhopal</option><Option>Gwalior</option><Option>Mandi</option>";
			break;
		case "UP" :
			cityObject.innerHTML = "<Option>Agra</option><Option>Kanpur</option><Option>Aligarh</option><Option>Mathura</option>";
			break;
		case "Maharastra":
			cityObject.innerHTML = "<Option>Mumbai</option><Option>Pune</option><Option>Aurangabad</option><Option>Thane</option>";
			break;
	}
}
		