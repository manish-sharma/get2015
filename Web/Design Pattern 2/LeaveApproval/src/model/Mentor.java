package model;
/**
 * This class Mentor handles Leave requests for 1 day
 * @author Sanjay
 * Date created : 22/10/2015
 */
public class Mentor extends LeaveApprover{

	@Override
	public void processRequest(int numberOfLeaves) {
		
		/* If number of leaves is less or equal to 1 then that will be approved */ 
		if(numberOfLeaves <= 1) {
			System.out.println("Leave Approved By Mentor");
		}
		/* for greater than 1 leave, successor will be called */
		else if(successor != null) {
			successor.processRequest(numberOfLeaves);
		}
	}
	
}
