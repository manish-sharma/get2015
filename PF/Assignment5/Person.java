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

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Name:" + name + ", uid:" + uid;
	}
}

