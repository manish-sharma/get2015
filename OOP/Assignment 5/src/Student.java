/*This class extends the Person calass and usues its propeties and its own properties*
 * @author Shishir Pareek
 * date 13th August 2015*/
public class Student extends Person {
	private int studentId;
	private String[] courses;
	/*constructor*/
	public Student(int uid, String name, int studentId) {
		super(uid,name);
		this.studentId = studentId;
	}
	/*getter method for student id*/
	public int getStudentId() 
	{
		return studentId;
	}
	/*setter method for student id*/
	public void setStudentId(int studentId) 
	{
		this.studentId = studentId;
	}
	/*getter method for courses*/
	public String[] getCourses() 
	{
		return courses;
	}
	/*setter method for courses*/
	public void setCources(String[] courses) 
	{
		this.courses = courses;
	}
	
	public String toString(){		
		return super.toString() + ", StudentId:"+studentId;
	}
}