package com.wipro.PractisePrograms;


//Count the number of digits in a given integer.

public class ModuloLogicEx1 {
	int numberOfDigits(int a)
	{
		int c=0;
		while(a!=0)
		{
			c++;
			a=a/10;
		}return c;
	}
	public static void main(String args[])
	{
		ModuloLogicEx1 m=new ModuloLogicEx1();
		int out=m.numberOfDigits(Integer.parseInt(args[0]));
		System.out.println(out);
	}

}
