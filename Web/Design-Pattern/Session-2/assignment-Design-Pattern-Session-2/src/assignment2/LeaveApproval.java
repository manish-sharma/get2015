package assignment2;

public abstract class LeaveApproval {
	protected LeaveApproval successor;
	public void setSuccessor(LeaveApproval successor)
	{
		this.successor = successor;
	}
	
	public abstract void handleRequest(int noOfLeaves);

}
