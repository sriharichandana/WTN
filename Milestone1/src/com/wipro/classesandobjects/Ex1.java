package com.wipro.classesandobjects;

public class Ex1 {
	int h,w,d;

    Ex1(int width,int height,int depth)
   {
       h=height;
       w=width;
       d=depth;
   }
   int volume()
   { 
	   int v;
       v=h*w*d;
       return v;
   }
  
   public static void main(String[] args)
   {
   Ex1 bc = new Ex1(8,3,9);
   System.out.println(bc.volume());
   }
}
