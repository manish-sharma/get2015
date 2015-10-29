package com.exception;

public class CarDekhoCarAlreadyExistException extends CarDekhoSystemException {

public CarDekhoCarAlreadyExistException(String message) {
	super(message);
}
public CarDekhoCarAlreadyExistException(String message ,Throwable cause) {
          super(message, cause);
}
}
