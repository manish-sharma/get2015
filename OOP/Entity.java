import java.math.BigInteger;
/**
 * this method is used to check the validity of phone and the email id
 * @author Ankur
 *
 */
public class Entity  {
	
	private String name;					//name holds the name of the person
	private BigInteger phone;				//phone holds the phone number of the person
	private String email;					//email holds the email Id of the person
	
	//method to check validity of the phone number
	boolean isValidPhone(BigInteger phone) {
		if (phone.toString().length() == 10)
			return true;
		else
			return false;
	}
	
	//method to check validity of the email Id
	boolean isValidEmail(String email) {
		if (email.contains("@") == true && email.contains(".com") == true)
			return true;
		else
			return false;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public BigInteger getPhone() {
		return phone;
	}
	
	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}