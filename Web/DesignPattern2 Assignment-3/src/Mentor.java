/**
 * Mentor class extends Approver
 * @author Ankur
 * @since 23-10-2015
 */
public class Mentor extends Approver 
{

	@Override
	public void ProcessRequest(int noOfDays) 
	{
		if (noOfDays == 1)
		{
			System.out.println("1 Day Leave GRanted by mentor");
		}
		else if (successor != null)
		{
			successor.ProcessRequest(noOfDays);
		}

	}

}
