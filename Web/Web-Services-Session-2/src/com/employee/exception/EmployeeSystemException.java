package com.employee.exception;
/**
 * Name: EmployeeSystemException
 * @author Gaurav Saini
 * Since: 2 November,2015
 * Description: Employee System Exception is Handled 
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
