package com.wipro.PractisePrograms;


//Digit Frequency
//Consider a number n and a digit as inputs. Determine how many times d occurs in n.

public class ModuloLogicEx6 {
	int numberOfDigits(int a,int b) {
		int c=0,p;
		while(a!=0) {
			p=a%10;
			if(p==b) {
				c++;
			}
			a=a/10;		
		}
		return c;
	}
	public static void main(String args[])
	{
		ModuloLogicEx6 m=new ModuloLogicEx6();
		int number=Integer.parseInt(args[0]);
		int searchDigit=Integer.parseInt(args[1]);
		int out=m.numberOfDigits(number,searchDigit);
		System.out.println(searchDigit+" occurs "+out+" times in "+number);
	}

}
