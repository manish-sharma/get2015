package Assignment2;

public class RequestForLeave {

	public static void main(String args[]) {
		LeaveApprover mentor = new Mentor();
		LeaveApprover srMentor = new SeniorMentor();
		LeaveApprover hrManager = new HRManager();
		mentor.setSuccessor(srMentor);
		srMentor.setSuccessor(hrManager);
		mentor.ProcessRequest(5);
	}
}

