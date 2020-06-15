package com.wipro.flowcontrolstatements;

public class Ex3 {
	public static void main(String args[])
	{
		int i;
		
			if(args.length==0)
			{
				System.out.println("No Value");
			}
			else
			{
				for(i=0;i<(args.length-1);i++)
				{
				System.out.print(args[i]+",");
			}
				System.out.print(args[args.length-1]);
			}
	}

}
