        function searchNewCar(){
			var type= document.getElementById("dropDown").value;
		      
				if(type == "1"){
					window.open("AllCar.html","_self");
				}else if(type == "Hetchback"){
					window.open("Hetchback1.html","_self");
				}else if(type == "Sedans"){
					window.open("Sedans1.html","_self");
				}else if(type == "SUV"){
					window.open("SUV1.html","_self");
				}else {
				window.open("Luxury1.html","_self");
				}
		}
		function searchNewCar1(){
			var type= document.getElementById("dropDown").value;
		      
				if(type == "1"){
					window.open("AllCars.html","_self");
				}else if(type == "Hetchback"){
					window.open("Hetchback.html","_self");
				}else if(type == "Sedans"){
					window.open("Sedans.html","_self");
				}else if(type == "SUV"){
					window.open("SUV.html","_self");
				}else {
				window.open("Luxury.html","_self");
				}
		}
		
		function isAdmin(){
			var Userid= document.getElementById("userid").value;
			var Password= document.getElementById("password").value;
			
			if(Userid == "" ){
				alert("Enter user id" );
			}else if ( Password == "" ){
				alert("Enter password");
			}else if(Userid != "admin" ){
				alert("User ID not valid only admin can login");
			}else if(Password != "1234"){
				alert("PassWord Incorrect");
		    }
			else{
				window.open("create.html","_self");
				
			}
		}
		function isEdit(){
			var Millage =document.getElementById("millage").value;
			var EngineInCC =document.getElementById("engineInCC").value;
			var FuelCapacity =document.getElementById("FuelCapacity").value;
			var Price =document.getElementById("price").value;
			var RoadTax =document.getElementById("roadTax").value;
			var AccessoryKit =document.getElementById("accessoryKit").value;
			var AC =document.getElementById("AC").value;
			var flag =true;
			if(Millage < 1 ){
				flag =false;	
			}else if(EngineInCC < 1){
				flag =false;	
			}else if(FuelCapacity < 1){
				flag =false;	
			}else if(Price < 1){
				flag =false;	
			}else if(RoadTax < 1){
				flag =false;	
			}else if(AccessoryKit == ""){
				flag =false;	
			}else if(AC == ""){
				flag =false;	
			}else{
				alert("SubmitSuccessfully")
			}
           
		
            if(flag == false){
			alert("Enter all values");
		}
		}
		function isCreate(){
			var Make =document.getElementById("make").value;
			var Model =document.getElementById("model").value;
			var Millage =document.getElementById("millage").value;
			var EngineInCC =document.getElementById("engineInCC").value;
			var FuelCapacity =document.getElementById("FuelCapacity").value;
			var Price =document.getElementById("price").value;
			var RoadTax =document.getElementById("roadTax").value;
			var AccessoryKit =document.getElementById("accessoryKit").value;
			var AC =document.getElementById("AC").value;
			var PowerSteering =document.getElementById("PowerSteering").value;
			var flag =true;
			if(Millage < 1 ){
				flag =false;	
			}else if(EngineInCC < 1){
				flag =false;	
			}else if(FuelCapacity < 1){
				flag =false;	
			}else if(Price < 1){
				flag =false;	
			}else if(RoadTax < 1){
				flag =false;	
			}else if(AccessoryKit == ""){
				flag =false;	
			}else if(AC ==  "1"){
				alert("Select true or false");
				flag =false;	
			}else if(PowerSteering ==  "1"){
				flag =false;	
				alert("Select true or false");
			}else{
				alert("Create Successfully")
			
			}
           
		
            if(flag == false){
			alert("Enter all values");
		}
		}
		function sendMail(){
			var re = /[A-Z0-9._%+-]+@[A-Z0-9.-]+.[A-Z]{2,4}/igm;
			var Name= document.getElementById("name").value;
			var Email= document.getElementById("email").value;
			var Message= document.getElementById("message").value;
			var bool = re.test(Email);
			
			if(Name == ""){
			alert("Enter your Name");
		}else if(Email == ""){
			alert("Enter your mail");
		}else if(Message == ""){
			alert("Enter your message");
		}else if(!bool){
			alert("Enter valid Email")
		}else{
			alert("your mail sent");
		}
		}
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