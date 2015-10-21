/**
 * program for leave approval includes mentor,Senior mentor and HR manager. 
 * The Mentor ,senior mentor and HR manager can approve 1,2,5 days leaves respectively.
 * (Chain of Responsibility)
 */
package Assignment2;

/**
 * @author Anjita
 * abstract class LeaveHandler handling approval level of leave.
 */
public abstract class LeaveHandler {

	public final static int MENTOR = 1;
	public final static int SENIOR_MENTOR = 2;
	public final static int HR_MANAGER = 5;

	protected int day;

	protected LeaveHandler successor;

	/**
	 * @param successor : higher authority for approving leave
	 */
	public void setSucessor(LeaveHandler successor) {
		this.successor = successor;
	}

	/**
	 * @param day : number of leave days requested
	 */
	public void handleRequest(int day) {
		if (this.day >= day) {
			leaveApprovalMessage();
		}
		else
		if (this.successor != null) {
			this.successor.handleRequest(day);
		}
		else {
			System.out.println("Leave can't be approved");
		}
	}

	/**
	 * abstract method leaveApprovalMessage
	 */
	abstract protected void leaveApprovalMessage();

}
