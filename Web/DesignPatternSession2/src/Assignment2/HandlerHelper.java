/**
 * program for leave approval includes mentor,Senior mentor and HR manager. 
 * The Mentor ,senior mentor and HR manager can approve 1,2,5 days leaves respectively.
 * (Chain of Responsibility)
 */
package Assignment2;

/**
 * @author Anjita
 * HandlerHelper class setting limit of approving number of days leave
 * And setting higher authority of each authority
 */
public class HandlerHelper {
	
	/**
	 * @return : lowest level LeaveHandler, i.e. mentor.
	 */
	public static LeaveHandler initializer(){
		LeaveHandler mentor = new Mentor(LeaveHandler.MENTOR);
		LeaveHandler seniorMentor = new SeniorMentor(LeaveHandler.SENIOR_MENTOR);
		LeaveHandler hrManager = new HRManager(LeaveHandler.HR_MANAGER);
		
		mentor.setSucessor(seniorMentor);
		seniorMentor.setSucessor(hrManager);
		
		return mentor;
	}

}
