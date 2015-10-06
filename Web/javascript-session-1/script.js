function activateSubmit() {
	if(document.getElementById("acceptCondition").checked == true) {
		document.getElementById("submitButton").disabled = false;
	}
	else {
		document.getElementById("submitButton").disabled = true;
	}
}
function validate() {
	if(document.getElementById("firstName").value.trim() == "") {
		alert("First Name Is Empty");
	} 
	
	if(document.getElementById("lastName").value.trim() == "") {
		alert("Last Name Is Empty");
	}
	
	if(document.getElementById("passwd").value.length < 8 ){
		alert("Password Length should be greater than 8");
	}
	
	if(document.getElementById("passwd").value != document.getElementById("confirmPasswd").value) {
		alert("Password & Confirm Password mismatch!!");
	}
	if(document.getElementById("state").selectedIndex == 0 || document.getElementById("city").selectedIndex == 0 ) {
		alert("State or City are not Selected!!");
	}
	else {
		alert(document.getElementById("textBox").value);
	}
	
}
function createCity() {
	var cityObject = document.getElementById("city");
	var stateObject = document.getElementById("state");
	switch(stateObject.value) {
		case "Rajsthan" :
			cityObject.innerHTML = "<Option value='Jaipur'>Jaipur</option><Option value='Bikaner'>Bikaner</option><Option value='Kota'>Kota</option><Option value='Ajmer'>Ajmer</option>";
			break;
		case "MP" :
			cityObject.innerHTML = "<Option value='Bilaspur'>Bilaspur</option><Option value='Bhopal'>Bhopal</option><Option value='Gwalior'>Gwalior</option><Option value='Mandi'>Mandi</option>";
			break;
		case "UP" :
			cityObject.innerHTML = "<Option value='Agra'>Agra</option><Option value='Kanpur'>Kanpur</option><Option value='Aligarh'>Aligarh</option><Option value='Mathura'>Mathura</option>";
			break;
		case "Maharastra":
			cityObject.innerHTML = "<Option value='Mumbai'>Mumbai</option><Option value='Pune'>Pune</option><Option value='Aurangabad'>Aurangabad</option><Option value='Thane'>Thane</option>";
			break;
	}
}
		