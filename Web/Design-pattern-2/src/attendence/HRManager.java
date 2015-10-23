/**
 * 
 */
package attendence;

/**
 * @author Suman
 *
 */
public class HRManager extends Approver{

	//class to  approve leave request by HRManager
	
	@Override
	public void processRequest(int days) {
		// TODO Auto-generated method stub
		
		//method to  approve leave request by HRManager if leave requested is more then 2 days
		if(days > 2 && days<=5)
	      {
	        System.out.println("Request Approved by HRManager");
	      }
	      else
	      {
	        System.out.println("Request requires Approval from hire authorities!");
	      }
		
	}

}
