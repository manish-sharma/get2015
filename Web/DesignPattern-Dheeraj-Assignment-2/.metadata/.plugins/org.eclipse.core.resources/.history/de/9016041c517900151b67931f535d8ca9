package model;
/**
 * @author Amit
 * Date created : 22/10/2015
 */
public abstract class LeaveApprover {

	/* successor will hold the immediate successor of any LeaveApprover*/
	protected LeaveApprover successor;
	
	/** MEthod to set Successor of a LeaveApprover
	 * 
	 * @param successor
	 */
	public void setSuccessor(LeaveApprover successor) {
		this.successor = successor;
	}
	
	/** Abstract method to process request for leaves
	 * 
	 * @param numberOfLeaves
	 */
	public abstract void processRequest(int numberOfLeaves);
}
