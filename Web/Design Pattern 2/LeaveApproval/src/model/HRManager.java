package model;
/**
 * This class HRManager handles Leave requests for 3 TO 5 days
 * @author Sanjay
 * Date created : 22/10/2015
 */
public class HRManager extends LeaveApprover{

	/** Method to process request for leave
	 * @param numberOfLeaves
	 */
	@Override
	public void processRequest(int numberOfLeaves) {
		
		/* If number of leaves is less than or equal to 5 then that will be approved */ 
		if(numberOfLeaves <= 5) {
			System.out.println("Leave Approved By HR Manager");
		}
		/* for greater than 5 leaves successor will be called */
		else if(successor != null) {
			successor.processRequest(numberOfLeaves);
		}
		/* If no successor, then leave approval will require a meeting */
		else if(successor == null) {
			System.out.println("Leave Approval Requires a Meeting");
		}
	}
	
}
