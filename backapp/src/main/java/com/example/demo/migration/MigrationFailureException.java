package com.example.demo.migration;

public class MigrationFailureException extends RuntimeException {

	
	private static final long serialVersionUID = 2802020202429564881L;

    public MigrationFailureException(String msg, Throwable cause) {
        super(msg, cause);
    }
	
}
