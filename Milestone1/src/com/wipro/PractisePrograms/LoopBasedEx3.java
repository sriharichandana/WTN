package com.wipro.PractisePrograms;


//Check whether a given number is prime or not.

public class LoopBasedEx3 {
	int Divisors(int a) 
	{
		int i,c=1;
		if(a==0)
		{
			System.out.println("every integer");
		}
		else
		{
		for(i=1;i<=a/2;i++)
		{
			if(a%i==0) {
				c++;
			}
		}
	    }
		return c;
		}
	public static void main(String args[]) 
	{
		int n=Integer.parseInt(args[0]);
		LoopBasedEx3 l=new LoopBasedEx3();
		int b=l.Divisors(n);
		if(b==2) 
		{
		System.out.println("Prime Number");
		}
		else 
		{
			System.out.println("Not a Prime Number");
		}
		
	}

}
