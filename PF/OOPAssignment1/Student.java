/**
 * @author Sumitra
 * this class is created Student to store whole data for student extending from person
 */
public class Student extends Person
{
	private int studentId;
	private String[] courses;
	/**
	 * 
	 * @param uid user id is stored
	 * @param name name of person is stored
	 * @param studentId Student id is stored
	 * and the userid and name are stored by using parent constructor and that is called by super keyword
	 */
	public Student(int uid, String name, int studentId) 
	{
		super(uid,name);
		this.studentId = studentId;
	}
	/**
	 * 
	 * @return will return the student id
	 */
	public int getStudentId() 
	{	
		return studentId;
	}
	/**
	 * 
	 * @param studentId will set student id
	 */
	public void setStudentId(int studentId)
	{	
		this.studentId =studentId;
	}
	/**
	 * 
	 * @return will return the list of all courses
	 */
	public String[] getCourses()
	{	
		return courses;
	}
	/**
	 * 
	 * @param courses will set all courses
	 */
	public void setCources(String[] courses)
	{
		this.courses = courses;
	}
	//will return whole information about the person student id and name and user id.
	public String toString()
	{
		return super.toString() + ", StudentId:"+studentId;
	}
}
