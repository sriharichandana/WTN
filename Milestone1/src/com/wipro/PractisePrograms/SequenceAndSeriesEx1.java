package com.wipro.PractisePrograms;


//Check if a given number is fibonacci number or not.

import java.lang.Math;
public class SequenceAndSeriesEx1 {
	int fibonacci(int x) 
	{
		int a=5*x*x+4,b=5*x*x-4,d1,d2;
		d1=(int)Math.sqrt(a);
		d2=(int)Math.sqrt(b);
		if(a==d1*d1||b==d2*d2)
		{
			return 1;
		}
		else 
		{
			return 0;
		}
	}
	
public static void main(String args[]) 
{
	SequenceAndSeriesEx1 s=new SequenceAndSeriesEx1();
	int n=s.fibonacci(Integer.parseInt(args[0]));
	if(n==1) 
	{
		System.out.println("Fibonacci");
	}
	else 
	{
		System.out.println("Not Fibonacci");	
	}
}

}
