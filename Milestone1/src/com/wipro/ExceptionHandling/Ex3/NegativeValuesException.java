package com.wipro.ExceptionHandling.Ex3;

public class NegativeValuesException extends Exception {
	public NegativeValuesException() {
		super();
		System.out.println("NegativeValuesException occured");
	}
}
