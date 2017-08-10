package com.designmpattern.assignment2;
/**This class act as Senior mentor extends the leave approver and implements its abstract method
 * 
 * @author Shishir
 *Date 23rd October 2015
 */
public class SeniorMentor extends LeaveApprover {

	@Override
	public void processLeaveProcessor(int leaveDaysCount) {
		if(leaveDaysCount > 1 && leaveDaysCount <=2){//if leave is for 2 days then approve 
			System.out.println();
			System.out.println("Leave Approved for" + " " + leaveDaysCount + "days by senior Mentor"  );
		}
		else{
			System.out.println();
			System.out.print("Leave cant be approved by Senior Mentor need Higher authorities permission");
			approver.processLeaveProcessor(leaveDaysCount);//forward request to Hr manager
		}
	}

}
