/**
 * HrManager class extends Approver
 * @author Ankur
 * @since 23-10-2015
 */

public class HrManager extends Approver 
{

	@Override
	public void ProcessRequest(int noOfDays) 
	{
		if (noOfDays <= 5)
		{
			System.out.println(" Leave Granted by  Hr manager ");
		}
		else 
		{
			System.out.println("valid reasons should be provided");
		}

	}

}