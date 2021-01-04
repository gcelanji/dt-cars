package com.gcelanji.dtcars.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class CarDtExceptionHandler {
	
		@ExceptionHandler
		public ResponseEntity<CarDtError> handleException(CarDtNotFoundException exc){
			
			CarDtError error = new CarDtError(
												HttpStatus.NOT_FOUND.value(),
												exc.getMessage(),
												System.currentTimeMillis());
			
			return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
			
		}
		
		@ExceptionHandler
		public ResponseEntity<CarDtError> handleException(Exception exc){

			CarDtError error = new CarDtError(
												HttpStatus.BAD_REQUEST.value(),
												exc.getMessage(),
												System.currentTimeMillis());
			
			return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
			
		}
	
}
