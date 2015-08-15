package Assignment5;

/**
 * Student extending person and adding features
 *
 */
public class Student extends Person {
	private int studentId;
	private String[] courses;
	/**
	 * constructor calling with of base class too
	 */

	public Student(int uid, String name, int studentId) {
		super(uid, name);
		this.studentId = studentId;
	}
         /**
	 * returning id
	 */
	public int getStudentId() {
		return studentId;
	}
         /**
	 * set the id
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	 /**
	 * returning courses
	 */

	public String[] getCourses() {
		return courses;
	}
	 /**
	 * set the course
	 */

	public void setCources(String[] courses) {
		this.courses = courses;
	}
	
	 /**
	 * returning id
	 */

	public String toString() {
		return super.toString() + ", StudentId:" + studentId;
	}
}
