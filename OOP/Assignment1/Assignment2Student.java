public class Assignment2Student extends Assignment2Person 
{
	private int studentId;
	private String[] courses;
	
	public Assignment2Student(int uid, String name, int studentId)
	{
		super(uid,name);
		this.studentId = studentId;
		
	}
	public int getStudentId()
	{ 	return studentId;
	}
	public void setStudentId(int studentId) 
	{ 
		this.studentId = studentId;
	}
	public String[] getCourses()
	{ 	
		return courses;
	}
	public void setCourses(String[] courses) 
	{ 
			this.courses = courses;
	}
	public String toString()
	{
		return super.toString()+ ", StudentId "+studentId;
	}
}
