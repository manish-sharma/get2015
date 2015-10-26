package model;

public class HRManager extends LeaveApprover {

	@Override
	public void processRequest(int numberOfLeaves) {

		if (numberOfLeaves <= 5) {
			System.out.println("Leave Approved By HR Manager");
		} else if (successor != null) {
			successor.processRequest(numberOfLeaves);
		} else if (successor == null) {
			System.out.println("Leave Approval Requires a Meeting");
		
		}
	}

}
