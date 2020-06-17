package com.wipro.PractisePrograms;


//Print all the prime numbers within m and n where m<n.

public class NestedLoopsEx2 {
	void prime(int x,int y) 
	{
		int flag=0;
		if(x>y) 
		{
			System.out.println("please check your numbers");
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
			System.out.println(j);
		}

		}
	}
	public static void main(String args[]) 
	{
		NestedLoopsEx2 a=new NestedLoopsEx2();
		a.prime(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		
	}

}
