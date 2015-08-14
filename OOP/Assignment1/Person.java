/**Person class to store person details and containing methods
 * to modify and print the details
 *
 * @author Gaurav Saini
 */

public class Person {
	private int uid;				//private data members
	private String name;

	public Person(int uid, String name){		//parameterized constructor
		this.uid = uid;
		this.name = name;
	}
	
	public int getUid() { return uid; }							//method to retrieve UID
	
	public void setUid(int uid) { this.uid = uid; }				//method to change UID
	
	public String getName() { return name; }					//method to retrieve Name
	
	public void setName(String name) { this.name = name; }		//method to change Name
	
	public String toString(){
		return "Name: " + name + ", UID: " + uid;				//method to print the details
	}
}
