package com.wipro.flowcontrolstatements;

public class Ex1 {
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		if(a<0)
		{
			System.out.println("Negative Number");
		}
		else if(a==0)
		{
			System.out.println("Zero");
		}
		else
		{
			System.out.println("Positive Number");
		}
	}

}
