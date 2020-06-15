package com.wipro.arrays;

public class Ex8 {
	public static void main(String args[])
	{
		int arr[]=new int[args.length];
		int i,sum=0,j;
		for(i=0;i<args.length;i++) {
			arr[i]=Integer.parseInt(args[i]);
		}
		for(i=0;i<arr.length;i++) {
			if(arr[i]==6&&i!=arr.length-1)
			{
				for(j=i;j<arr.length;j++)
				{
					if(arr[j]==7)
					{
						i=j+1;
						
					}
					
				}
			}
			sum=sum+arr[i];
		}System.out.println(sum);
	}

}
