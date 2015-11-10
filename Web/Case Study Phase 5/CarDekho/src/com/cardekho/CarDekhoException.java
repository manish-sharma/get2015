package com.cardekho;

public class CarDekhoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CarDekhoException(String message) {
		super(message);
	}
	
	public CarDekhoException(String message, Throwable cause) {
		super(message, cause);
	}

}
