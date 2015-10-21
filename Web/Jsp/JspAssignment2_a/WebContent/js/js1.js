		
		function validate()
		{
			var msg = "";
			msg += validateFname()+validateLname()+validatePassword()+validateEmail()+validateUsername();
			if (msg.length>0)
			{
				alert(msg);
				return false;
			}	
			else
			{
				alert("User created successfully");
				return true;
			}
		}
	
	
		function validateFname()  
		{  
			var txt = document.getElementById("fName").value;
			var letters = /^[A-Za-z]+$/; 
			// checks if first name is empty or not
			if ( txt == "") 
			{  
				return "Please enter First Name\n";
			}
			// checks that firstname should contain only alphabets 
			else if( !txt.match(letters) )  
			{  
				return "Only alphabets are allowed in first name\n";
			}
			else 
				return "";
		} 

		
		function validateLname()  
		{  
			var txt = document.getElementById("lName").value;
			var letters = /^[A-Za-z]+$/;  
			// checks if last name is empty or not
			if ( txt == "") 
			{  
				return "Please enter Last Name\n";
			}
			// checks that last name should contain only alphabets
			else if( !txt.match(letters) )  
			{  
				return "Only alphabets are allowed in last name\n";
			}
			else 
				return "";
		}
		
		
		function validatePassword()  
		{  
			var passwd = document.getElementById("passwd").value;
			// checks if password is empty or not
			if ( passwd == "")
			{  
				return "Please enter password\n";			
			}
			//checks that password should have minimum 8 characters
			else if( passwd.length < 8 )
			{  
				return "Password should be of minimum 8 characters\n";
			}
			else 
				return "";
		}
		
		
		function validateEmail()  
		{  
			var txt = document.getElementById("email").value;
			// checks if email is valid or not
			if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(txt))  
			{  
				return "";  
			}
			else
			{
				return "You have entered an invalid email address!\n" ;   
			} 
		}
		
		
		function validateUsername()  
		{  
			var txt = document.getElementById("username").value;
			var letters = /^[A-Za-z]+$/;  
			// checks if user name is empty or not
			if ( txt == "") 
			{  
				return "Please enter User Name\n";
			}
			// checks that user name should contain only alphabets
			else if( !txt.match(letters) )  
			{  
				return "Only alphabets are allowed in user name\n";
			}
			else 
				return "";
		}

				
		function enableButton()
		{
			var submitButton = document.getElementById("submitButton");
			var acceptCondition = document.getElementById("acceptCondition");

			if (acceptCondition.checked == true)
			{
				submitButton.disabled = false;
			}
			else
			{
				submitButton.disabled = true;
			}
		}
		