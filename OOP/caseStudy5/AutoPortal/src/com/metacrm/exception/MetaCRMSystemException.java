package com.metacrm.exception;

/**
 * This class is responsible for handeling the exceptions of the system 
 * 
 * @author Riddhi
 *
 */
public class MetaCRMSystemException extends MetaCRMException {

	public MetaCRMSystemException(String message) {
		super(message);
	}

	public MetaCRMSystemException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
