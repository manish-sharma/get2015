/**
 * program for leave approval includes mentor,Senior mentor and HR manager. 
 * The Mentor ,senior mentor and HR manager can approve 1,2,5 days leaves respectively.
 * (Chain of Responsibility)
 */
package Assignment2;

/**
 * @author Anjita
 * HRManager class extending LeaveHandler class
 */
public class HRManager extends LeaveHandler {
	
	/**
	 * @param day : no of leave day HR Manager can approve
	 */
	public HRManager(int day) {
		this.day = day;
	}

	/** (non-Javadoc)
	 * @see Assignment2.LeaveHandler#leaveApprovalMessage()
	 * Leave approved by HR manager
	 */
	@Override
	protected void leaveApprovalMessage() {
		System.out.println("Leave approved by HR manager");
	}

}
