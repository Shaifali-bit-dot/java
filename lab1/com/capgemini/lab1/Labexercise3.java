package com.capgemini.lab1;

import java.util.Scanner;

class Labexercise3 {
	public static void main(String args[ ]) {
		Scanner input=new Scanner(System.in);
		int i,a=1,b=1,c=0,t;
		System.out.println("Entere of t:");
		t=input.nextInt();
		System.out.print(a);
		System.out.print(" "+b);
		for(i=0;i<t-2;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
		System.out.println();
		System.out.print(t+"the of the series is: "+c);
	}
}
