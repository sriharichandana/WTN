package com.wipro.flowcontrolstatements;

public class Ex5 {
	public static void main(String args[])
	{
		char ch = args[0].charAt(0);
		if(ch>='a'&&ch<='z'|| ch>='A'&&ch<='Z')
		{
			System.out.println("Alphabet");
		}
		else if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0')
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
	}

}
