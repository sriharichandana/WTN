package com.wipro.PractisePrograms;


//Number to word conversion.

public class ModuloLogicEx7 {
	String numberOfDigits(int a) {
		int c=0,p,b;
		String last="";
		while(a!=0) {
			p=a%10;
			c=c*10+p;
			a=a/10;		
		}while(c!=0)
		{b=c%10;
		switch(b) {
		case 1: last=last+"ONE ";
		break;
		case 2: last=last+"TWO ";
		break;
		case 3: last=last+"THREE ";
		break;
		case 4: last=last+"FOUR ";
		break;
		case 5: last=last+"FIVE ";
		break;
		case 6: last=last+"SIX ";
		break;
		case 7: last=last+"SEVEN ";
		break;
		case 8: last=last+"EIGHT ";
		break;
		case 9: last=last+"NINE"
				+ " ";
		break;
			
		}
		c=c/10;
		}
		return last;
	}
	public static void main(String args[])
	{
		ModuloLogicEx7 m=new ModuloLogicEx7();
		String out=m.numberOfDigits(Integer.parseInt(args[0]));
		System.out.println(out);
	}

}
