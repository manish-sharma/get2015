//derived class to get details of user
public class Students extends Person 
{
	private int studentId;
	private String[] courses;
	public Students(int uid, String name, int studentId) 
	{
		super(uid,name);
		this.studentId = studentId;                            //assign value to studentId
	}
	public int getStudentId() 
	{
		return studentId;
	}              //to get student id
	public void setStudentId(int studentId) 
	{
		this.studentId = studentId;
	}      //to set student id
	public String[] getCourses() 
	{return courses;
	}               //to get name of courses
	public void setCources(String[] courses) 
	{this.courses = courses;
	}           //to set name of courses
	public String toString()
	{	
	return super.toString() + ", StudentId:"+studentId;             //to return data
	}

}
