package com.wipro.PractisePrograms;


//Given the values of a and r. Print the first n terms of Geometric Progression.

public class SequenceAndSeriesEx8 {
	void ex(int initial, int ratio,int n) {
		int i;
		int a=initial;
		int d=ratio;
		System.out.println(a);
		for(i=1;i<n;i++)
		{
			a*=d;
			System.out.println(a);
		}
	}
	public static void main(String args[]) {
		
		SequenceAndSeriesEx8 s=new SequenceAndSeriesEx8();
		s.ex(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
	}

}
