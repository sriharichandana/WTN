package com.wipro.patterns;

//4 
//3 3 
//2 2 2 
//1 1 1 1 

public class pattern4 {
	public static void main(String args[]) {
		int i,j;
		int n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			for(j=1;j<i+1;j++)
			{
				System.out.print(n-i+1+" ");
			}System.out.println("");
		}
	}

}
