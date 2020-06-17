package com.wipro.PractisePrograms;


//Check whether the given integer is palindrome or not.

public class ModuloLogicEx4 {
	int numberOfDigits(int a) 
	{
		int c=0,p, original=a;
		while(a!=0)
		{
			p=a%10;
			c=c*10+p;
			a=a/10;		
		}
		if(original==c)
		return 1;
		else
		return 0;
	}
	public static void main(String args[])
	{
		ModuloLogicEx4 m=new ModuloLogicEx4();
		int out=m.numberOfDigits(Integer.parseInt(args[0]));
		if(out==1)
		System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		
	}

}
