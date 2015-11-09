import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validation {
	private static final String EMAIL_PATTERN = 
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final String Name_Pattern = "^[a-z0-9_-]{3,15}$";
	private static final String Password_Pattern =  "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
	
	
	public String validate(String name,String password,String email)
	{
		Pattern namePattern = Pattern.compile(Name_Pattern);
    	Pattern paswordPattern = Pattern.compile(Password_Pattern);
    	Pattern emailPattern = Pattern.compile(EMAIL_PATTERN);
		Matcher nameMatcher = namePattern.matcher(name);
		Matcher passwordMather = paswordPattern.matcher(password);
		Matcher emailMatcher = emailPattern.matcher(email);
		if(!nameMatcher.matches())
		{
			System.out.print("name");
			return "Please enter correct user name (username should be 3 to 15 charcherter long and can have a-z or 0-9 or - or _ )";
			
			
		}
		else if(!passwordMather.matches())
		{
			System.out.print("pass");
			return "Please enter correct password (password should be 6 to 20 charecter long and have"
					+ " atleast one (@#$%) and one digit and one lowecase and one upeercase Latter)";
		}
		else if(!emailMatcher.matches())
		{
			System.out.print("email");
			return "Please Enter Valid Email id";
		}
		else
		{
			System.out.print("Validated");
			return "Validated";
		}
		
	}

}
