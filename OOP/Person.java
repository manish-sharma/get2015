/**
 * this class is used to make or to remove connections between the friends
 * @author Ankur
 *
 */
public class Person extends Entity {
	
	private String school;
	private String college;
//	private String[] interests;
	
	/**method to add a person as a friend
	 * 
	 * @param personObject
	 */
	public void addFriend(Person personObject) {		//personObject is added as friend to the invoking object
		Graph.addEdge(this, personObject);				//adding a connection in the graph
		System.out.println(this.getName() + " and " + personObject.getName() + " are now friends.");
	}
	
	/**method to remove a person from friend list
	 * 
	 * @param personObject
	 */
	public void removeFriend(Person personObject) {		//personObject is removed from friend list of the invoking object
		Graph.removeEdge(this, personObject);			//removing the connection from the graph
		System.out.println(this.getName() + " and " + personObject.getName() + " are not friends anymore.");
	}
	
	/**method to check whether the person already exists in the social network
	 * 
	 * @return
	 */
	boolean checkExistance() {
		for (Person p : MainSocialNetwork.pSet) {
			if (p.getEmail().equalsIgnoreCase(this.getEmail()))
				return true;
		}
		return false;
	}
	
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public String getCollege() {
		return college;
	}
	
	public void setCollege(String college) {
		this.college = college;
	}
	
//	public String[] getInterests() {
//		return interests;
//	}
//	
//	public void setInterests(String[] interests) {
//		this.interests = interests;
//	}
	
}
