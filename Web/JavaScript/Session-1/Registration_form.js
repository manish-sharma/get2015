function myFunction()
{
	var check=true;
	var fName = document.getElementById("FName");
	var lName = document.getElementById("LName");
	var password=document.getElementById("Password");
	var len=password.value.length;
	var rPassword=document.getElementById("RPassword");
	
	
	var fNameAlert=document.getElementById("FNameAlert");
	var lNameAlert=document.getElementById("LNameAlert");
	var passwordAlert=document.getElementById("PasswordAlert");
	var rPasswordAlert=document.getElementById("RPasswordAlert");
	
	if(fName.value=="")
	{
		check=false;
	fNameAlert.innerHTML="Please Specify Your First Name";
	}
	else
	{
		fNameAlert.innerHTML="";
	}
		
	
	if(lName.value=="")
	{
		check=false;
		lNameAlert.innerHTML="Please Specify Your Last Name";
	}
	else
	{
		lNameAlert.innerHTML="";
		
	}
	
	if(len < 8)
	{
		        check=false;
	    		passwordAlert.innerHTML="Please Enter Password of minimum eight character";
				rPasswordAlert.innerHTML="";

	}
	else{
		passwordAlert.innerHTML="";
		if(password.value!=rPassword.value)
		{
			 check=false;
		rPasswordAlert.innerHTML="Both Password must be same";

		}
		else{
			rPasswordAlert.innerHTML="";
			
		}
		
	}
	
	
	var age=document.getElementById("Age") ;
	
	if(age.value=="")
	{
		check=false;
		document.getElementById("AgeAlert").innerHTML ="Please specify your age"
	}
	else
	{
		var patt = new RegExp("[0-9]+\.?[0-9]*");
		var checkAge=  /^[0-9]+(.[0-9]{1,2})?$/.test(age.value);
		if(checkAge == false)
		{
			check=false;
			document.getElementById("AgeAlert").innerHTML ="Age can not contain other than number and dot"
			
		}
		else{
			document.getElementById("AgeAlert").innerHTML ="";
			
		}
		
	}
	
	if(check==true)
	{
		alert("profile created successfully");
		fName.value="";
		lName.value="";
		password.value="";
		rPassword.value="";
		age.value="";
		
	}
	
	
	
}
<img src="find_car-512.png"/>
<img src="Car.png"/>

var states = new Array();

states['Rajasthan'] = new Array('Bikaner','Jaisalmer','Jodhpur','Udaipur',' Ajmer','Jaipur','Kota');
states['Madhya Pradesh'] = new Array('Indore',' Gwalior',' Jabalpur','Ujjain',' Sagar');
states['Uttar Pradesh'] = new Array('Noida', 'Varanasi', 'Allahabad', 'Agra' ,'Kanpur');
states['Maharashtra'] = new Array('Pune', 'Nagpur', 'Nashik', 'Aurangabad' ,'Solapur');



function setStates() {
  cntrySel = document.getElementById('State');
  if(cntrySel.value=='select State')
  {
	  alert("aa");
	  citySelect=document.getElementById("City");
	  CitySelect.value="select State";
	  
  }
  else
  {
	   stateList = states[cntrySel.value];
	   changeSelect('City', stateList);
  }
 
  
  
}




function changeSelect(fieldID, newOptions) {
  selectField = document.getElementById(fieldID);
  selectField.options.length = 0;
  for (i=0; i<newOptions.length; i++) {
    selectField.options[selectField.length] = new Option(newOptions[i]);
  }
}

function EnableSubmit()
{
    var accept = document.getElementById("Accept");
	var create = document.getElementById("Create");

    if (accept.checked == true)
    {
        create.disabled = false;
    }
    else
    {
        create.disabled = true;
    }
}           
