/**
 * Class that contains variable that stores information for any user that enters in social network common to both person and organization
 * @author Riddhi
 *
 */
public abstract class Entity {

	private String name;

	private String email;

	private long phoneNumber;

	private int uniqueId;

	public String getFirstName() {
		return name;
	}

	public void setFirstName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setUniqueId(int uniqueNumber) {
		this.uniqueId = uniqueNumber;
	}

	public int getUniqueId() {
		return uniqueId;
	}

}
