package com.metacube;

import org.apache.log4j.Logger;

public class InvalidDataException extends Exception {

	private static final long serialVersionUID = 1L;
	private final static Logger log = Logger.getLogger(InvalidDataException.class);

	 public InvalidDataException(String message) {
		 super(message);
		 log.info(message);
	       
	 }
	 
	 public InvalidDataException(String message, Throwable cause) {
	        super(message, cause);
	        log.info(message+" Caused By "+cause);
	    }
	
	
}
