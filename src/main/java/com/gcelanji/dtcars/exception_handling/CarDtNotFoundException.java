package com.gcelanji.dtcars.exception_handling;

public class CarDtNotFoundException extends RuntimeException{

	public CarDtNotFoundException() {
		
	}

	public CarDtNotFoundException(String message) {
		super(message);
		
	}

	public CarDtNotFoundException(Throwable cause) {
		super(cause);
		
	}

	public CarDtNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public CarDtNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}
	
}
