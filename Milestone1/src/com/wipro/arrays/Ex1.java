package com.wipro.arrays;

public class Ex1 {
	public static void main(String args[]) {
		int arr[]=new int[args.length];
		for(int i=0;i<args.length;i++) {
			arr[i]=Integer.parseInt(args[i]);
		}
		int sum=0;
		double avg=0.0;
		for(int i=0; i<arr.length;i++)
		{
			sum+=arr[i];
		}
		avg=(double)sum/arr.length;
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
	}

}
