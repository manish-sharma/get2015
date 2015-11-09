package assignment2;

public class HRManager extends LeaveApproval {
	public void handleRequest(int noOfLeaves) 
	{
		if(noOfLeaves > 2 && noOfLeaves <= 5)
		{
			System.out.println("Leaves are approved by HRManager");
		}
		else
		{
			System.out.println("Leave request requires a meeting");
		}
		
		
	}

}
