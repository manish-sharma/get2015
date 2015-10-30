package com.metacube.carDekho;

public class CarIsNotExistException extends Exception {
	 public CarIsNotExistException(String message) {
		 super(message);
	 }
	 
	 public CarIsNotExistException(String message, Throwable cause) {
		 super(message, cause);
	 }
}
