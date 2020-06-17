package com.wipro.PractisePrograms;


//Check whether the given number is Armstrong or not.

public class ModuloLogicEx5 {
	int numberOfDigits(int a) {
		int c=0,sum=0, original=a;
		while(a!=0) {
			c++;
			a=a/10;	
			
		}a=original;
		while(a!=0) {
			sum=sum+(int)Math.pow(a%10, c);
			a=a/10;
		}
		if(original==sum)
		return 1;
		else
		return 0;
	}
	public static void main(String args[])
	{
		ModuloLogicEx5 m=new ModuloLogicEx5();
		int out=m.numberOfDigits(Integer.parseInt(args[0]));
		if(out==1)
		System.out.println("ArmStrong number");
		else
			System.out.println("not an ArmStrong number");
		
	}

}
