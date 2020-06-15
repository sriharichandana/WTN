package com.wipro.flowcontrolstatements;

public class Ex17 {
	public static void main(String args[]){
		
		int x=Integer.parseInt(args[0]),sum=0,y=0,p;
		p=x;
			
		while(x!=0) {
			y=x%10;
			sum=(sum*10)+y;
			x=x/10;
		}if(p==sum) {
			System.out.println("palindrome");
			
		}else {
			System.out.println("not palindrome");
		}
	}

}
