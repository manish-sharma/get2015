package Helper;

import model.LeaveApprover;
/**
 * 
 * @author Amit
 *
 */

public class Chaining {
	
	/** This method perform chaining
	 * 
	 * @param mentor : Object of Mentor
	 * @param srMentor : Object of SeniorMentor
	 * @param hrManager : Object of HRManager
	 */
	public static void setChaining(LeaveApprover mentor, LeaveApprover srMentor, LeaveApprover hrManager) {
		mentor.setSuccessor(srMentor);
		srMentor.setSuccessor(hrManager);
	}
}
