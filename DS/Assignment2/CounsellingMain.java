/**
 * @author Girdhari 
 * This class contains main method for Counseling
 */
package queue;
/* Starting of CounselingMain class */
public class CounselingMain {
	/* Starting of main function */
	public static void main(String args[]) {
		int totalCollege = 5;
		int totalStudent = 25;
		int choice[] = { 1, 2, 3, 4, 5 };
		Counseling counseling = new Counseling(totalCollege, totalStudent);
		counseling.addCollege("college1", 1);
		counseling.addCollege("college2", 2);
		counseling.addCollege("college3", 3);
		counseling.addCollege("college4", 4);
		counseling.addCollege("college5", 5);
		counseling.addStudent("student1", 4, choice);
		counseling.addStudent("student2", 7, choice);
		counseling.addStudent("student3", 1, choice);
		counseling.addStudent("student4", 2, choice);
		counseling.addStudent("student5", 5, choice);
		counseling.addStudent("student6", 8, choice);
		counseling.addStudent("student7", 10, choice);
		counseling.addStudent("student8", 3, choice);
		counseling.addStudent("student9", 11, choice);
		counseling.addStudent("student10", 15, choice);
		counseling.addStudent("student11", 20, choice);
		counseling.addStudent("student12", 6, choice);
		counseling.addStudent("student13", 9, choice);
		counseling.addStudent("student14", 12, choice);
		counseling.addStudent("student15", 24, choice);
		counseling.addStudent("student16", 21, choice);
		counseling.addStudent("student17", 16, choice);
		counseling.addStudent("student18", 13, choice);
		counseling.addStudent("student19", 14, choice);
		counseling.addStudent("student20", 22, choice);
		counseling.addStudent("student21", 25, choice);
		counseling.addStudent("student22", 23, choice);
		counseling.addStudent("student23", 18, choice);
		counseling.addStudent("student24", 17, choice);
		counseling.addStudent("student25", 19, choice);
		counseling.doCounseling();
		counseling.displayResult();
	}
	/* End of main function */
}
/* End of CounselingMain class */
