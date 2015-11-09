package assignment2;

public class SeniorMentor extends LeaveApproval
{
	public void handleRequest(int noOfLeaves) 
	{
		if(noOfLeaves > 1 && noOfLeaves <= 2)
		{
			System.out.println("Leaves are approved by Senior Mentor");
		}
		else
		{
			successor.handleRequest(noOfLeaves);
		}
		
		
	}

}
