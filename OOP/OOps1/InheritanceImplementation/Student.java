package InheritanceImplementation;

public class Student extends Person {
	
	private int studentId;
	private String[] courses;
	
	public Student(int uid, String name, int studentId) {
		super(uid,name);
		this.studentId = studentId;
	}
	/**
	 * getUid is a function which is return the id of student
	 */
	public int getStudentId() 
        {
            return studentId;
        }
	/**
	 * SetUid is a function which is set the id of student
	 */
	public void setStudentId(int studentId)
        {
            this.studentId = studentId;
        }
	/**
	 * getCourses is return all the course 
	 */
	public String[] getCourses()
        {
            return courses;
        }
	/**
	 * setCourses is store all the courses 
	 */
	public void setCources(String[] courses)
        {
            this.courses = courses;
        }
	
	public String toString(){		
		return super.toString() + ", StudentId:"+studentId;
	}
}

