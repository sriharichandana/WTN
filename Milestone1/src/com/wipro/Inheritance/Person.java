package com.wipro.Inheritance;

public class Person {
	private String name;
	 
	Person(String n){
		name=n;
	}
	void setString(String name) {
		this.name=name;
	}
	String getString()
	{
		return name;
	}
public String toString() {
	return name;
}

}
