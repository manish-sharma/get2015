package com.employee.exception;
/**
 * EmployeeSystemException
 * @author Ankur
 * Since: 2 November,2015
 *  Employee System Exception is Handeled 
 **/
public class EmployeeSystemException extends EmployeeException 
{
	public EmployeeSystemException(String message)
	{
		super(message);
	}

	public EmployeeSystemException(String message, Throwable cause) 
	{
		super(message, cause);
	}
	
}
