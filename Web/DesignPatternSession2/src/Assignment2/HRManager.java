/**
 * 
 */
package Assignment2;

/**
 * @author Anjita
 *
 */
public class HRManager extends LeaveHandler {
	public HRManager(int day) {
		this.day = day;
	}

	@Override
	protected void leaveApprovalMessage() {
		System.out.println("Leave approved by HR manager");
	}

}
