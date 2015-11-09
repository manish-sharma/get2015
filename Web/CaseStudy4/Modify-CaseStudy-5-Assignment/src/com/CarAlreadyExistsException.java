package com;

public class CarAlreadyExistsException extends Exception {

	private static final long serialVersionUID = 1L;

	public CarAlreadyExistsException(String message) {
		super(message);
	}

	public CarAlreadyExistsException(String message, Throwable cause) {
		super(message, cause);
	}
}
