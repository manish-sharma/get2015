package com.metacube.assignment1;

/**
 * Name: SeniorMentor
 * @author Gaurav Saini
 * Since: 22 October,2015
 * Description: Extends the Approver and allots 1 day leave
 **/
public class SeniorMentor extends Approver 
{
	/**
	 * Name: ProcessRequest
	 * Description: Takes the input and allots one day leave
	 **/
	@Override
	public void ProcessRequest(int noOfDays) 
	{
		// no of days = 2
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