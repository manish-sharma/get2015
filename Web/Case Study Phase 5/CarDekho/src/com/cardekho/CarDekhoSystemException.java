package com.cardekho;

public class CarDekhoSystemException extends CarDekhoException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CarDekhoSystemException(String message) {
		super(message);
	}

	public CarDekhoSystemException(String message, Throwable cause) {
		super(message, cause);
	}
}
