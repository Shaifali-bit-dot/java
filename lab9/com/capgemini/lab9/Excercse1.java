package com.capgemini.lab9;
import java.util.Scanner;

interface Tester
{
	double power(int x,int y);

}
public  class Excercse1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x:");
		int a=sc.nextInt();
		System.out.println("Enter value of y:");
		int b=sc.nextInt();
		Tester m3=(x,y)->Math.pow(x,y);
		double x=m3.power(a,b);
		System.out.print("the power of x^y is:"+x);

	}


}
