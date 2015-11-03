package com.metacube;

public class EmployeeSystemException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeSystemException(String message) {
		super(message);
	}

	public EmployeeSystemException(String message, Throwable cause) {
		super(message, cause);
	}
}
