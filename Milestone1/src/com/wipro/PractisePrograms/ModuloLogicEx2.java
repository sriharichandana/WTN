package com.wipro.PractisePrograms;


//Print the sum of digits in a given integer.

public class ModuloLogicEx2 {
	int numberOfDigits(int a)
	{
		int c=0,x;
		while(a!=0)
		{  x=a%10;
			c=c+x;
			a=a/10;
		}
		return c;
	}
	public static void main(String args[])
	{
		ModuloLogicEx2 m=new ModuloLogicEx2();
		int out=m.numberOfDigits(Integer.parseInt(args[0]));
		System.out.println(out);
	}

}
