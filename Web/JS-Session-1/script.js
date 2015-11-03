//Validation for Activating The Submit Button
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
// Validation for Checking all the conditions
function validate()
 {
	var count=0;
	// First name Validation
	if(document.getElementById("firstName").value.trim() == "")
	{
		count=1;
		alert("First Name Is Empty");
	} 
	// lastName Validation
	if(document.getElementById("lastName").value.trim() == "") 
	{
		count=1;
		alert("Last Name Is Empty");
	}
	// Password Verfication
	if(document.getElementById("password").value.length < 8 )
	{
		count=1;
		alert("Password Length should be greater than 8");
	}
	// Matching The Password and Confirm Password
	if(document.getElementById("password").value != document.getElementById("confirmPassword").value) 
	{
		count=1;
		alert("Password & Confirm Password mismatch!!");
	}
	// Selecting the States
	if(document.getElementById("state") == "Select State" || document.getElementById("city").value == "Select City" ) 
	{
		count=1;
		alert("State or City are not Selected!!");
	}
	// Checking the Conditions if user created or not
	if(count==0)
	{
		alert("USER CREATED SUCCESSFUL");
	}
	else 
	{
		alert(document.getElementById("textBox").value);
	}
	
}
// function to create The city
function createCity() 
{
	var cityObject = document.getElementById("city");
	var stateObject = document.getElementById("state");
	switch(stateObject.value) 
	{
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


	