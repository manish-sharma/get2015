package chainofresponsibility;

/**
 * This is class is respnsible for processing the request for leave for 1 day by
 * the mentor
 * 
 * @author Riddhi
 * 
 */
public class Mentor implements LeaveApproval {

	private LeaveApproval nextInChain;

	public void setNext(LeaveApproval l) {
		this.nextInChain = l;
	}

	public void process(Leaves request) {
		if (request.getNoOfDays() == 1) {
			System.out.println("Leave Sensioned By : Mentor");
		} else {
			nextInChain.process(request);
		}
	}
}
