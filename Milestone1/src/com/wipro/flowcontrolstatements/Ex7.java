package com.wipro.flowcontrolstatements;

public class Ex7 {
	public static void main(String args[])
	{
		char s=args[0].charAt(0);
		if(s>='a'&&s<='z')
		{
			System.out.println(Character.toUpperCase(s));
		}
		else
		{
			System.out.println(Character.toLowerCase(s));
		}
	}

}
