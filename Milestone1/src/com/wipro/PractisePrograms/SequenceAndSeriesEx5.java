package com.wipro.PractisePrograms;


//Write a method that takes an integer as input and returns the nth term of fibonacci series.

public class SequenceAndSeriesEx5 {
	void fibonacci(int x)
	{
		int a=0;
		int b=1;
		int c=0;
		int count=2;
		
		while(count<x) 
		{
			c=a+b;
			count++;
			
			a=b;
			b=c;
		}
		System.out.println(c);
	}
public static void main(String args[]) 
{
	SequenceAndSeriesEx5  s=new SequenceAndSeriesEx5();
	s.fibonacci(Integer.parseInt(args[0]));
}

}
