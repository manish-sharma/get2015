package chainofresponsibility;

/**
 * This is class is responsible for processing the request for leave for 2 day by
 * the senior mentor
 * 
 * @author Riddhi
 * 
 */
public class SeniorMentor implements LeaveApproval {
	private LeaveApproval nextInChain;

	public void setNext(LeaveApproval l) {
		this.nextInChain = l;
	}

	public void process(Leaves request) {
		if (request.getNoOfDays() == 2) {
			System.out.println("Leave Sensioned By :  Senior Mentor");
		} else {
			nextInChain.process(request);
		}
	}
}
