package com.exception;

public class CarDekhoSystemException extends CarDekhoException {

	public CarDekhoSystemException(String message) {
		super(message);	
	}
	public CarDekhoSystemException(String message ,Throwable cause) {
		super(message ,cause);
	}
}
