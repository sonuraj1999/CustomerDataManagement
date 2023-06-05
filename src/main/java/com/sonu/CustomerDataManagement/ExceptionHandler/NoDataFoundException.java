package com.sonu.CustomerDataManagement.ExceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class NoDataFoundException extends RuntimeException{
	public String message ="No data found for the given req";
	
	public NoDataFoundException() {
		
	}
	public NoDataFoundException(String message) {
		this.message=message;
		
	}

	@Override
	public String getMessage() {
		return message;
	}
	
}
