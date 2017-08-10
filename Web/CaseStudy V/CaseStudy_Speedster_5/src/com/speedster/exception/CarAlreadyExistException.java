package com.speedster.exception;

/**
 * @author Anjita
 */
public class CarAlreadyExistException extends CarDekhoException {
	
	private static final long serialVersionUID = 1L;

	public CarAlreadyExistException(String message) {
		super(message);
	}

	public CarAlreadyExistException(String message, Throwable cause) {
		super(message, cause);
	}
}
