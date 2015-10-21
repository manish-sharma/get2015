/**
 * program for leave approval includes mentor,Senior mentor and HR manager. 
 * The Mentor ,senior mentor and HR manager can approve 1,2,5 days leaves respectively.
 * (Chain of Responsibility)
 */
package Assignment2;

/**
 * @author Anjita
 * Mentor class extending LeaveHandler class
 */
public class Mentor extends LeaveHandler {
	
	/**
	 * @param day : no of leave day Mentor can approve
	 */
	public Mentor(int day) {
		this.day = day;
	}

	/** (non-Javadoc)
	 * @see Assignment2.LeaveHandler#leaveApprovalMessage()
	 * Leave approved by mentor
	 */
	@Override
	protected void leaveApprovalMessage() {
		System.out.println("Leave approved by mentor");
	}
}
 