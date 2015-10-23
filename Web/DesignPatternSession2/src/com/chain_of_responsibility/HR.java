package com.chain_of_responsibility;
/**
 * @name HR
 * @author Sumitra
 *@description this class extends Approval class and override processRequest to
 * approve leave according to responsibility
 *HR can approve leave up to 5 days only
 */
public class HR extends Approval{
	@Override
	public void ProcessRequest(int leave) {		
		if(leave > 2 && leave <=5) {
			System.out.println("Leave Approved By HR:::");
		}
		else if(successor==null) {
			System.out.println("Meetings Requires For Leave:::");
		}
	}
}
