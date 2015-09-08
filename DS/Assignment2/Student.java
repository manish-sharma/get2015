import java.util.Comparator;

public class Student {
	
	private String studentName;
	private boolean isCollegeAlloted;
	private int studentRank;
	private static int noOfStudent;
	private int selectOption[];
	
	
	public int[] getSelectOption() {
		return selectOption;
	}
	public void setSelectOption(int[] selectOption) {
		this.selectOption = selectOption;
	}
	public int getStudentRank() {
		return studentRank;
	}
	public void setStudentRank(int studentRank) {
		this.studentRank = studentRank;
	}
	public static int getNoOfStudent() {
		return noOfStudent;
	}
	public static void setNoOfStudent(int noOfStudent) {
		Student.noOfStudent = noOfStudent;
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
	
	public Student(String studentName,int studentRank ,int selectOption[]) {
		this.studentName=studentName;
		isCollegeAlloted=false;
		this.studentRank=studentRank;
		this.selectOption=selectOption;
		noOfStudent++;
	}
	
	public static Comparator<Student> comapareRank = new Comparator<Student>() {

		public int compare(Student s1, Student s2) {

			return s1.getStudentRank()-s2.getStudentRank();
		}
	};

}
