package com.wipro.patterns;

//1 
//2 2 
//3 3 3 
//4 4 4 4 

public class pattern3 {
	public static void main(String args[]) {
		int i,j;
		int n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			for(j=1;j<i+1;j++)
			{
				System.out.print(i+" ");
			}System.out.println("");
		}
	}

}
