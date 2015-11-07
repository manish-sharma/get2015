package Assignment2;
/**
 *The 'ConcreteHandler' class
 *
 */
public class SeniorMentor extends LeaveApprover {

	@Override
	public void ProcessRequest(int leave) {
		if (leave <= 2) {
			System.out.println("Leave approved by Senior Mentor");
		} else if (successor != null) {
			successor.ProcessRequest(leave);
		}
	}

}
