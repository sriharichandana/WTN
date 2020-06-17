package com.wipro.PractisePrograms;


//Check whether the given number is perfect number or not.

public class LoopBasedEx4 {
	int Divisors(int n) 
	{
		int i,sum=0;
		if(n==0) 
		{
			System.out.println("perfect number");
		}
		else 
		{
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0) 
			{
				sum+=i;
			}
		}
	    }
		return sum;
	}
	public static void main(String args[]) 
	{
		int n=Integer.parseInt(args[0]);
		LoopBasedEx4 l=new LoopBasedEx4();
		int a=l.Divisors(n);
		if(a==n) {
			System.out.println("Perfect number");
		}
		else{
			System.out.println("Not a Perfect Number");
		}
		
	}

}
