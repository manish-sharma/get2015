package Assignment5;


/**
 * @author Arushi
 *Person class has its own features which are inherited by student class and is called in Inheritance main
 */
public class Person {
	private int uid;
	private String name;

	public Person(int uid, String name) {
		this.uid = uid;
		this.name = name;
	}
	/**
	 * function to return user id
	 */

	public int getUid() {
		return uid;
	}
	
	/**
	 * function to set user id
	 */

	public void setUid(int uid) {
		this.uid = uid;
	}
	/**
	 * function to return name
	 */

	public String getName() {
		return name;
	}
	/**
	 * function to set name
	 */

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Name:" + name + ", uid:" + uid;
	}
}

