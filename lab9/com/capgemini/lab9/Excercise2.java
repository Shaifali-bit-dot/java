package com.capgemini.lab9;
import java.util.Scanner;
import java.util.function.Consumer;

interface Test
{
	String testmethod(String str);
}
public class Excercise2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter  any string ");
	String s = sc.next();
	Test s1=(x)->x.replaceAll(".", "$0 ");
	System.out.println("Result:"+s1.testmethod(s));
		
}
}
