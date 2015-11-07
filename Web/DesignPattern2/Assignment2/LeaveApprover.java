package Assignment2;

public abstract class LeaveApprover {
	protected LeaveApprover successor;

	public void setSuccessor(LeaveApprover successor) {
		this.successor = successor;
	}

	public abstract void ProcessRequest(int leave);

}
