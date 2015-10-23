/**
 * 
 */
package attendence;

/**
 * @author Suman
 *
 */
public class Mentor extends Approver{

	//class to  approve leave request by Mentor
	
	@Override
	public void processRequest(int days) {
		// TODO Auto-generated method stub
		
		//method to  approve leave request by Mentor if leave requested for 2 days
		if(days == 1)
	      {
	        System.out.println("Request Approved by Mentor");
	      }
	      else if (successor != null)
	      {
	    	  successor.processRequest(days);
	      }
	}
	
}
