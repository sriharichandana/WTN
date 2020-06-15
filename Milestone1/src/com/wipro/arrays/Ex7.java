package com.wipro.arrays;

public class Ex7 {
	public static void main(String args[]) {
		int arr[]=new int[args.length];
		int printArr[]=new int[args.length];
		int i;
		int h[]=new int[20000];
		for(i=0;i<args.length;i++) {
			arr[i]=Integer.parseInt(args[i]);
		}
		
		for(i=0;i<arr.length;i++)
		{h[arr[i]]++;
			if(h[arr[i]]>1) {
			continue;
		    }
		else {System.out.print(arr[i]+" ");
			
			
		}
		}
	}

}
