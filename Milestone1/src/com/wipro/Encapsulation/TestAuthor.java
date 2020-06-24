package com.wipro.Encapsulation;

public class TestAuthor {
	 public static void main(String[] args) {
	   
	      Author auth = new Author("Chandana", "chandana@email.com", 'F');
	     
	      System.out.println("Name is: " + auth.getName());
	
	      System.out.println("Gender is: " + auth.getGender());
	  
	      System.out.println("Email is: " + auth.getEmail());
	    
	   }

}
