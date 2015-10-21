package Assignment2;

public abstract class LeaveHandler {

	public final static int MENTOR = 1;
	public final static int SENIOR_MENTOR = 2;
	public final static int HR_MANAGER = 5;

	protected int day;

	protected LeaveHandler successor;

	public void setSucessor(LeaveHandler successor) {
		this.successor = successor;
	}

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

	abstract protected void leaveApprovalMessage();

}
