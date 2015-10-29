function validate(){

if(validateFirstName() && validateLastName() && checkPassword() && checkRePassword() && age()){
alert("User Created Successfully");
return true;
}
return false;
}

function validateFirstName(){
var c=document.getElementById("firstname").value;
if(c==""){
alert("First Name must not be null");
return false;
}
return true;
}

function validateLastName(){
var c=document.getElementById("lastname").value;
if(c==""){
alert("Last Name must not be null");
return false;
}
return true;
}

function checkPassword(){

var d=document.getElementById("pwd").value;
if(d.length<8){
alert("Password should contain minimum 8 characters");
return false;
}
return true;
}

function checkRePassword(){
var d=document.getElementById("repwd").value;
var e=document.getElementById("pwd").value;
if(d!=e || d==""){
alert("Password should be same");
return false;
}
return true;
}

function age(){
var d=document.getElementById("age").value;
var filter = /^[0-9]+(.[0-9]{1,2})?$/;
	if (!filter.test(d)) {
alert("Enter a valid age");
return false;
}
return true;
}

function undisableBtn() {
 var checker = document.getElementById('check');
 if(checker.checked==true){
    document.getElementById("button").disabled = false;
	}else{
	document.getElementById("button").disabled = true;
	}
}


function combobox(){

var a=document.getElementById("state").value;
var x = document.getElementById("city");
document.getElementById("city").options.length = 1;
switch(a)
{
case 'Rajasthan':
    var option = document.createElement("option");
    option.text = "Jaipur";
    x.add(option);
	var option = document.createElement("option");
	option.text = "Ajmer";
    x.add(option);
	break;
	
case 'Gujarat':
	var option = document.createElement("option");
    option.text = "Ahemdabad";
    x.add(option);
	var option = document.createElement("option");
    option.text = "Surat";
    x.add(option);
	break;
	
case 'Uttar Pradesh':
	var option = document.createElement("option");
    option.text = "Gaziabad";
    x.add(option);
	break;

}
}