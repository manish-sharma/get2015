    function setCities() {
			var cityObj = document.getElementById("cities");
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