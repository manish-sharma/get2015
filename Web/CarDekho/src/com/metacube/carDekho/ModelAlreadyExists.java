package com.metacube.carDekho;

public class ModelAlreadyExists extends Exception {
	
	public ModelAlreadyExists(String message) {
		super(message);
	}
	
	public ModelAlreadyExists(String message, Throwable cause) {
		super(message, cause);
	}

}
