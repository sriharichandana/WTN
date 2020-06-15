package com.wipro.arrays;

public class Ex3 {
	public static void main(String args[]) 
	{
		int[] arr=new int[]{1,5,45,12,67,23,90};
		int x=Integer.parseInt(args[0]),flag=0,c=0;
        for(int i=0;i<arr.length;i++) 
        {
        	if(x==arr[i]) 
        	{
        		flag=1;
        		c=i;
        		break;
        	}
        }
        if(flag==0)
        {
        	System.out.println("-1");
        }
        else 
        {
        	System.out.println(c);
        }

}

}
