package com.wipro.patterns;

//4444
// 333
//  22
//   1

public class pattern24 {
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
				System.out.print(n-i+1);
				
			}
			
			
			System.out.println("");
		}
	}

}
