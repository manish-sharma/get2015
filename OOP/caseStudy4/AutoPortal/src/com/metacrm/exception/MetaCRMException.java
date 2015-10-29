package com.metacrm.exception;

public class MetaCRMException extends Exception {
	
	public MetaCRMException(String message) {
		super(message);
	}
	
	public MetaCRMException(String message, Throwable cause) {
		super(message, cause);
	}

}
