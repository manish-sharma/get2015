/**Student class to store Student details and containing methods
 * to modify and print the details
 * 
 * Student is a subclass of the Person class
 *  
 * @author Gaurav Saini
 */

public class Student extends Person {				//Student class inherited from Person class
	
	private int studentId;							//private data members
	private String[] courses;
	
	public Student(int uid, String name, int studentId) {					//parameterized constructor to initialize the object of class
		super(uid, name);
		this.studentId = studentId;
	}
	
	public int getStudentId() { return studentId; }							//method to retrieve StudentID
	
	public void setStudentId(int studentId) { this.studentId = studentId; }		//method to change StudentID
	
	public String[] getCourses() { return courses; }						//method to retrieve course details
	
	public void setCources(String[] courses) { this.courses = courses; }	//method to modify course details
	
	public String toString(){		
		return super.toString() + ", StudentId: " + studentId;				//method to print the details
	}
}
