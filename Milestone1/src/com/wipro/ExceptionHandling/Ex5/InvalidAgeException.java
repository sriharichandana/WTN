package com.wipro.ExceptionHandling.Ex5;

public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super();
		System.out.println("Invalid age");
	}
}
