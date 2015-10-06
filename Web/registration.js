	function validate() {
		if (document.getElementById("fname").value == "") {
			alert("First Name can not be empty");
		}
		else if (document.getElementById("lname").value == "") {
			alert("Last Name can not be empty");
		}
		else if (document.getElementById("pass").value == "") {
			alert("Password can not be empty");
		}
		else if ( (document.getElementById("pass").value.length < 8 )) {
			alert("Password must be 8 character long");
		}
		else if (document.getElementById("pass").value != document.getElementById("repass").value) {
			alert("Password and re-enter password must be same");
		}
		else if (document.getElementById("age").value == "") {
			alert("Age can not be empty");
		}
		else if (document.getElementById("age").value < 0 || document.getElementById("age").value > 100 ) {
			alert("Age must be between 0 to 100");
		}
		else if (document.getElementById("state").selectedIndex == 0) {
			alert("Please Select State");
		}
		else if (document.getElementById("city").selectedIndex == 0) {
			alert("Please Select City");
		}
		else {
			alert("You have successfully resisterd");
		}
	}
	function setCities() {
			var cityObj = document.getElementById("city");
			var stateObj = document.getElementById("state");
			switch(stateObj.value) {
			case "Rajasthan":
				cityObj.innerHTML = "<Option>Select City</Option><Option>Jaipur</Option><Option>Ajmer</Option><Option>Kota</Option><Option>Jodhpur</Option>";
				break;
			case "MP":
				cityObj.innerHTML = "<Option>Select City</Option><Option>Indor</Option><Option>Mandsor</Option><Option>Bhopal</Option><Option>Jodhpur</Option>";
				break;
			case "UP":
				cityObj.innerHTML = "<Option>Select City</Option><Option>Azam Gadh</Option><Option>Agra</Option><Option>Basti</Option><Option>Aligadh</Option>";
				break;
			case "Maharastra":
				cityObj.innerHTML = "<Option>Select City</Option><Option>Mumbai</Option><Option>Pune</Option><Option>Thane</Option><Option>Nagpur</Option>";
				break;
			}
	}
	function enable() {
		if(document.getElementById("cb").checked == 1)
			var c = document.getElementById("submit").disabled = false;
		else
			var c = document.getElementById("submit").disabled = true;
	}
