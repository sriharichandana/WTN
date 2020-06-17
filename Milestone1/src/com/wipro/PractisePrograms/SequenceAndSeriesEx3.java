package com.wipro.PractisePrograms;


//Print the first n terms of fibonacci series.
//Ex: if n=10,then
//Output: 0,1,1,2,3,5,8

public class SequenceAndSeriesEx3 {
	void fibonacci(int x)
	{
		int a=0;
		int b=1;
		int c=0;
		int count=2;
		System.out.print(a+" ");
		System.out.print(b+" ");
		while(count<x) {
			c=a+b;
			count++;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
public static void main(String args[]) 
{
	SequenceAndSeriesEx3 n=new SequenceAndSeriesEx3();
	n.fibonacci(Integer.parseInt(args[0]));
}

}
