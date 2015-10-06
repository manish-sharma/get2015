// Validation for Checking all the conditions
function validate() {
	var count = 0;
	var password = document.getElementById("password").value;
	// Password Verification
	if (password.length < 8) {
		count = 1;
		alert("Password Length should be greater than 8");
	}
	var confirmPassword = document.getElementById("confirmPassword").value;
	// Matching The Password and Confirm Password
	if (confirmPassword != password) {
		count = 1;
		alert("Password mismatch!!");
	}
	// Checking the Conditions if user account created or not
	if (count == 0) {
		alert("User account created successfully");
		return true;
	} else {

		return false;
	}
}

// to provide options for city based on state value
function selectCity() {
	var cityObject = document.getElementById("city");
	var stateObject = document.getElementById("state");
	switch (stateObject.value) {
	case "Rajasthan":
		cityObject.innerHTML = "<Option>Jaipur</option><Option>Bikaner</option><Option>Kota</option><Option>Ajmer</option>";
		break;
	case "MP":
		cityObject.innerHTML = "<Option>Bilaspur</option><Option>Bhopal</option><Option>Gwalior</option><Option>Mandi</option>";
		break;
	case "UP":
		cityObject.innerHTML = "<Option>Agra</option><Option>Kanpur</option><Option>Aligarh</option><Option>Mathura</option>";
		break;
	case "Maharastra":
		cityObject.innerHTML = "<Option>Mumbai</option><Option>Pune</option><Option>Aurangabad</option><Option>Thane</option>";
		break;
	}
}

// Validation for Activating The Submit Button
function activateSubmit() {
	var checkbox = document.getElementById("checkbox");
	var submit = document.getElementById("submit");
	if (checkbox.checked == true) {
		submit.disabled = false;
	} else {
		submit.disabled = true;
	}
}