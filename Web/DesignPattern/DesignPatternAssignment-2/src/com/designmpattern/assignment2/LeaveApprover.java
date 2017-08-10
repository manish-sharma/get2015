package com.designmpattern.assignment2;
/**This class is abstract class and show the chain of responsability design pattern
 * 
 * @author Shishir
 *Date 23rd October 2015
 */
public abstract class LeaveApprover {

	protected LeaveApprover approver;
	//sets the approver ffor the leave 
	public void setApprover(LeaveApprover approver){
		this.approver=approver;
	}
	//abstract method 
	public abstract void processLeaveProcessor(int leaveDaysCount);
}
