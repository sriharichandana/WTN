package com.wipro.Abstraction;

import java.util.Random;

public class TestCompartment {
	public static void main(String args[]) {
		Random rand= new Random();
		int i=0;
		Compartment[] c=new Compartment[10];
		 for (i = 0; i < 10; i++) {
		    	int randomNum = rand.nextInt(4) + 1;
		    	
		    	if (randomNum == 1)
		    		c[i] = new FirstClass();
		    	else if (randomNum == 2)
		    		c[i] = new Ladies();
		    	else if (randomNum == 3)
		    		c[i] = new General();
		    	else if (randomNum == 4)
		    		c[i] = new Luggage();
		    	
		    	System.out.println(c[i].notice());
		    }
		
		}
		
		
	}