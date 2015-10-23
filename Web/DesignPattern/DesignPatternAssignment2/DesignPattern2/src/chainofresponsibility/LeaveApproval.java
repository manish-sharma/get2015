package chainofresponsibility;

/**
 * Interface contains to function for processing and handling the request to
 * another class
 * 
 * @author Riddhi
 * 
 */
public interface LeaveApproval {

	public abstract void setNext(LeaveApproval leaves);

	public abstract void process(Leaves noOfDays);
}
