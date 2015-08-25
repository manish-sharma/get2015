import java.math.BigInteger;

/**
 * @author Arushi
 * 
 */
public class Entity implements Node {

	private String name;
	private BigInteger phone;
	private String email;

	/**
	 * @param phone
	 *            : Checking validation for phone no
	 * @return : return true if correct else false
	 */
	boolean isValidPhone(BigInteger phone) {
		if (phone.toString().length() == 10)
			return true;
		else
			return false;
	}

	/**
	 * @param email
	 *            : Checking validation for email
	 * @return : return true if correct else false
	 */
	boolean isValidEmail(String email) {
		if (email.contains("@") == true && email.contains(".com") == true)
			return true;
		else
			return false;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public BigInteger getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
