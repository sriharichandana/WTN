package com.wipro.PractisePrograms;


//Print those numbers from 1 to n which do not occur in the fibonacci series.

import java.lang.Math;
public class SequenceAndSeriesEx4 {
	void fibonacci(int x)
	{
		int i;
		for(i=1;i<=x;i++)
		{
		int p=5*i*i+4,q=5*i*i-4,d1,d2;
		d1=(int)Math.sqrt(p);
		d2=(int)Math.sqrt(q);
		if(p==d1*d1||q==d2*d2)
		{
			continue;
		}
		else 
		{
			System.out.print(i+" ");
		}
	}
	}
	
public static void main(String args[])
{
	SequenceAndSeriesEx4 n=new SequenceAndSeriesEx4();
	n.fibonacci(Integer.parseInt(args[0]));
	
}

}
