package com.wipro.OverridingPolymorphism;

class Apple extends Fruit{
	Apple(String n,String t,String s){
		super(n,t,s);
	}
	 void eat() {
		 System.out.println(name);
		 System.out.println(taste);
	 }
	
	
}
class Orange extends Fruit{
	Orange(String n,String t,String s){
		super(n,t,s);
	}
	 void eat() {
		 
		 System.out.println(name);
		 System.out.println(taste);
	 }
	
	
}

public class Check{
	public static void main(String args[]) {
		Fruit f=new Fruit("fruitName","taste","size");
		f.eat();
		Apple a=new Apple("apple","sweet","big");
		a.eat();
		Orange o=new Orange("orange","sour","medium");
		o.eat();
		
	}
}
