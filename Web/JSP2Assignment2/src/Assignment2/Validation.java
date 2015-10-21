package Assignment2;
/**
 * class to check validation
 * @author Ankur
 *
 */
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
