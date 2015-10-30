package com.metacube.carDekho;

public class InvalidAdmin extends Exception{

	public InvalidAdmin(String message) {
		super(message);
	}
	
	public InvalidAdmin(String message , Throwable cause) {
		super(message, cause);
	}
}
