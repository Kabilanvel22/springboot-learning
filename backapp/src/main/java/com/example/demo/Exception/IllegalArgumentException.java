package com.example.demo.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.NO_CONTENT)

public class IllegalArgumentException extends Exception{

	
	private static final long serialVersionUID = 1L;

	public IllegalArgumentException(String message) {
		super(message);
	}
	
}
