package model;
/**
 * This class SeniorMentor handles Leave requests for 2 days
 * @author Amit
 * Date created : 22/10/2015
 */
public class SeniorMentor extends LeaveApprover{

	@Override
	public void processRequest(int numberOfLeaves) {
		
		/* If number of leaves is less or equal to 2 then that will be approved */
		if(numberOfLeaves <= 2) {
			System.out.println("Leave Approved By Senior Mentor");
		}
		/* for greater than 2 leave, successor will be called */
		else if(successor != null) {
			successor.processRequest(numberOfLeaves);
		}
	}
	
}
