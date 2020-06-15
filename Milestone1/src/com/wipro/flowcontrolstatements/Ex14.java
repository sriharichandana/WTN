package com.wipro.flowcontrolstatements;

public class Ex14 {
	public static void main(String args[]) {
		int x=Integer.parseInt(args[0]),sum=0,y=0;
		int i;
		for(i=0;x!=0;i++)
		{ 
			y=x%10;
			 sum+=y;
			x=x/10;	
		}
		System.out.println(sum);
	}

}
