package com.wipro.PractisePrograms;


//Print the fibonacci series upto given n.
//For ex: if n=10, then 
//Output: 0,1,1,2,3,5,8

public class SequenceAndSeriesEx2 {
	void fibonacci(int n)
	{
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		while(a+b<=n) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
public static void main(String args[]) 
{
	SequenceAndSeriesEx2 a=new SequenceAndSeriesEx2();
	a.fibonacci(Integer.parseInt(args[0]));
}

}
