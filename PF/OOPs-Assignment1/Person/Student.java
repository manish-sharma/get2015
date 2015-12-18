package Person;

public class Student extends Person
{
	private int studentId;
	private String[] courses;
	
	public Student(int uid, String name, int studentId) 
	{
		super(uid,name);
		this.studentId = studentId;
	}
	
	public int getStudentId()        //Function for getting student id
	{
		return studentId;
	}
	
	public void setStudentId(int studentId)    //Function for setting student id
	{
		this.studentId = studentId;
	}
	
	public String[] getCourses()      //Function for getting courses
	{
		return courses;
	}
	
	public void setCources(String[] courses)   //Function for setting courses
	{
		this.courses = courses;
	}
	
	public String toString()        //Function for student data
	{		
		return super.toString() + "\t"+studentId;
	}

}
