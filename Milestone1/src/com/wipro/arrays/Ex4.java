package com.wipro.arrays;

import java.util.Arrays;
public class Ex4 {
	public static void main(String args[])
	{
		int arr[]=new int[args.length];
		char charArr[]=new char[args.length];
		int i;
		for(i=0;i<args.length;i++) {
			arr[i]=Integer.parseInt(args[i]);
		}
		for(i=0;i<arr.length;i++)
		{
			charArr[i]=(char)arr[i];
		}
		System.out.println(Arrays.toString(charArr));
	}

}
