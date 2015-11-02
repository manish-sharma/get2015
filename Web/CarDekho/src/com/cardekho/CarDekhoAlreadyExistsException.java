package com.cardekho;

public class CarDekhoAlreadyExistsException extends Exception {
	public CarDekhoAlreadyExistsException(String message) {
		super(message);
	}

	public CarDekhoAlreadyExistsException(String message, Throwable cause) {
		super(message, cause);
	}
}
