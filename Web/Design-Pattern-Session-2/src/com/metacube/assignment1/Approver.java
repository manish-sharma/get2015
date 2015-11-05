package com.metacube.assignment1;

/**
 * Name: Approver
 * @author Gaurav Saini
 * Since: 22 October,2015
 * Description: Approves the Request And allots the successor
 **/
abstract class Approver 
{
	// Object Creation
	protected Approver successor;
	/**
	 * Name:SetScccessor
	 * @param successor
	 * Description: Sets The Successor
	 **/
	public void SetSuccessor(Approver successor) 
	{
		this.successor = successor;
	}
	// Process The Requests
	public abstract void ProcessRequest(int noOfDays);
}