/**
 * Java script file 
 * contains validation related modules 
 */

function validate() {
	if(document.getElementById('name').value.trim() == "") {
		document.getElementById('nameError').innerHTML = "Please Enter name!!";
		return false;
	}
	else
		document.getElementById('nameError').innerHTML = "";
	
	if(document.getElementById('password').value.trim() == "") {
		document.getElementById('passwordError').innerHTML = "Please Enter Password!!";
		return false;
	}
	else
		document.getElementById('passwordError').innerHTML = "";
	
	if(document.getElementById('cPassword').value.trim() == "") {
		document.getElementById('cPasswordError').innerHTML = "Please Confirm Password!!";
		return false;
	}
	else
		document.getElementById('cPasswordError').innerHTML = "";
		
	
	if(document.getElementById('email').value.trim() == "") {
		document.getElementById('email').innerHTML = "Please Enter email!!";
		return false;
	}
	else 
		document.getElementById('email').innerHTML = "";
		
	
	if(document.getElementById('pNumber').value.trim() == "") {
		document.getElementById('pNumberError').innerHTML = "Please Enter Phone Number!!";
		return false;
	}
	else
		document.getElementById('pNumberError').innerHTML = "";
	
	if(document.getElementById('cPaswword').value.trim() != document.getElementById('password').value.trim()) {
		document.getElementById('cPasswordError').innerHTML = "Password and Confirm Password Mismatch!! ";
		return false;
	}
	else
		document.getElementById('cPassowrdError').innerHTML = "";
	
	alert("Form submitted Successfully!!")
	return true;
}