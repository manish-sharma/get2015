package oop1;

public class Student extends person {
	
	private int studentId;
	private String[] courses;
	
	public Student(int uid, String name, int studentId) {
		super(uid,name);
		this.studentId = studentId;
	}
	/** used to get the student id
	 * @return the student id
	 */
	public int getStudentId() {return this.studentId;}
	/** used to set the student id.
	 * @param studentId is value that user want to set in id.
	 */
	public void setStudentId(int studentId) {this.studentId = studentId;}
	/** used to get the courses of student.
	 * @return the string of student course.
	 */
	public String[] getCourses() {return this.courses;}
	/** used to set the courses of student.
	 * @param courses is the array of courses of student.
	 */
	public void setCources(String[] courses) {this.courses = courses;}
	/** returns all the detail of students.
	 */
	public String toString(){		
		return super.toString() + ", StudentId:"+studentId;
	}
}


