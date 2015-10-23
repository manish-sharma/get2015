/**
 * 
 */
package Assignment2;

/**
 * @author Ravika
 * @since 23/10/2015
 */
public class HandlerHelper {
	
	public static LeaveHandler initializer(){
		LeaveHandler mentor = new Mentor(LeaveHandler.MENTOR);
		LeaveHandler seniorMentor = new SeniorMentor(LeaveHandler.SENIOR_MENTOR);
		LeaveHandler hrManager = new HRManager(LeaveHandler.HR_MANAGER);
		
		mentor.setSucessor(seniorMentor);
		seniorMentor.setSucessor(hrManager);
		
		return mentor;
	}

}
