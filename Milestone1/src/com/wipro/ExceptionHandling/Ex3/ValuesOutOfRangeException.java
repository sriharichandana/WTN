package com.wipro.ExceptionHandling.Ex3;

public class ValuesOutOfRangeException extends Exception {
	public ValuesOutOfRangeException() {
		super();
		System.out.println("ValuesOutOfRangeException occured");
	}
}
