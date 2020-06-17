package com.wipro.PractisePrograms;


//Sum of cubes of first n natural numbers(both using loop and optimized approach)
//Hint: (n*(n+1)/2)^2

public class Ex3 {
	int m1(int a) 
	{
		int i,sum=0;
      for(i=1;i<=a;i++)
      {
    	  sum=sum+(i*i*i);
      }
      return sum;
	}
	int m2(int n) 
	{
		int p;
		p=(n*n*(n+1)*(n+1))/4;
		return p;
	}
	public static void main(String args[]) 
	{
		Ex3 n=new Ex3();
		int f=n.m1(Integer.parseInt(args[0]));
		int f1=n.m2(Integer.parseInt(args[0]));
		System.out.println(f);
		System.out.println(f1);
		
		
	}

}
