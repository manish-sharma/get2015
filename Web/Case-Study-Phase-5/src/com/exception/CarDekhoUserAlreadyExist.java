package com.exception;

public class CarDekhoUserAlreadyExist extends CarDekhoSystemException {
	
	public CarDekhoUserAlreadyExist(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	public CarDekhoUserAlreadyExist(String message , Throwable cause) {
		super(message, cause);
	}
}
