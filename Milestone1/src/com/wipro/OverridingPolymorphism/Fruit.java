package com.wipro.OverridingPolymorphism;

public class Fruit {
public String name;
public String taste;
public String size;
Fruit(String n,String t,String s){
	name=n;
	taste=t;
	size=s;
}
  void eat() {
	 System.out.println(name);
	 System.out.println(taste);
 }

}
