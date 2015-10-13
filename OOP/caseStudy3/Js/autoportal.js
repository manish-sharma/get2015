function addMake(){
var type1=document.getElementById("brand");
var type2=document.getElementById("budget");
if(type1.checked==true){
var a=document.getElementById("make");
a.length=1;
var car=["BMW","JAGUAR"];
for(var i=0;i<car.length;i++){
var option=document.createElement("option");
option.text=car[i];
option.value=car[i];
a.add(option);
}
}
else{
var a=document.getElementById("make");
a.length=1;
var lowerprice=["50000","60000","700000"];
for(var i=0;i<lowerprice.length;i++){
var option=document.createElement("option");
option.text=lowerprice[i];
option.value=lowerprice[i];
a.add(option);
}
}
}

function addModels(){

var a=document.getElementById("make");
var b=document.getElementById("model");
b.length=1;
if(isNaN(a)==true){
var carBMW=["x1","X2","X3"];
var carJaguar=["J1","J2","J3"];
if(a.value=="BMW"){
for(var i=0;i<carBMW.length;i++){
var option=document.createElement("option");
option.text=carBMW[i];
option.value=carBMW[i];
b.add(option);
}
}
else if(a.value=="JAGUAR"){
for(var i=0;i<carJaguar.length;i++){
var option=document.createElement("option");
option.text=carJaguar[i];
option.value=carJaguar[i];
b.add(option);
}	
}
}
else{
		alert("aaaa");
	var higherprice=["150000","160000","1700000"];

for(var i=0;i<higherprice.length;i++){
	if(higherprice[i]>a.value){
var option=document.createElement("option");
option.text=higherprice[i];
option.value=higherprice[i];
a.add(option);
	}
}
}
}

function validate(){
	var a=document.getElementById("email");
	var b=document.getElementById("pwd");
	if(a.value!="riddhi@gmail.com"){
		alert("Only admin access allowed");
		return false;
	}
	if(b.value!="riddhi"){
		alert("Password doesnt match");
		return false;
	}
	return true;
}

function validateContact(){
	var a=document.getElementById("name");
	var b=document.getElementById("email");
	var c=document.getElementById("phone");
	var d=document.getElementById("sub");
	if(a.value==""){
		alert("Enter name");
		return false;
	}
	if(b.value==""){
		alert("Enter email");
		return false;
	}
	if(c.value==""){
		alert("Enter phone number");
		return false;
	}
	if(d.value==""){
		alert("Enter subject");
		return false;
	}
	return true;
}

