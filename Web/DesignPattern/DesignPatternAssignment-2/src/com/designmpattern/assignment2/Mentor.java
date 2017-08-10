package com.designmpattern.assignment2;
/**This class act as mentor extends the leave approver and implements its abstract method
 * 
 * @author Shishir
 *Date 23rd October 2015
 */
public class Mentor extends LeaveApprover {

	@Override
	public void processLeaveProcessor(int leaveDaysCount) {
		if (leaveDaysCount > 0 && leaveDaysCount <= 1) {//if leave days count is 1 then approve by the mentor 
			System.out.println("Leave Approved");
		}
		else {
			System.out.println();
			System.out.print("Leave cant be approved by mentor need Higher authorities permission");
			approver.processLeaveProcessor(leaveDaysCount);//forwarding the request to the senior mentor
		}
	}
}
