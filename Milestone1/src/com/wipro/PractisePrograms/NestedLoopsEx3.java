package com.wipro.PractisePrograms;


//Print all the prime numbers within m and n where m<n.

public class NestedLoopsEx3 {
	int prime(int x,int y) {
		int flag=0,c=0;
		if(x>y) {
			System.out.println("please check your numbers");
		}if(x==1) {
			x++;
		}
		for(int j=x;j<=y;j++) 
		{
			flag=0;
			for(int i=2;i<=j/2;i++)
			{
				if(j%i==0)
				{
					flag=1;
					break;
				}
			}
			
		if(flag==0)
		{
			c++;
		}

		}
		return c;
	}
	public static void main(String args[])
	{
		NestedLoopsEx3 a=new NestedLoopsEx3();
		System.out.println(a.prime(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		
	}

}
