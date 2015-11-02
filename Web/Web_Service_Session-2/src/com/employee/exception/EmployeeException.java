/**
 * @author Ravika JAin
 * @since 02/11/2015
* it will handle all the system exception 
 */
package com.employee.exception;

public class EmployeeException extends Exception {
	private static final long serialVersionUID = 1L;

	public EmployeeException(String message) {
		super(message);
	}

	public EmployeeException(String message, Throwable cause) {
		super(message, cause);
	}
}
