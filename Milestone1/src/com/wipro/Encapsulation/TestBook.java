package com.wipro.Encapsulation;

public class TestBook {
	public static void main(String[] args) {
	    
	      Author auth = new Author("Chandana", "chandana@email.com", 'F');
	 
	     
	      Book book = new Book("Java for beginners", auth, 9.99, 99);
	   
	      System.out.println("name is: " + book.getName());
	    
	      System.out.println("price is: " + book.getPrice());
	   
	      System.out.println("qty is: " + book.getQty());  
	  
	      System.out.println("author's name is: " + book.getAuthor().getName());
	    
	      System.out.println("author's email is: " + book.getAuthor().getEmail());
	  
	      System.out.println("author's gender is: " + book.getAuthor().getGender());
	      
	     
	   }

}
