
/*
 * This User class contains the user information
 * @author Banwari Kevat
 */
public class User {
	
	private String name;
	private String userId;
	private String contactNumber;
	/*
	 * setName enter the name
	 * @param name Name of passenger
	 */
	void setName(String name) {
		this.name=name;
	}
	
	String  getName() {
		return name;
	}
	/*
	 *  @param id User Id of passenger
	 */
	void setUserId(String id) {
		this.userId=id;
	}
	
	String  getUserId() {
		return userId;
	}
	
	/*User registration done here  
	 *@param contNum contact Number of User
	 */
	void setContactNumber(String contNum) {
		this.contactNumber=contNum;
	}
	
	String  getContactNumber() {
		return contactNumber;
	}
	/*User registration done here 
	 *@param name Name of passenger
	 *@param id User Id of passenger 
	 *@param contNum contact Number of User
	 */
	void userRegistration(String name, String id, String contact) {
		  setName(name);
		  setUserId(id);
		  setContactNumber(contact);
		 
	}
	
}
