function selectCity() {
	
	var stateObject = document.getElementById("state");
	var cityObject = document.getElementById("city");
	cityObject.disabled = false;
	switch(stateObject.value) {
		case 'Rajasthan' :
			cityObject.innerHTML = "<option  selected='selected' disabled value='null'>Select</option> <option>Jaipur</option> <option>Ajmer</option> <option>Kota</option>";
			break;
		
		case 'UP' :
			cityObject.innerHTML = "<option>Agra</option> <option>Kanpur</option> <option>Lucknow</option>";
			break;
			
		case 'MP' :
			cityObject.innerHTML = "<option>Bhopal</option> <option>Bhind</option> <option>Indore</option>";
			break;
		
		case 'Maharastra' :
			cityObject.innerHTML = "<option>Mumbai</option> <option>Nagpur</option> <option>Pune</option>";
			break;	
	}
	
}

function selectBox() {
	var acceptObject = document.getElementById("accept");
	
	var submitObject = document.getElementById("submit");
	
	if(acceptObject.checked) {
		submitObject.disabled = false;
	}
	else {
		submitObject.disabled = true;
	}
}

function validation() {
	var fnameObject	= document.getElementById("fname").value;
	var lnameObject = document.getElementById("lname").value;
	var passwordObject = document.getElementById("pass").value;
	var rpasswordObject = document.getElementById("ConfirmPassword").value;
	var ageObject = document.getElementById("age").value;
	var stateObject = document.getElementById("state").value;
	var cityObject = document.getElementById("city").value;
	var addressLine1Object = document.getElementById("addressLine1").value;
	
	alert(stateObject);
	if(!fnameObject) {
		alert("Please Enter First Name");
	}
	else if(!lnameObject){
		alert("Please Enter Last Name");
	}
	else if(!passwordObject){
		alert("Please Enter password");
	}
	else if(!rpasswordObject){
		alert("Please Enter Repeat Password");
	} 
	else if(passwordObject!=rpasswordObject){
		alert("Repeat Password Not Matched");
	}
	else if(!ageObject) {
		alert("Please Enter Age");
	}
	else if(stateObject=="null") {
		alert("Please Select State");
	}
	else if(cityObject=="null") {
		alert("Please Select City");
	}
	else if(!addressLine1Object){
		alert("Please Enter Street Address");
	}	
}