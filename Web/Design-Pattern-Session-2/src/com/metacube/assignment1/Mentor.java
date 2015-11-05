package com.metacube.assignment1;

/**
 * Name: Mentor
 * @author Gaurav Saini
 * Since: 22 October,2015
 * Description: Extends the Approver and allots 1 day leave
 **/
public class Mentor extends Approver 
{
	/**
	 * Name: ProcessRequest
	 * Description: Takes the input and allots one day leave
	 **/
	@Override
	public void ProcessRequest(int noOfDays) 
	{	
		// Checks for the days
		if (noOfDays == 1)
		{
			System.out.println("1 Day Leave Granted by mentor");
		}
		else if (successor != null)
		{
			successor.ProcessRequest(noOfDays);
		}
	}
}
