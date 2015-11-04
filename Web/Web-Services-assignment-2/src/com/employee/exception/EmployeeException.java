package com.employee.exception;
/**
 * EmployeeException
 * @author Ankur
 * Since: 2 November,2015
 *  Employee Exception 
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
