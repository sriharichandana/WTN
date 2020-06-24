package com.wipro.classesandobjects;
import java.lang.Math;
public class Ex2 {
	static double powerInt(int num1,int num2)
	{
		return Math.pow(num1,num2);
	}
	static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1,num2);
	}

	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[3]);
		double d=Double.parseDouble(args[2]);
		System.out.println(Ex2.powerInt(a,b));
		System.out.println(Ex2.powerDouble(d,c));
		
	}
}
