/**
 * 
 */
package attendence;

import attendence.Approver;

/**
 * @author Suman
 *
 */
public class SeniorMentor extends Approver{

	//class to  approve leave request by Senior Mentor
	
	@Override
	public void processRequest(int days) {
		// TODO Auto-generated method stub
		
		//method to  approve leave request by Senior Mentor if leave requested is more then 1 days
		if(days > 1 && days<=2)
	      {
	        System.out.println("Request Approved by Senior Mentor");
	      }
	      else if (successor != null)
	      {
	    	  successor.processRequest(days);
	      }
	}

}
