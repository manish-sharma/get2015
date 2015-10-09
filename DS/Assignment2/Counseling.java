package queue;

/**
 @author Girdhari
 * Counseling class doing Counseling of each student according to its choice and rank   
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* Starting of Counseling class */
public class Counseling {

	private int collegeSize;
	private int studentSize;

	private Queue<Student> studentList;
	private List<College> listOfCollege;
	private List<Student> listOfStudent;
	private Map<String, String> CounselingResult;

	/* Starting of getters and setters */
	public int getCollegeSize() {
		return collegeSize;
	}

	public void setCollegeSize(int collegeSize) {
		this.collegeSize = collegeSize;
	}

	public int getStudentSize() {
		return studentSize;
	}

	public void setStudentSize(int studentSize) {
		this.studentSize = studentSize;
	}

	public List<College> getListOfCollege() {
		return listOfCollege;
	}

	public void setListOfCollege(List<College> listOfCollege) {
		this.listOfCollege = listOfCollege;
	}

	public List<Student> getListOfStudent() {
		return listOfStudent;
	}

	public void setListOfStudent(List<Student> listOfStudent) {
		this.listOfStudent = listOfStudent;
	}

	public Map<String, String> getCounselingResult() {
		return CounselingResult;
	}

	public void setCounselingResult(HashMap<String, String> CounselingResult) {
		this.CounselingResult = CounselingResult;
	}

	public Queue<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(Queue<Student> studentList) {
		this.studentList = studentList;
	}

	public void addStudent(String studentName, int studentRank,
			int selectOption[]) {
		listOfStudent.add(new Student(studentName, studentRank, selectOption));
	}

	public void addCollege(String collegeName, int collegeRank) {
		listOfCollege.add(new College(collegeName, collegeRank));
	}
	/* End of getters and setters */
	/* Start of class constructor */
	public Counseling(int collegeSize, int studentSize) {
		this.collegeSize = collegeSize;
		this.studentSize = studentSize;
		listOfCollege = new ArrayList<College>();
		listOfStudent = new ArrayList<Student>();

		this.studentList = new Queue<Student>(Student[].class, this.studentSize);
		CounselingResult = new HashMap<String, String>();
	}
	/* End of class constructor */
	/* Start of doCounseling function */
	public void doCounseling() {
		Collections.sort(listOfStudent, Student.comapareRank);
		for (int studentNo = 0; studentNo < listOfStudent.size(); studentNo++) {
			studentList.insertElement(listOfStudent.get(studentNo));
		}
		while (!studentList.isEmpty()) {
			Student student = studentList.deleteElement();
			int option[] = student.getSelectOption();
			for (int choice = 0; choice < option.length; choice++) {
				College college = listOfCollege.get(option[choice] - 1);
				
				if (college.getCapacityOfStudent() > 0) {
					student.setCollegeAlloted(true);
					college.setCapacityOfStudent(college.getCapacityOfStudent() - 1);
					CounselingResult.put(student.getStudentName(),
							college.getCollegeName());
					break;
				}
			}
		}
	}
	/* End of doCounseling function */
	/* Start of displayResult function */
	public void displayResult() {
		Set<String> keySet = CounselingResult.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String studentName = (String) iterator.next();
			String collegeName = (String) CounselingResult.get(studentName);
			System.out.println("Name: " + studentName + " College: "
					+ collegeName);
		}

	}
	/* End of displayResult function */
}
/* End of Counseling class */
