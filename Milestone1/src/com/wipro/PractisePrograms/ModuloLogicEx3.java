package com.wipro.PractisePrograms;


//Reverse the given integer.

public class ModuloLogicEx3 {
	int numberOfDigits(int a) {
		int c=0,p;
		while(a!=0) {
			p=a%10;
			c=c*10+p;
			a=a/10;		
		}return c;
	}
	public static void main(String args[])
	{
		ModuloLogicEx3 m=new ModuloLogicEx3();
		int out=m.numberOfDigits(Integer.parseInt(args[0]));
		System.out.println(out);
	}

}
