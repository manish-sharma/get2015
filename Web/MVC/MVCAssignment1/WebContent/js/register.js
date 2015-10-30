		
		function validate()
		{
			var msg = "";
			msg += validateName()+validateEmail()+validateAge()+validateDate();
			if (msg.length>0)
			{
				alert(msg);
				return false;
			}	
			else
			{
				alert("User registered successfully");
				return true;
			}
		}
	
	
		function validateName()  
		{  
			var txt = document.getElementById("empName").value;
			var letters = /^[A-Za-z]+$/; 
			// checks if name is empty or not
			if ( txt == "") 
			{  
				return "Please enter Name\n";
			}
			// checks that name should contain only alphabets 
			else if( !txt.match(letters) )  
			{  
				return "Only alphabets are allowed in name\n";
			}
			else 
				return "";
		} 

		
		function validateEmail()  
		{  
			var txt = document.getElementById("empEmail").value;
			// checks if email is valid or not
			if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(txt))  
				return ""; 
			else
				return "You have entered an invalid email address!\n" ; 
		}
		

		function validateAge()
		{
			var age = document.getElementById("empAge").value;
			var numbers = /^\d*\.?\d*$/; 
			// checks if age is empty or not
			if ( age == "")
			{  
				return "Please enter age\n";
			}
			// checks if age contains only numbers and dot
			else if(!age.match(numbers))  
			{  
				return "Please enter numeric value in age\n";
			}
			//checks that password should have minimum 8 characters
			else if( age < "18" )
			{  
				return "Minimum age required is 18\n";
			}
			else 
				return "";
		}
		
		
		function validateDate()  
		{  
			var txt = document.getElementById("empDate").value;
			// checks if date is empty or not
			if ( txt == "") 
			{  
				return "Please enter Date of registration\n";
			}
			else 
				return "";
		} 


		