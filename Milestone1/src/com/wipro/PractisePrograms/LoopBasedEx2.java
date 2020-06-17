package com.wipro.PractisePrograms;


//Count all the divisors of a given number.
//Ex: n=10 has 4 divisors.

public class LoopBasedEx2 {
	int Divisors(int n) 
	{
		int i,c=1;
		if(n==0) 
		{
			System.out.println("every integer");
		}
		else
		{
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0) {
				c++;
			}
		}
	    }
		return c;
		}
	public static void main(String args[]) 
	{
		int n=Integer.parseInt(args[0]);
		LoopBasedEx2 m=new LoopBasedEx2();
		System.out.println(m.Divisors(n));
		
	}


}
