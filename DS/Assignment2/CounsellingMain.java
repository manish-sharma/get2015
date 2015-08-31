/**
 * @author Girdhari 
 * This class contains main method for counselling
 */
package queue;

public class CounsellingMain {

	public static void main(String args[]) {
		int collegeSize = 5;
		int studentSize = 25;
		int option[] = { 1, 2, 3, 4, 5 };
		Counselling counseling = new Counselling(collegeSize, studentSize);
		counseling.addCollege("college1", 1);
		counseling.addCollege("college2", 2);
		counseling.addCollege("college3", 3);
		counseling.addCollege("college4", 4);
		counseling.addCollege("college5", 5);
		counseling.addStudent("student1", 4, option);
		counseling.addStudent("student2", 7, option);
		counseling.addStudent("student3", 1, option);
		counseling.addStudent("student4", 2, option);
		counseling.addStudent("student5", 5, option);
		counseling.addStudent("student6", 8, option);
		counseling.addStudent("student7", 10, option);
		counseling.addStudent("student8", 3, option);
		counseling.addStudent("student9", 11, option);
		counseling.addStudent("student10", 15, option);
		counseling.addStudent("student11", 20, option);
		counseling.addStudent("student12", 6, option);
		counseling.addStudent("student13", 9, option);
		counseling.addStudent("student14", 12, option);
		counseling.addStudent("student15", 24, option);
		counseling.addStudent("student16", 21, option);
		counseling.addStudent("student17", 16, option);
		counseling.addStudent("student18", 13, option);
		counseling.addStudent("student19", 14, option);
		counseling.addStudent("student20", 22, option);
		counseling.addStudent("student21", 25, option);
		counseling.addStudent("student22", 23, option);
		counseling.addStudent("student23", 18, option);
		counseling.addStudent("student24", 17, option);
		counseling.addStudent("student25", 19, option);
		counseling.doCounseling();
		counseling.displayResult();
	}

}
