/**
 * SeniorMentor class extends Approver
 * @author Ankur
 * @since 23-10-2015
 */
public class SeniorMentor extends Approver 
{

	@Override
	public void ProcessRequest(int noOfDays) 
	{
		if (noOfDays <= 2)
		{
			System.out.println(" Leave Granted by  Senior mentor");
		}
		else if (successor != null)
		{
			successor.ProcessRequest(noOfDays);
		}

	}

}