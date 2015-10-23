package com.chain_of_responsibility;
/**
 * @name SeniorMentor
 * @author Sumitra
 *@description this class extends Approval class and override processRequest to
 * approve leave according to responsibility
 * A senior mentor can approve leave for two day only
 */
public class SeniorMentor extends Approval{
	@Override
	public void ProcessRequest(int leave) {
		if(leave == 2) {
			System.out.println("Leave Approved By Senior Mentor:::");
		}
		else if(successor != null){
			successor.ProcessRequest(leave);
		}
	}
}
