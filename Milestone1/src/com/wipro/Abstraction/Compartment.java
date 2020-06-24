package com.wipro.Abstraction;

import java.util.Random;
abstract class Compartment{
	public abstract String notice();
}
class FirstClass extends Compartment{
	public String notice(){
		
		return "This is First class compartment";
	}
}
class Ladies extends Compartment{
	public String notice(){
		
		return "This is Ladies compartment";
	}
}
class General extends Compartment{
	public String notice(){
		
		return "This is General compartment";
	}
}
class Luggage extends Compartment{
	public String notice(){
		
		return "This is Luggage compartment";
	}
}



