package com.wipro.arrays;

public class Ex2 {
	public static void main(String args[])
	{
		int arr[]=new int[args.length];
		for(int i=0;i<args.length;i++) {
			arr[i]=Integer.parseInt(args[i]);
		}
		int max=arr[0],min=arr[0];
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]>=max)
			{
				max=arr[i];
			}
			if(arr[i]<=min)
			{
				min=arr[i];
			}
		}
		System.out.println("min="+min+"  max="+max);
		
	}

}
