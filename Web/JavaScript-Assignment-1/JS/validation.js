
	function validation(){

		 var fn=document.getElementById("fname").value;
		 var ln=document.getElementById("lname").value;
		 var p=document.getElementById("pwd").value;
		 var pc=document.getElementById("cpwd").value;
		

		 if(fn == ""){
			 alert("please fill first name");
		 }
		 else if(ln == ""){
			 alert("please fill last name");
		 }
		 else if(p == ""){
			 alert("please fill password");
		 }
		 else if(pc == ""){
			 alert("please fill confirm password");
		 }
		 
		 else if( p != pc){
			 alert("password doesn't match");
		 }
		
	}
	
	function disable(){
		if(document.registration.check.checked){
			document.registration.create.disabled=false;	
		}
		else{
			document.registration.create.disabled=true;
		}
		
	}
		
	function filter(){
		 var st=document.getElementById("state").value;
		 var ct=document.getElementById("city");
		
		 if(st== "rajasthan")
		 {
			 ct.innerHTML = "<option>--Select City--</option><option>Ajmer</option><option>Jaipur</option><option>Jodhpur</option><option>Kota</option>";
		 }
		 if(st == "mp")
		 {
			 ct.innerHTML = "<option>--Select City--</option><option>Gwalior</option><option>Bhopal</option>" ;
		 }
		 if(st == "up")
		 {
			 ct.innerHTML= "<option>--Select City--</option> <option>Agra</option><option>Jhansi</option><option>Mathura</option>";
		 }
		 if(st == "mahrashtra")
		 {
			 ct.innerHTML = "<option>--Select City--</option> <option>Mumbai</option> <option>Puna</option> <option>Navi Mumbai</option>";
		 }
		
	}