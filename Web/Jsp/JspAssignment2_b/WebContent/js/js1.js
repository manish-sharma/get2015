		
		function validate()
		{
			var msg = "";
			msg += validateUsername()+validatePassword();
			if (msg.length>0)
			{
				alert(msg);
				return false;
			}	
			else
			{
				alert("Submitted successfully");
				return true;
			}
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
