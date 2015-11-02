package com.employee.exception;

public class EmployeeSystemException extends EmployeeException {
	private static final long serialVersionUID = 1L;

	public EmployeeSystemException(String message) {
		super(message);
	}

	public EmployeeSystemException(String message, Throwable cause) {
		super(message, cause);
	}

}
