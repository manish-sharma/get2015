/**
 * program for leave approval includes mentor,Senior mentor and HR manager. 
 * The Mentor ,senior mentor and HR manager can approve 1,2,5 days leaves respectively.
 * (Chain of Responsibility)
 */
package Assignment2;

/**
 * @author Anjita
 * SeniorMentor class extending LeaveHandler class
 */
public class SeniorMentor extends LeaveHandler {
	
	/**
	 * @param day : no of leave day Senior Mentor can approve
	 */
	public SeniorMentor(int day) {
		this.day = day;
	}

	/** (non-Javadoc)
	 * @see Assignment2.LeaveHandler#leaveApprovalMessage()
	 * Leave approved by senior mentor
	 */
	@Override
	protected void leaveApprovalMessage() {
		System.out.println("Leave approved by senior mentor");
	}

}
