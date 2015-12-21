



function activateSubmit() 
{
	if(document.getElementById("acceptCondition").checked == true)
	{
		document.getElementById("button").disabled = false;
	}
	else 
	{
		document.getElementById("button").disabled = true;
	}
}
function validate()
 {
	 var flag = true;
	if(document.getElementById("firstName").value.trim() == "")
	{
		document.getElementById("fname").innerHTML="Enter frist name";
		flag=false;
		
	} 
	else
	{	document.getElementById("fname").innerHTML="";
	
    }
	
	if(document.getElementById("lastName").value.trim() == "") 
	{
		document.getElementById("lname").innerHTML="Enter last name";
	    flag=false;
	}
	else
	{	document.getElementById("lname").innerHTML="";
	
    }
	
	if(document.getElementById("password").value.length < 8 )
	{
		document.getElementById("passwordvalue").innerHTML="Password Length should be greater than 8";
	     flag=false;
	}
	else
	{	document.getElementById("passwordvalue").innerHTML="";
	
    }
	
	if(document.getElementById("password").value != document.getElementById("conformpassword").value) 
	{  
      document.getElementById("cpasswordvalue").innerHTML="Password doesn't match";
	   flag=false;
	}
	else
	{	document.getElementById("cpasswordvalue").innerHTML="";
	
    }
	
	if(document.getElementById("states").value=="")
	{ 
       document.getElementById("statevalue").innerHTML="Please select state";
		flag=false;
	}
	else
	{	document.getElementById("statevalue").innerHTML="";
	
    }
	if(document.getElementById("cities").value=="") 
	{ 
     document.getElementById("cityvalue").innerHTML="Please select city";
	   flag=false;
	}
	else
	{	document.getElementById("cityvalue").innerHTML="";
	
    }
	if(document.getElementById("address").value=="")
	{
		document.getElementById("addressvalue").innerHTML="Please Enter Address";
	    flag=false;
	}
   else
	{	document.getElementById("addressvalue").innerHTML="";
	
    }
	if( document.getElementById("age").value=="")
	{
    	document.getElementById("agevalue").innerHTML="Please Enter age";
		flag=false;	
	}
   else
	{	document.getElementById("agevalue").innerHTML="";
	
    }
	if( document.getElementById("phoneNo").value.length!=10)
    {
	  	document.getElementById("phonevalue").innerHTML="PhoneNo contains 10 digits";
       flag=false;
	}
	else
	{	document.getElementById("phonevalue").innerHTML="";
	
    }
	
	if(flag== true)
	{
		alert("successfully submited");
		return true;
	}
	
return flag;
}
function createCity() 
{
	var cityObject = document.getElementById("city");
	
	var stateObject = document.getElementById("states");
	switch(stateObject.value) {
		case "Rajasthan" :
			cityObject.innerHTML = "<Option>Jaipur</option><Option>Bikaner</option><Option>Kota</option><Option>Ajmer</option>";
			break;
		case "gujarat" :
			cityObject.innerHTML = "<Option>Ahmedabad</option><Option>Surat</option><Option>Vadodara</option><Option>Rajkot</option>";
			break;
		case "Uttar pradesh" :
			cityObject.innerHTML = "<Option>Agra</option><Option>Kanpur</option><Option>Aligarh</option><Option>Mathura</option>";
			break;
		case "uttarakhand":
			cityObject.innerHTML = "<Option>Dehradun</option><Option>Haridwar</option><Option>Roorkee</option><Option>Rishikesh</option>";
			break;
	    case "Haryana":
			cityObject.innerHTML = "<Option>Bhiwani‎</option><Option>Gurgaon‎</option><Option>Kurukshetra</option><Option>Faridabad‎</option>";
			break;
		case "punjab":
			cityObject.innerHTML = "<Option>Amritsar</option><Option>Jalandhar</option><Option>Patiala</option><Option>chandigarh</option>";
			break;
	}
}


