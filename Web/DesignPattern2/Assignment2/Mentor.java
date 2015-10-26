package Assignment2;
/**
 *The 'ConcreteHandler' class
 *
 */
public class Mentor extends LeaveApprover {

	@Override
	public void ProcessRequest(int leave) {
		if (leave <= 1) {
			System.out.println("Leave approved by Mentor");
		} else if (successor != null) {
			successor.ProcessRequest(leave);
		}
	}
}
