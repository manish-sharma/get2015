function validate() {
	var a = document.getElementById("email");
	var b = document.getElementById("pwd");
	if (a.value == "") {
		alert("user name cant be blank");
		return false;
	}
	if (b.value = "") {
		alert("Password cant be blank");
		return false;
	}
	return true;
}

function validateContact() {
	var a = document.getElementById("name");
	var b = document.getElementById("email");
	var c = document.getElementById("phone");
	var d = document.getElementById("sub");
	if (a.value 	== "") {
		alert("Enter name");
		return false;
	}
	if (b.value == "") {
		alert("Enter email");
		return false;
	}
	if (c.value == "") {
		alert("Enter phone number");
		return false;
	}
	if (d.value == "") {
		alert("Enter subject");
		return false;
	}
	return true;
}

function addPriceMin(){
	document.getElementById("submit").disabled = false;
	var type1=document.getElementById("budget");
	if(type1.checked==true){
	var a=document.getElementById("make");
	a.length=0;
	var option=document.createElement("option");
	option.text="---Select Minimum---";
	a.add(option);
	var lowerprice=[50000,60000,700000];
	for(var i=0;i<lowerprice.length;i++){
	var option=document.createElement("option");
	option.text=lowerprice[i];
	option.value=lowerprice[i];
	a.add(option);
	}
	}
	}

function changePic(){
	var path = document.getElementById("photo");
	var fakePath = document.getElementById("uploadPhoto").value;
	var updatedPath = fakePath.substring(fakePath.lastIndexOf("\\"),fakePath.length);
	path.src = "images"+updatedPath;
}