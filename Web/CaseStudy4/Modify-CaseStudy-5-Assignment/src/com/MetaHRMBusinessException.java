package com;

public class MetaHRMBusinessException extends MetaHRMException {

	
	private static final long serialVersionUID = 1L;

	public MetaHRMBusinessException(String message) {
		super(message);
	}
	
	public MetaHRMBusinessException(String message, Throwable cause) {
		super(message, cause);
	}

}
