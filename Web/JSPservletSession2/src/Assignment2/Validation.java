 package Assignment2;

public class Validation {  

public String isValidate( String name, String password){ 
	if(name == ""){
		return("Enter User ID");
	}else if(password == ""){
		return("Enter password");
	} else{  
        return "Success";  
    }  

}
}
