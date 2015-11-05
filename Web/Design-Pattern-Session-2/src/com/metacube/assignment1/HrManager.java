package com.metacube.assignment1;

/**
 * Name: HrManager
 * @author Gaurav Saini
 * Since: 22 October,2015
 * Description: Extends the Approver and allots 1 day leave
 **/
public class HrManager extends Approver 
{
	/**
	 * Name: ProcessRequest
	 * Description: Takes the input and allots one day leave
	 **/
	@Override
	public void ProcessRequest(int noOfDays) 
	{
		// no of days=5
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