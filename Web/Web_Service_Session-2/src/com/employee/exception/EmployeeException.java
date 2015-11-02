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
