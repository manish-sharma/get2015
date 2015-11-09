package assignmentDS_4;
/*
 * Person class
 */
public class Person {
	public int id;         // id of the person
	public String name;    //name of the department of the person
	public int priority;   //priority of his/her department
	
	//constructor
	public Person(int id,String name, int priority) {
		super();
		this.id=id;
		this.name = name;
		this.priority = priority;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}
	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
		

}
