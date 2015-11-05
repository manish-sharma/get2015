package com.employee.exception;
/**
 * Name: EmployeeException
 * @author Gaurav Saini
 * Since: 2 November,2015
 * Description: Employee Exception 
 **/
public class EmployeeException extends Exception
{
	// Constructor
	public EmployeeException(String message)
	{
		super(message);
	}
	// Constructor 
	public EmployeeException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
