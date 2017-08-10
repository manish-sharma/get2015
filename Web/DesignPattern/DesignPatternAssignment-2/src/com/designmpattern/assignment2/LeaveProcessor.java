package com.designmpattern.assignment2;
/**This class contains main method and number of days for the leave are passed from here 
 * 
 * @author Shishir
 *Date 23rd October 2015
 */
public class LeaveProcessor {
	public static void main(String args[]){
		LeaveApprover mentor = new Mentor();
		LeaveApprover seniorMentor = new SeniorMentor();
		LeaveApprover hrManager = new HRManager();
		mentor.setApprover(seniorMentor);
		seniorMentor.setApprover(hrManager);
		mentor.processLeaveProcessor(10);
	}
}
