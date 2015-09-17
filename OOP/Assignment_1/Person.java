/*Here we implement Inheritance Concept.Person is Base Class and Student is child class which extends Person class .
* @author  Neha Bansal
* @version 1.0
* @since   2015-08-14
*/
package assignmentOOP_1;

import java.util.Arrays;

//Base Class
public class Person {
	private int UId;
	private String Name;
	public Person(int uId, String name) {
		super();
		UId = uId;
		Name = name;
	}
	/**
	 * @return the uId
	 */
	public int getUId() {
		return UId;
	}
	/**
	 * @param uId the uId to set
	 */
	public void setUId(int uId) {
		UId = uId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [UId=" + UId + ", Name=" + Name + "]";
	}
	
	
}

//Child Class
class Student extends Person
{
	private int studentId;
	private String[] courses;
	public Student(int uId, String name, int studentId) {
		super(uId, name);
		this.studentId = studentId;
		}
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the courses
	 */
	public String[] getCourses() {
		return courses;
	}
	/**
	 * @param couses the couses to set
	 */
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courses="
				+ Arrays.toString(courses) + ", toString()=" + super.toString()
				+ "]";
	}
	
	//implementing Main function
	public static void main(String args[])
	{
		Student student=new Student(1,"neha",11);
		//String courses[]=new String[]{"C++","Java","PHP","DotNet"};
		//student.setCourses(courses);
		String result=student.toString();
		System.out.println(result);
		
		
	}
	
}
