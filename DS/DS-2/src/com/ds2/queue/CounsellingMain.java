package com.ds2.queue;
/*class contains main function
 * @author Shishir Pareek
 * Date 26th August 2015
 */
public class CounsellingMain {
	/*main function where all the related function calls are made*/
	public static void main(String args[]) {
		CollegeCounselling counceling = new CollegeCounselling();
		counceling.readStudentDetails();
		counceling.readCollegeInfo();
		counceling.seatAllotment();
        System.out.println("Student list with allot a college");
        counceling.showListOfStudent();
	}
}
