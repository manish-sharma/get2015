package model;

public abstract class LeaveApprover {

	/* successor will hold the immediate successor of any LeaveApprover */
	protected LeaveApprover successor;

	public void setSuccessor(LeaveApprover successor) {
		this.successor = successor;
	}

	public abstract void processRequest(int numberOfLeaves);
}
