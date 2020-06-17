package com.wipro.PractisePrograms;


//Given the values of a and d. Print the first n terms of an Arithmetic progression.

public class SequenceAndSeriesEx6 {
	void ex(int initial, int difference,int n) {
		int i;
		int a=initial;
		int d=difference;
		System.out.println(a);
		for(i=1;i<n;i++)
		{
			a+=d;
			System.out.println(a);
		}
	}
	public static void main(String args[]) {
		
		SequenceAndSeriesEx6 s=new SequenceAndSeriesEx6();
		s.ex(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
	}
}
