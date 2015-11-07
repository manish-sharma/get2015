package Assignment2;

/**
 *The 'ConcreteHandler' class
 *
 */
public class HRManager extends LeaveApprover {

	@Override
	public void ProcessRequest(int leave) {
		if (leave <= 5) {
			System.out.println("Leave approved by HR Manager");
		} else {
			System.out.println("Leave Approval requires a meeting! ");
		}
	}
}
