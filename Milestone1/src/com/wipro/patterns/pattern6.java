package com.wipro.patterns;

//4 
//4 3 
//4 3 2 
//4 3 2 1 

public class pattern6 {
	public static void main(String args[]) {
		int i,j;
		int n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			for(j=1;j<i+1;j++)
			{
				System.out.print(n-j+1+" ");
			}
			System.out.println("");
		}
	}

}
