package com.wipro.arrays;
import java.util.Arrays;
public class Ex6 {
	public static void main(String args[]) {
		int arr[]=new int[args.length];
		int i;
		for(i=0;i<args.length;i++) {
			arr[i]=Integer.parseInt(args[i]);
			
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
