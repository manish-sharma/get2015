package com.metacrm.exception;

/**
 * This class is responsible for handeling the exceptions 
 * 
 * @author Riddhi
 *
 */
public class MetaCRMException extends Exception {
	
	public MetaCRMException(String message) {
		super(message);
	}
	
	public MetaCRMException(String message, Throwable cause) {
		super(message, cause);
	}

}
