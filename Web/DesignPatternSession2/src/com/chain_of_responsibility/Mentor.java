package com.chain_of_responsibility;
/**
 * @name Mentor
 * @author Sumitra
 *@description this class extends Approval class and override processRequest to
 * approve leave according to responsibility
 * A mentor can approve leave for one day only
 */
public class Mentor extends Approval {

	@Override
	public void ProcessRequest(int leave) {
		if(leave == 1) {
			System.out.println("Leave Approved By Mentor:::");
		}
		else if(successor != null){
			successor.ProcessRequest(leave);
		}
	}
}