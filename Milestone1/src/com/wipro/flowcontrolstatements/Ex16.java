package com.wipro.flowcontrolstatements;

public class Ex16 {
	public static void main(String args[]) {
		int x=Integer.parseInt(args[0]),y=0;
		int i;
		for(i=0;x!=0;i++)
		{ 
			y=x%10;
			 
			x=x/10;
			System.out.print(y);	
			
		}
	}

}
