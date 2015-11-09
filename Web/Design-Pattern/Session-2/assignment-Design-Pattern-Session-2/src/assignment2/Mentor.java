package assignment2;

public class Mentor extends LeaveApproval {

	
	public void handleRequest(int noOfLeaves) 
	{
		if(noOfLeaves == 1)
		{
			System.out.println("Leaves are approved by Mentor");
		}
		else
		{
			successor.handleRequest(noOfLeaves);
		}
		
		
	}

}
