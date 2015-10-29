package com.exception;

public class CarDekhologinException extends CarDekhoSystemException {
 public CarDekhologinException(String message) {
	super(message);
}
    public CarDekhologinException(String message ,Throwable cause) {
		super(message, cause);
	}
}
