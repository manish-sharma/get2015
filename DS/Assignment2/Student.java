/**
 * @author Girdhari
 * Class Student
 */

package queue;

import java.util.Comparator;
/* Starting of Student class */
public class Student {

	private String studentName;
	private boolean isCollegeAlloted;
	private int studentRank;
	private static int numberOfStudent;
	private int choice[];

	public int[] getSelectOption() {
		return choice;
	}

	public void setSelectOption(int[] selectOption) {
		this.choice = selectOption;
	}

	public int getStudentRank() {
		return studentRank;
	}

	public void setStudentRank(int studentRank) {
		this.studentRank = studentRank;
	}

	public static int getNoOfStudent() {
		return numberOfStudent;
	}

	public static void setNoOfStudent(int noOfStudent) {
		Student.numberOfStudent = noOfStudent;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public boolean isCollegeAlloted() {
		return isCollegeAlloted;
	}

	public void setCollegeAlloted(boolean isCollegeAlloted) {
		this.isCollegeAlloted = isCollegeAlloted;
	}

	public Student(String studentName, int studentRank, int selectOption[]) {
		this.studentName = studentName;
		isCollegeAlloted = false;
		this.studentRank = studentRank;
		this.choice = selectOption;
		numberOfStudent++;
	}

	public static Comparator<Student> comapareRank = new Comparator<Student>() {

		public int compare(Student s1, Student s2) {

			return s1.getStudentRank() - s2.getStudentRank();
		}
	};

}
/* End of student class */
