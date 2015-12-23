var states = new Array();
	   states['MP'] = new Array('Guna','Gwalior','Indore');
	   states['RJ'] = new Array('Kota','Jaipur','Jodhpur');
	   states['UP'] = new Array('Lakhanu','Agra','Mathura');
	   var isValidPass;
	   var isPassMatch;
	   function createenable() {
	       if(document.getElementById("chekbox1").checked == true) {
	       document.getElementById("button1").disabled = false;     
	      }
		  else {
		     document.getElementById("button1").disabled = true;
		  }
	   }
	   
	   function isValidPassword()
	   {
	     var password = document.getElementById("pass1").value;
		 if(password.length < 8)
           {  
		      alert("Password should be contains minimum 8 charecters");
			  isValidPass=false;
			  return 0;
		   }	
           isValidPass=true;		   
	   }
	   
	   function equalPassword()
	   {  
	       var password1 = document.getElementById("pass1").value;
	       var password2 = document.getElementById("pass2").value;
		   if(password1 != password2)
		      {
		         alert("Password is not matched");
				 isPassMatch=false;
				 return 0;
		      }
		 isPassMatch=true;

	   }
	   
	   function setCities(){
	      var element = document.getElementById("state");
		  var state = element.options[element.selectedIndex].value;
		  document.getElementById("city");
		  var htmlStatement;
		  for(var i=0; i< states[state].length; i++) 
		  {  var ct = states[state][i]; 
		      htmlStatement = htmlStatement+"<option value='"+ct+"'>"+ct+"</option> ";
		  }
		  document.getElementById("city").innerHTML = htmlStatement;
          document.getElementById("city").disabled = false;		  
	   }
	   function finalAlert()
	   {  
	      if(isValidPass && isPassMatch) {
	         alert("User Created Successfully");
		  }
		  else {
		     alert("Entered information is not valid");
		  }
	   }