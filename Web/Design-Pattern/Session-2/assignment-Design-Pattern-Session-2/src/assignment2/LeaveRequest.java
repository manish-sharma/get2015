package assignment2;

public  class LeaveRequest {
	private static LeaveApproval getChainOfRequest()
	{
		LeaveApproval leaveApproval1 = new Mentor();
		LeaveApproval leaveApproval2 = new SeniorMentor();
		LeaveApproval leaveApproval3 = new HRManager();
		leaveApproval1.setSuccessor(leaveApproval2);
		leaveApproval2.setSuccessor(leaveApproval3);
		return leaveApproval1;
		
	}
	public static void main(String args[])
	{
		LeaveApproval requestChain = getChainOfRequest();
		requestChain.handleRequest(8);
		
	}
	


	

}
