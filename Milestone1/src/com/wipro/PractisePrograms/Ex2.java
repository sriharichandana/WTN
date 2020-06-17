package com.wipro.PractisePrograms;


//Sum of squares of first n natural numbers (both using loop and optimized approach)
//Hint: s=n*(n+1)*(2n+1)/6

public class Ex2 {
	int m1(int a) {
		int i,sum=0;
      for(i=1;i<=a;i++) {
    	  sum=sum+(i*i);
      }return sum;
	}
	int m2(int a) {
		int p;
		p=(a*(a+1)*(2*a+1))/6;
		return p;
	}
	public static void main(String args[]) {
		Ex2 n=new Ex2();
		int f=n.m1(Integer.parseInt(args[0]));
		int f1=n.m2(Integer.parseInt(args[0]));
		System.out.println(f);
		System.out.println(f1);
		
		
	}

}
