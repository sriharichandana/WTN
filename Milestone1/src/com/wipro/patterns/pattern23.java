package com.wipro.patterns;

//1111
// 222
//  33
//   4

public class pattern23 {
	public static void main(String args[]) {
		int i,j;
		int n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
				
			}
			for(j=1;j<=n-i+1;j++)
			{
				System.out.print(i);
				
			}
			
			
			System.out.println("");
		}
	}

}
