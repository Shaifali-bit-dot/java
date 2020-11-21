package com.capgemini.lab1;
public class Labexercise2{

   public static void main(String args[]){
      char ch='r';
      switch(ch)
      {
	 case 'r':
	   System.out.println("Stop ");
	   break;
	 case 'y':
	   System.out.println("Wait");
	   break;
	 case 'g':
	   System.out.println("Go ");
	   break;
	 default:
	   System.out.println("Default ");
      }
   }
}